public class Enemigo extends Zona{
    private int vida;
    private int peso;
    private int ataque;

    //Constructor
    public Enemigo(boolean completada,int vida,int peso,int atk){
        super(completada);
        this.vida = vida;
        this.peso = peso;
        this.ataque = atk;
    }
    //getter
    public int getVida() {
        return vida;
    }
    public int getPeso() {
        return peso;
    }
    public int getAtaque() {
        return ataque;
    }

    public boolean Pelear(){
        return true;
    }
}