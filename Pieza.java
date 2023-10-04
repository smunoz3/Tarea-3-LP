public class Pieza extends Zona implements ILevantar{
    private int peso;

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

    @Override
    public void interactuar(Pikinim cyan,Pikinim Magenta, Pikinim Amarillo){
        Levantar(cyan, Magenta, Amarillo);
    }
    @Override
    public void Levantar(Pikinim cyan,Pikinim magenta,Pikinim amarillo){
        int sumCyan = cyan.getCantidad()*cyan.getCapacidad();
        int sumAmarillo = amarillo.getCantidad()*amarillo.getCapacidad();
        int sumMagenta = magenta.getCantidad()*magenta.getCapacidad();
        if (getPeso()<=(sumCyan+sumAmarillo+sumMagenta)){
            setCompletada(true); // se levanta
            System.out.println("Levantaste la pieza\n");
        }
        else{
            System.out.println("No pudiste levantar la pieza\n");
        }
    }
}