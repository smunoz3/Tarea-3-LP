import java.util.Scanner;

public class Pildora extends Zona{
    private int cantidad;

    //Constructor
    public Pildora(boolean completada, int cantidad){
        super(completada);
        this.cantidad = cantidad;
    }
    //getter
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public void interactuar(Pikinim cyan,Pikinim magenta, Pikinim amarillo){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingrese un número entero: ");
        int color = scanner.nextInt();
        scanner.close();

        if (color ==1){
            cyan.multiplicar(cantidad);
        }
        else if (color ==2){
            magenta.multiplicar(cantidad);
        }
        else if (color ==3){
            amarillo.multiplicar(cantidad);
        }
        completada = true;
    }
}