public class Magenta extends Pikinim{
    public Magenta(int cantidad){
    super(2, 1, cantidad);
    }

    @Override
    public void multiplicar(int cantidad){
        setCantidad(getCantidad()+(int)Math.ceil(cantidad*1.5));
    }
}