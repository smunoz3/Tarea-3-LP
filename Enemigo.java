import java.util.Scanner;

public class Enemigo extends Zona implements ILevantar{
    private int vida;
    private int peso;
    private int ataque;
    private Scanner scanner;

    public int getVida(){
        return vida;
    }
    public int getPeso(){
        return peso;
    }
    public int getAtaque(){
        return ataque;
    }

    public void setVida(int vida){
        this.vida = vida;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public void setAtaque(int ataque){
        this.ataque = ataque;
    }

    public Enemigo(boolean completada,int vida,int peso,int atk, Scanner scanner){
        super(completada);
        this.vida = vida;
        this.peso = peso;
        this.ataque = atk;
        this.scanner = scanner;
    }
    
    @Override
    public void interactuar(Pikinim cyan,Pikinim magenta, Pikinim amarillo){
        if(!getCompletada()){
            System.out.println("Peleas contra un enemigo");
            if (getVida()!=0){
                Pelear(cyan, magenta, amarillo);
            }
        }
        else{
            System.out.println("No queda nada que hacer aqui\n");
        }
    }

    public boolean Pelear(Pikinim cyan,Pikinim magenta, Pikinim amarillo){
        int cyanAtaque = cyan.getCantidad() * cyan.getAtaque();
        int magentaAtaque = magenta.getCantidad() * magenta.getAtaque();
        int amarilloAtaque = amarillo.getCantidad() * amarillo.getAtaque();
        setVida((getVida()-cyanAtaque-magentaAtaque-amarilloAtaque));

        double random = Math.random();
        int piknimAfectado = (int) (random * 3) + 1;

        System.out.println("Le hiciste: "+(cyanAtaque+magentaAtaque+amarilloAtaque)+" de daño");

        if (piknimAfectado == 1){
            System.out.println("Pikinims caidos en combate: "+getAtaque()+" cyan");
            if(cyan.getCantidad()-getAtaque() <0){
                cyan.setCantidad(0);
            }
            else{
                cyan.setCantidad(cyan.getCantidad()-getAtaque());
            }
        }
        else if (piknimAfectado == 2){
            System.out.println("Pikinims caidos en combate: "+getAtaque()+" magenta");
            if(magenta.getCantidad()-getAtaque() <0){
                magenta.setCantidad(0);
            }
            else{
                magenta.setCantidad(magenta.getCantidad()-getAtaque());
            }
        }
        else if (piknimAfectado == 3){
            System.out.println("Pikinims caidos en combate: "+getAtaque()+" amarillo");
            if(amarillo.getCantidad()-getAtaque() <0){
                amarillo.setCantidad(0);
            }
            else{
                amarillo.setCantidad(amarillo.getCantidad()-getAtaque());
            }
        }

        if (getVida()<=0){
            System.out.println("Derrotaste al enemigo\n");
            setVida(0);
            Levantar(cyan, magenta, amarillo);
            return true;
        }
        else{
            System.out.println("El enemigo sigue con vida");
            System.out.println("Le queda: "+getVida()+" de vida\n");
            return false;
        }
        
    }

    @Override
    public void Levantar(Pikinim cyan,Pikinim magenta,Pikinim amarillo){
        int cyanFuerza = cyan.getCantidad() * cyan.getCapacidad();
        int magentaFuerza = magenta.getCantidad() * magenta.getCapacidad();
        int amarilloFuerza = amarillo.getCantidad() * amarillo.getCapacidad();

        if (getPeso()<=(cyanFuerza+magentaFuerza+amarilloFuerza)){
            System.out.print("Qué color de pikinim desea que se multiplique? (cantidad a multiplicar: "+getPeso()+")\n");
            System.out.print("1.Cyan  2.Magenta  3.Amarillo\n");
            int color = scanner.nextInt();

            if (color ==1){
                cyan.multiplicar(getPeso());
            }
            else if (color ==2){
                magenta.multiplicar(getPeso());
            }
            else if (color ==3){
                amarillo.multiplicar(getPeso());
            }
        }
        //System.out.println("==========================================");
        setCompletada(true);
    }
}