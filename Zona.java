public class Zona{
    protected boolean completada;

    public boolean getCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    //Constructor
    public Zona(boolean completada){
        this.completada = completada;
    }
    
    public void interactuar(Pikinim cyan,Pikinim Magenta, Pikinim Amarillo){//3 pikmin
        if (getCompletada()){
            System.out.println("No queda nada que hacer aqu");
        }
    }
}