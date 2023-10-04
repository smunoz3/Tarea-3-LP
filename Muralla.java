public class Muralla extends Zona{
    public int vida;
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public Muralla(boolean completada, int vida){
        super(completada);
        this.vida = vida;
    }

    @Override
    public void interactuar(Pikinim cyan,Pikinim magenta, Pikinim amarillo){
        int vidaActual = getVida();
        if (TryRomper(cyan, magenta, amarillo)){
            setCompletada(true);
        }
        if (getCompletada()){
            System.out.println("Rompiste la muralla\n");
        }
        else{
            System.out.println("A la muralla le hiciste: "+(vidaActual - getVida())+" de daño");
            System.out.println("A la muralla le queda: "+getVida()+" de vida\n");
        }
    }

    public boolean TryRomper(Pikinim cyan,Pikinim magenta, Pikinim amarillo){
        setVida(getVida() - (cyan.getCantidad() * cyan.getAtaque())- (magenta.getCantidad() * magenta.getAtaque())- (amarillo.getCantidad() * amarillo.getAtaque()));
        if (getVida() <= 0){
            return true;
        }
        else{
            return false;
        }
    }
}