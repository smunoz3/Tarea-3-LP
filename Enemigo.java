public class Enemigo extends Zona implements ILevantar{
    private int vida;
    private int peso;
    private int ataque;

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

    public Enemigo(boolean completada,int vida,int peso,int atk){
        super(completada);
        this.vida = vida;
        this.peso = peso;
        this.ataque = atk;
    }
    
    @Override
    public void interactuar(Pikinim cyan,Pikinim magenta, Pikinim amarillo){
        if (getVida()!=0){
            Pelear(cyan, magenta, amarillo);
        }
    }

    public boolean Pelear(Pikinim cyan,Pikinim magenta, Pikinim amarillo){
        int cyanAtaque = cyan.getCantidad() * cyan.getAtaque();
        int magentaAtaque = magenta.getCantidad() * magenta.getAtaque();
        int amarilloAtaque = amarillo.getCantidad() * amarillo.getAtaque();
        setVida((getVida()-cyanAtaque-magentaAtaque-amarilloAtaque));

        double random = Math.random();
        int piknimAfectado = (int) (random * 3) + 1;

        if (piknimAfectado == 1){
            cyan.setCantidad(cyan.getCantidad()-getAtaque());
        }
        else if (piknimAfectado == 2){
            magenta.setCantidad(magenta.getCantidad()-getAtaque());
        }
        else if (piknimAfectado == 3){
            amarillo.setCantidad(amarillo.getCantidad()-getAtaque());
        }

        if (getVida()<=0){
            setVida(0);
            setCompletada(true);
            Levantar(cyan, magenta, amarillo);
            return true;
        }
        else{
            return false;
        }
        
    }

    @Override
    public void Levantar(Pikinim cyan,Pikinim magenta,Pikinim amarillo){
        int cyanFuerza = cyan.getCantidad() * cyan.getCapacidad();
        int magentaFuerza = magenta.getCantidad() * magenta.getCapacidad();
        int amarilloFuerza = amarillo.getCantidad() * amarillo.getCapacidad();

        if (getPeso()<=(cyanFuerza+magentaFuerza+amarilloFuerza)){
            // preguntar que pikmin multiplicar
        }
    }
}