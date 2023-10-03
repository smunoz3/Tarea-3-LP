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
        if (TryRomper(cyan, magenta, amarillo)){
            setCompletada(true);
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