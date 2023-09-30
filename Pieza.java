public class Pieza extends Zona{
    private int peso;

    //Contructor
    public Pieza(boolean completada,int peso){
        super(completada);
        this.peso = peso;
    }
    //getter
    public int getPeso() {
        return peso;
    }
}