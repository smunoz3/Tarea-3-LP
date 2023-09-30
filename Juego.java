public class Juego{
    public static Zona[] arregloDeZonas;
    public static void generarMapa(){
        int n = 11;
        Zona[] arregloDeZonas = new Zona[n]; // Crea un arreglo de objetos Zona

        arregloDeZonas[0] = new Pieza(false,50);
        arregloDeZonas[1] = new Enemigo(false,130,20,25);
        arregloDeZonas[2] = new Enemigo(false,50,10,15);
        arregloDeZonas[3] = new Pildora(false,25);
        arregloDeZonas[4] = new Muralla(false, 50);
        arregloDeZonas[5] = new Pieza(false,100);
        arregloDeZonas[6] = new Enemigo(false,45,8,10);
        arregloDeZonas[7] = new Pieza(false,35);
        arregloDeZonas[8] = new Pildora(false,15);
        arregloDeZonas[9] = new Enemigo(false,75,15,20);
        arregloDeZonas[10] = new Muralla(false,150);
    }
    public static void main(String[] args) {
        generarMapa();
        Zona zero = arregloDeZonas[0];
        System.out.println(zero.getCompletada());
        System.out.println("Genero mapa");
    }

}

// javac Juego.java
// java Juego