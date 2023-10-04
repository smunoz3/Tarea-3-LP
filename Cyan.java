public class Cyan extends Pikinim{
    public Cyan(int cantidad){
    super(1, 1, cantidad);
    }

    @Override
    public void multiplicar(int cantidad) {
        setCantidad(getCantidad()+cantidad*3);
    }
}