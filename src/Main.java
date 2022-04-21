import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nbienvenido al simulador de naves espaciales\n\n" +
                "de que tipo quiere que sea su nave? escriba como respuesta el numero al que corresponda la nave\n" +
                "1-Nave espacial de carga     2-Nave espacial de transporte");
        Scanner sc = new Scanner(System.in);
        int decision = sc.nextInt();


        SpaceShip nave = new Cargo(null, null, 0, 0, 0, 0);
        SpaceShip naveTransporte = new SpaceShip(null, null, 0, 0, 0);

        switch (decision) {

            case 1:
                System.out.println("introduzca el nombre de su nave galactica de carga:\n");
                sc = new Scanner(System.in);
                String nombre = sc.nextLine();

                System.out.println("introduzca la matricula galactica de su nave:\n");
                sc = new Scanner(System.in);
                String matricula = sc.nextLine();

                System.out.println("introduzca la la velocidad de aceleracion que quiere que tenga su nave:\n");
                sc = new Scanner(System.in);
                int aceleracion = sc.nextInt();

                System.out.println("introduzca el numero de containers que quiere llevar en la nave,\n" +
                        "el numero maximo de containers que se puede llevar son 10");
                sc = new Scanner(System.in);
                int carga = sc.nextInt();

                System.out.println("la nave saldra desde la tierra, coordenada 0,0\n\n" +
                        "iniciando ignicion...\n");

                nave = new Cargo(nombre, matricula, aceleracion, 0, 0, carga);

                System.out.println(nave.toString());
                System.out.println("\n...\n\n" +
                        "la nave ha aterrizado, desea añadir o retirar containers? 1=si 2=no");
                sc = new Scanner(System.in);
                int respuesta = sc.nextInt();

                if (respuesta == 1) {
                    System.out.println("desea añadir uno o retirarlo? 1=añadir 2=retirar");
                    sc = new Scanner(System.in);
                    respuesta = sc.nextInt();
                    int peso = carga;
                    if (respuesta == 1) {
                        peso = ((Cargo) nave).load();
                        if (peso == 11) {
                            String mensaje = "el cargo " + nave.nombre + " esta completo, no se puede añadir mas";
                            peso = 10;
                            System.out.println(mensaje);
                        }
                        System.out.println("\n...\n\nse ha añadido un container a la nave");
                    }
                    nave = new Cargo(nombre, matricula, aceleracion, nave.velocidadX, nave.velocidadY, peso);
                    System.out.println("desea retirar un container del cargo?");
                    sc = new Scanner(System.in);
                    respuesta = sc.nextInt();

                    if (respuesta == 1) {
                        peso = ((Cargo) nave).unload();
                        if (peso == 12) {
                            String mensaje = "el cargo " + nave.nombre + " esta vacio, no se puede retirar mas";
                            peso = 0;
                            System.out.println(mensaje);
                        }
                        nave = new Cargo(nombre, matricula, aceleracion, nave.velocidadX, nave.velocidadY, peso);
                    }
                }

                //--------interfaz de la nave----------//
                break;
            case 2:
                System.out.println("introduzca el nombre de su nave galactica de transporte:\n");
                sc = new Scanner(System.in);
                nombre = sc.nextLine();

                System.out.println("introduzca la matricula galactica de su nave:\n");
                sc = new Scanner(System.in);
                matricula = sc.nextLine();

                System.out.println("introduzca la la velocidad de aceleracion que quiere que tenga su nave:\n");
                sc = new Scanner(System.in);
                aceleracion = sc.nextInt();

                System.out.println("la nave saldra desde la tierra, coordenada 0,0");

                naveTransporte = new SpaceShip(nombre, matricula, aceleracion, 0, 0);
                System.out.println(nave.toString());

                naveTransporte.interfaz();

                System.out.println("desea añadir un container al cargo?");

                //--------interfaz de la nave----------//
                break;
        }
        System.out.println(naveTransporte.interfaz());
            int respuesta=1;
        if (respuesta == 1) {

        }

        System.out.println("nombre: " + nave.nombre + "\n" +
                "matricula " + nave.matricula + "\naceleracion " + nave.aceleracion + "\nvelocidad " + nave.velocidadX +
                "\npeso: " + ((Cargo) nave).cargo + "\n\n");

        System.out.println(nave.toString());

    }
}
