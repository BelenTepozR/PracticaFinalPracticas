package condicionescompetencias;

import java.util.ArrayList;

public class RCompartido {
        private String  rc;
        private  Interrupcion[] inter;
        private Cerradura c;
        private Mutex m;
        private Dekker d, d12, d34;
        private Dijkstra di;

        RCompartido(){
                rc = "";
        }

        public Dijkstra getDi() {
                return di;
        }

        public void setDi(Dijkstra di) {
                this.di = di;
        }

        public Dekker getD() {
                return d;
        }

        public void setD(Dekker d) {
                this.d = d;
        }

        public Dekker getD12() {
                return d12;
        }

        public void setD12(Dekker d12) {
                this.d12 = d12;
        }

        public Dekker getD34() {
                return d34;
        }

        public void setD34(Dekker d34) {
                this.d34 = d34;
        }

        public Mutex getM() {
                return m;
        }

        public void setM(Mutex m) {
                this.m = m;
        }

        public Cerradura getC() {
                return c;
        }

        public void setC(Cerradura c) {
                this.c = c;
        }
    
    public void crearArray(Interrupcion[] inter){
        this.inter = inter;    
    }
        public String getDatoCompartido() {
                return rc;
        }

        public void setDatoCompartido(String datoCompartido) {
                this.rc = datoCompartido;
        }
       
  
    
    public boolean isEntraC(){
                return c.isCerrado() == 0;                
    }
    
    public void bloquea(int n){
        for(int i=0; i< inter.length; i++){
            inter[i].setInter(false);
        }
    }
    
    public void desbloquea(){
        for(int i=0; i< inter.length; i++){
            inter[i].setInter(true);
        }
    }
    
    public boolean isEntra(){
        boolean ban = false;
       for(int i=0; i< inter.length; i++){
            if(inter[i].isInter())
                ban = true;
            else
                return false;
       }
        return ban;
    }
    public boolean isEntraM(){
            return m.isPase();                
    }
}
