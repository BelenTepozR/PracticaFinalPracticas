package condicionescompetencias;
public class Cerradura {
    private int cerrado;

    Cerradura(){
        this.cerrado = 0; 
    }
    public int isCerrado() {
        return cerrado;
    }

    public void Bloquea() {
        this.cerrado = 1;
    }
    
     public void Desbloquea() {
        this.cerrado = 0;
    }
}
