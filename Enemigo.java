public class Enemigo extends Zona{
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
    
    public boolean Pelear(){
        return true;
    }
}