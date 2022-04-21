import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("bienvenido al simulador de naves espaciales\n\n" +
                "de que tipo quiere que sea su nave? escriba como respuesta el numero al que corresponda la nave\n" +
                "1-Nave espacial de carga     2-Nave espacial de transporte");
        Scanner sc = new Scanner(System.in);
        int respuesta = sc.nextInt();

        if (respuesta == 1) {
            System.out.println("introduzca el nombre de su nave galactica de carga:\n\n");
            sc = new Scanner(System.in);
            String nombre = sc.nextLine();

            System.out.println("introduzca la matricula galactica de su nave:\n\n");
            sc = new Scanner(System.in);
            String matricula = sc.nextLine();

            System.out.println("introduzca la la velocidad de aceleracion que quiere que tenga su nave:\n\n");
            sc = new Scanner(System.in);
            int aceleracion = sc.nextInt();


            Cargo naveCarga = new Cargo(, , , , , );
        }
        else if (respuesta == 2) {
            SpaceShip naveTransporte = new SpaceShip()
        }
        System.out.println(nave.toString());


        System.out.println("desea añadir un container al cargo?");

        sc = new Scanner(System.in);
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            int peso = nave.load();
            if (peso == 11){
                String mensaje = "el cargo "+ nave.nombre +" esta completo, no se puede añadir mas";
                peso = 10;
                System.out.println(mensaje);
            }
            nave = new Cargo("nave", "1235bdj", 1, 1, 0, peso);
        }

        System.out.println("desea retirar un container del cargo?");
        sc = new Scanner(System.in);
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            int peso = nave.unload();
            if (peso == 12){
                String mensaje = "el cargo "+ nave.nombre +" esta vacio, no se puede retirar mas";
                peso = 0;
                System.out.println(mensaje);
            }
            nave = new Cargo("nave", "1235bdj", 1, 1, 0, peso);
        }

        System.out.println("nombre: " + nave.nombre + "\n" +
                "matricula " + nave.matricula + "\naceleracion " + nave.aceleracion + "\nvelocidad " + nave.velocidadX +
                "\npeso: " + nave.cargo + "\n\n");

        System.out.println(nave.toString());


    }
}
