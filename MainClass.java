public class MainClass {

    public static void main(String[] args){
        if ((Game.getPoicion()+1<n) && (Game.getPoicion()-1>=0)){
            Class<?> claseD = arregloDeZonas[Game.getPoicion()+1].getClass();
            Class<?> claseI = arregloDeZonas[Game.getPoicion()-1].getClass();
            System.out.print("1. Ir a derecha ("+claseD.getName()+") 2. Ir a la izquierda ("+claseI.getName()+") 3. Quedarse aquí \n");
            int movimiento = scanner.nextInt();

            if (movimiento == 1){
                Game.moverse('d');
                System.out.println("Te moviste hacia la derecha");
            }
            else if (movimiento == 2){
                Game.moverse('i');
                System.out.println("Te moviste hacia la izquierda");
            }
            else if (movimiento == 3){
                System.out.println("Te quedaste quieto");
            }
            else if (movimiento ==99){
                break;
            }
            System.out.println("Usted ha ingresado: " + movimiento);

            
        }
        else if(Game.getPoicion()-1 <0){ //borde izquierdo
            Class<?> claseD = arregloDeZonas[Game.getPoicion()+1].getClass();
            System.out.print("1. Ir a derecha ("+claseD.getName()+") 2. Quedarse aquí \n");
            int movimiento = scanner.nextInt();

            if (movimiento == 1){
                Game.moverse('d');
                System.out.println("Te moviste hacia la derecha");
            }
            else if (movimiento == 2){
                Game.moverse('d');
                System.out.println("Te moviste hacia la derecha");
            }
            else if (movimiento == 3){
                System.out.println("Te quedaste quieto");
            }
            else if (movimiento ==99){
                break;
            }
            System.out.println("Usted ha ingresado: " + movimiento);
            
        }
        else if(Game.getPoicion()+1>=n){
            Class<?> claseI = arregloDeZonas[Game.getPoicion()-1].getClass();
            System.out.print("1. Ir a la izquierda ("+claseI.getName()+") 2. Quedarse aquí \n");
            int movimiento = scanner.nextInt();
            
            if (movimiento == 1){
                Game.moverse('i');
                System.out.println("Te moviste hacia la izquierda");
            }
            else if (movimiento == 2){
                System.out.println("Te quedaste quieto");
            }
            else if (movimiento ==99){
                break;
            }
            System.out.println("Usted ha ingresado: " + movimiento);
            
        }
        else {
            System.out.println("error");
            break;
        }
    }
    scanner.close();
}
    }
}