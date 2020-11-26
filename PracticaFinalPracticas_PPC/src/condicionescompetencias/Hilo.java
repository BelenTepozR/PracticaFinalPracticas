package condicionescompetencias;
/**
 *
 * @author btepozromero
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
public class Hilo extends Thread {
        private JTextArea area;
        private RCompartido rc;
        private boolean pausado = false;   
        private boolean corriendo = true;   
        private int numHilo0;
        private final static int ini = 100;
        private final static int fin = 2000;
        private boolean dead;
        private Interrupcion[] inter;
        private int flag;
          private Dekker dekker, d;
        Hilo(JTextArea area, RCompartido rC, int num, int flag){
                this.area = area;
                this.rc= rC;
                this.setName(" Perrito " + num );
                 this.numHilo0 = num;
                 this.flag = flag;
        }
        Hilo(JTextArea area, RCompartido rc, int n, Dekker d, Dekker dp,int flag){
        this.area = area;
        this.rc = rc;
        this.setName("Perrito" + n);
        this.numHilo0= n;
        this.dekker = dp;
        this.d=d;
         this.flag = flag;
    }
        public void run(){
                while(true){
                        
                        switch(this.flag){
                                case 0:
                                       CondicionesCompetencia();
                                        break;
                               case 1:
                                       DesactivacionInterrupciones();
                                        break;
                               case 2:
                                       VariableCerradura();
                                       break;
                               case 3:
                                       Mutex();
                                       break;
                               case 4:
                                       Dekker();
                                       break;
                               case 5:
                                       Dijkstra();
                                       break;
                        }
                        synchronized(this){
                                if(!corriendo)
                                    try {
                                            join();
                                } catch (InterruptedException ex) {
                                        Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }         
                }
        }
      private void CondicionesCompetencia(){
                try{
                        SeccionCritica(this.getName());
                        sleep(1000);
                }catch(Exception e){e.printStackTrace();
                }
      }
      private void DesactivacionInterrupciones(){
              try{
                if(rc.isEntra()){
                        rc.bloquea(numHilo0);
                        SeccionCritica(this.getName());   
                        Matar(); 
                        rc.desbloquea();
                }else
                        area.append("En espera" + "\n");  
                Thread.sleep((int)(ini + Math.random()*fin));
             }catch(Exception e){e.printStackTrace();}
       }
      private void VariableCerradura(){
              try{
                if(rc.isEntraC()){
                         rc.getC().Bloquea();
                        SeccionCritica(this.getName());
                         Thread.sleep((int)(ini + Math.random()*fin));
                        if(this.dead)
                           Matar();   
                        rc.getC().Desbloquea();                                              
                     }else
                          area.append("En espera" + "\n");               
                   Thread.sleep((int)(ini + Math.random()*fin));
              }catch(Exception e){e.printStackTrace();}
      }
      private void Mutex(){
              try{                
                        try{
                           if(rc.isEntraM()){
                                rc.getM().lock();
                                SeccionCritica(this.getName());
                                 Matar(); 
                           }else
                                    area.append("En espera" + "\n");  
                        }finally{
                             rc.getM().unlock();
                        }   
                        Thread.sleep((int)(ini + Math.random()*fin));
              }catch(Exception e){e.printStackTrace();}
      }
      private void Dekker(){
              try{
                        if(dekker.getTurno() != 0 ){
                           if(d.getTurno() != 0){    
                                SeccionCritica(this.getName());
                                d.setTurno(0); dekker.setTurno(1);
                           }else{
                                SeccionCritica(this.getName());
                                d.setTurno(1);
                                dekker.setTurno(1);
                           }                   
                        }else{
                             if(d.getTurno() != 0){                                   
                                SeccionCritica(this.getName());
                                d.setTurno(0);  dekker.setTurno(0);                              
                             }else{
                                SeccionCritica(this.getName());
                                d.setTurno(1); dekker.setTurno(0);                             
                             }                              
                        }
                         Matar(); 
                        Thread.sleep((int)(ini + Math.random()*fin));
                }catch(Exception e){
                  System.out.println(e.getMessage());
                } 
      }
      private void Dijkstra(){       
        int numHilo = numHilo0 -1;
         try{
             while(true){
                int j, k = 0;
                rc.getDi().setB(false, numHilo);
                do{
                    rc.getDi().setC(true, numHilo);
                    if(rc.getDi().getB()[k])
                        k = numHilo;
                }while(k != numHilo);
                rc.getDi().setC(false, numHilo);
                for(j = 0; j< 4; j++)
                    if(j != numHilo && !rc.getDi().getC()[j])
                            break;
                if(!rc.getDi().getB()[numHilo] && !rc.getDi().getC()[numHilo]){
                        rc.getDi().setB(true, numHilo);
                        rc.getDi().setC(true, numHilo);
                        SeccionCritica(this.getName());                      
                }
                Matar(); 
               Thread.sleep((int)(ini + Math.random()*fin));           
             }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }    
      }
      private void Matar(){
               if(isDead()){
                        area.append(rc.getDatoCompartido()+" Me matan ... \n");
                        stop(); 
                }  
      }
      private void SeccionCritica(String name){
              try{
                rc.setDatoCompartido(name);
                area.append(rc.getDatoCompartido()+": entra... \n"); 
              }catch(Exception e){e.printStackTrace();}
      }
     public boolean isDead() {
                return dead;
        }

        public void setDead(boolean dead) {
                this.dead = dead;
        }

        public Interrupcion[] getInter() {
                return inter;
        }

        public void setInter(Interrupcion[] inter) {
                this.inter = inter;
        }
        public void parar(){
              this.corriendo = false;
          }
}
