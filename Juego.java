import java.util.Scanner;

public class Juego{
    private int posicion;
    public static Zona[] arregloDeZonas;

    public int getPoicion(){
        return posicion;
    }

    public void setPosicion(int posicion){
        this.posicion = posicion;
    }

    public void moverse(int p){ //comprobacion movimiento valido al ser llamado
       setPosicion(p);
    }
    
    public static void main(String[] args) {
        int n = 11;
        Zona[] arregloDeZonas = new Zona[n]; // Crea un arreglo de objetos Zona
        Scanner scanner = new Scanner(System.in);

        arregloDeZonas[0] = new Pieza(false,50);
        arregloDeZonas[1] = new Enemigo(false,130,20,25);
        arregloDeZonas[2] = new Enemigo(false,50,10,15);
        arregloDeZonas[3] = new Pildora(false,25,scanner);
        arregloDeZonas[4] = new Muralla(false, 50);
        arregloDeZonas[5] = new Pieza(false,100);
        arregloDeZonas[6] = new Enemigo(false,45,8,10);
        arregloDeZonas[7] = new Pieza(false,35);
        arregloDeZonas[8] = new Pildora(false,15,scanner);
        arregloDeZonas[9] = new Enemigo(false,75,15,20);
        arregloDeZonas[10] = new Muralla(false,150);

        Juego Game = new Juego();
        Game.setPosicion(5);

        Cyan P_Cyan = new Cyan(10);
        Amarillo P_Amarillo = new Amarillo(10);
        Magenta P_Magenta = new Magenta(10);

        int turno = 1;
        int cantidadPiezas =0;
        int derecha,izquierda;
        String movAnterior = "nada";
        

        while((turno<=30)||(cantidadPiezas>=3)){
            System.out.println("Turno "+ turno + " (Cyan - "+P_Cyan.getCantidad()+", Amarillo - "+P_Amarillo.getCantidad()+", Magenta - "+P_Magenta.getCantidad()+")");
            Class<?> clase = arregloDeZonas[Game.getPoicion()].getClass();
            System.out.println("Zona actal: "+clase.getName());
            System.out.println("Opciones: ");

            derecha = ((Game.getPoicion()+1)>=n)? 0:Game.getPoicion()+1;
            izquierda = ((Game.getPoicion()-1)<0)? (n-1):Game.getPoicion()-1;
            
            Class<?> claseD = arregloDeZonas[derecha].getClass();
            Class<?> claseI = arregloDeZonas[izquierda].getClass();
            Class<?> claseActual = arregloDeZonas[Game.getPoicion()].getClass();

            if (claseActual.getName() != "Muralla"){
                System.out.print("1. Ir a derecha ("+claseD.getName()+") 2. Ir a la izquierda ("+claseI.getName()+") 3. Quedarse aquí \n");
            }
            else if((claseActual.getName() == "Muralla") &&(movAnterior == "izquierda")){
                System.out.print("1. Ir a derecha ("+claseD.getName()+") 2. No puedes ir hacia la izquierda 3. Quedarse aquí \n");
            }
            else if((claseActual.getName() == "Muralla") &&(movAnterior == "derecha")){
                System.out.print("1. No puedes ir a la derecha 2. Ir a la izquierda ("+claseI.getName()+") 3. Quedarse aquí \n");
            }

            int movimiento = scanner.nextInt();
           
            if (movimiento == 1){
                if ((claseActual.getName()== "Muralla")&&(!arregloDeZonas[Game.getPoicion()].getCompletada())&&(movAnterior == "derecha")){
                    System.out.println("Muralla no derribada\n");
                }
                else{
                    Game.moverse(derecha);
                    movAnterior = "derecha";
                    System.out.println("Te moviste hacia la derecha\n");

                    arregloDeZonas[Game.getPoicion()].interactuar(P_Cyan, P_Magenta, P_Amarillo);
                    if ((claseActual.getName()== "Pieza")&&(arregloDeZonas[Game.getPoicion()].completada)){
                        cantidadPiezas = cantidadPiezas +1;
                        System.out.println("Te cogiste una pieza\n");
                    }
                    turno = turno +1;
                }
            }
            else if (movimiento == 2){
                if ((claseActual.getName()== "Muralla")&&(!arregloDeZonas[Game.getPoicion()].getCompletada())&&(movAnterior == "izquierda")){
                    System.out.println("Muralla no derribada\n");
                }
                else{ 
                    Game.moverse(izquierda);
                    movAnterior = "izquierda";
                    System.out.println("Te moviste hacia la izquierda\n");

                    arregloDeZonas[Game.getPoicion()].interactuar(P_Cyan, P_Magenta, P_Amarillo);
                    if ((claseActual.getName()== "Pieza")&&(arregloDeZonas[Game.getPoicion()].completada)){
                        cantidadPiezas = cantidadPiezas +1;
                        System.out.println("Te cogiste una pieza\n");
                    }
                    turno = turno +1;
                }
            }
            else if (movimiento == 3){
                System.out.println("Te quedaste en el sitio\n");
                arregloDeZonas[Game.getPoicion()].interactuar(P_Cyan, P_Magenta, P_Amarillo);
                if ((claseActual.getName()== "Pieza")&&(arregloDeZonas[Game.getPoicion()].completada)){
                    cantidadPiezas = cantidadPiezas +1;
                    System.out.println("Te cogiste una pieza\n");
                }
                turno = turno +1;
            }
            else if (movimiento ==99){
                break;
            }
        }
        scanner.close();
    }
}

// javac Juego.java
// java Juego