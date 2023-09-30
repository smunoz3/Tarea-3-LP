public class Muralla extends Zona{
    public int vida;
    
    //Constructor
    public Muralla(boolean completada, int vida){
        super(completada);
        this.vida = vida;
    }
    //getter
    public int getVida() {
        return vida;
    }
    
    @Override
    public void interactuar(Pikinim cyan,Pikinim magenta, Pikinim amarillo){
        if (TryRomper(cyan, magenta, amarillo)){
            completada = true;
        }
    }

    public boolean TryRomper(Pikinim cyan,Pikinim magenta, Pikinim amarillo){
        vida = vida - (cyan.cantidad * cyan.ataque)- (magenta.cantidad * magenta.ataque)- (amarillo.cantidad * amarillo.ataque);
        if (vida <= 0){
            return true;
        }
        else{
            return false;
        }
    }
}