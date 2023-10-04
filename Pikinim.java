abstract public class Pikinim {
    private int ataque;
    private int capacidad;
    private int cantidad;

    public int getAtaque() {
        return ataque;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Pikinim(int atk, int cap, int cant) {
        this.ataque = atk;
        this.capacidad = cap;
        this.cantidad = cant;
    }

    public void disminuir(int cantidad){
        int cant = getCantidad();
        setCantidad(cant-cantidad);
    }

    public abstract void multiplicar(int cantidad);
}