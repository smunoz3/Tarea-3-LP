import java.util.Scanner;

public class Pildora extends Zona{
    private int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public Pildora(boolean completada, int cantidad){
        super(completada);
        this.cantidad = cantidad;
    }

    @Override
    public void interactuar(Pikinim cyan,Pikinim magenta, Pikinim amarillo){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qué color de pikinim desea que se multiplique? (cantidad a multiplicar: "+getCantidad()+")\n");
        System.out.print("1.Cyan  2.Magenta  3.Amarillo\n");
        int color = scanner.nextInt();

        if (color ==1){
            cyan.multiplicar(getCantidad());
        }
        else if (color ==2){
            magenta.multiplicar(getCantidad());
        }
        else if (color ==3){
            amarillo.multiplicar(getCantidad());
        }
        setCompletada(true);
        scanner.close();
    }
}