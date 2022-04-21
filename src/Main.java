import java.util.Scanner;

public class Main {

    public void main(String[] args) {

        System.out.println("bienvenido al simulador de naves espaciales\n\n" +
                "de que tipo quiere que sea su nave? escriba como respuesta el numero al que corresponda la nave\n" +
                "1-Nave espacial de carga     2-Nave espacial de transporte");
        Scanner sc = new Scanner(System.in);
        int respuesta = sc.nextInt();


        SpaceShip nave = new Cargo(null, null, 0, 0,0, 0);

        switch (respuesta) {

            case 1:
                System.out.println("introduzca el nombre de su nave galactica de carga:\n\n");
                sc = new Scanner(System.in);
                String nombre = sc.nextLine();

                System.out.println("introduzca la matricula galactica de su nave:\n\n");
                sc = new Scanner(System.in);
                String matricula = sc.nextLine();

                System.out.println("introduzca la la velocidad de aceleracion que quiere que tenga su nave:\n\n");
                sc = new Scanner(System.in);
                int aceleracion = sc.nextInt();

                System.out.println("introduzca el numero de containers que quiere llevar en la nave,\n" +
                        "el numero maximo de containers que se puede llevar son 10");
                sc = new Scanner(System.in);
                int carga = sc.nextInt();

                System.out.println("la nave saldra desde la tierra, coordenada 0,0");

                nave = new Cargo(nombre, matricula, aceleracion, 0 , 0, carga);

                System.out.println(nave.toString());
                break;
        case 2: {
            System.out.println("introduzca el nombre de su nave galactica de transporte:\n\n");
            sc = new Scanner(System.in);
            nombre = sc.nextLine();

            System.out.println("introduzca la matricula galactica de su nave:\n\n");
            sc = new Scanner(System.in);
            matricula = sc.nextLine();

            System.out.println("introduzca la la velocidad de aceleracion que quiere que tenga su nave:\n\n");
            sc = new Scanner(System.in);
            aceleracion = sc.nextInt();

            System.out.println("la nave saldra desde la tierra, coordenada 0,0");

            nave = new SpaceShip(nombre, matricula, aceleracion, 0, 0);
            System.out.println(nave.toString());
        }
        System.out.println(nave.nombre);

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
