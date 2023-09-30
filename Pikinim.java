public class Pikinim {
    protected int ataque;
    protected int capacidad;
    protected int cantidad;

    // Constructor clase 3 int
    public Pikinim(int atk, int cap, int cant) {
        ataque = atk;
        capacidad = cap;
        cantidad = cant;
    }

    public void disminuir(int cantidad){
        this.cantidad-= cantidad;
    }

    public void multiplicar(int cantidad){
    }
}