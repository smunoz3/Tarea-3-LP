public class Pieza extends Zona{
    private int peso;

    //getter
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    public Pieza(boolean completada,int peso){
        super(completada);
        this.peso = peso;
    }
    
}