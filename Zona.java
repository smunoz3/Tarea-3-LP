public class Zona{
    protected boolean completada;

    //Constructor
    public Zona(boolean completada){
        this.completada = completada;
    }
    //getter
    public boolean getCompletada() {
        return completada;
    }
    
    public void interactuar(Pikinim cyan,Pikinim Magenta, Pikinim Amarillo){//3 pikmin
        System.out.println("No queda nada que hacer aqu");
    }
}