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
                if (carga > 10) {
                    System.out.println("la carga ha alcanzado su numero maximo, se quedaran solo 10 containers");
                    carga = 10;
                }
                nave = new Cargo(nombre, matricula, aceleracion, 1, 0, carga);
                System.out.println("nombre: " + nave.nombre + "\n" +
                        "matricula " + nave.matricula + "\naceleracion " + nave.aceleracion + "\nvelocidad " + nave.velocidadX +
                        "\npeso: " + ((Cargo) nave).cargo + "\n\n");

                System.out.println("la nave saldra desde la tierra, coordenada 0,0\n\n" +
                        "introduzca cualquier tecla para la ignicion...\n");
                sc = new Scanner(System.in);
                String nada = sc.nextLine();
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
                        System.out.println("\n...\n\nse ha añadido un container a la nave");
                        if (peso == 11) {
                            String mensaje = "el cargo " + nave.nombre + " esta completo, no se puede añadir mas, se quedara en 10";
                            peso = 10;
                            System.out.println(mensaje);
                        }
                    }
                    nave = new Cargo(nombre, matricula, aceleracion, nave.velocidadX, nave.velocidadY, peso);
                    System.out.println("desea retirar un container del cargo? pulse 1");
                    sc = new Scanner(System.in);
                    respuesta = sc.nextInt();

                    if (respuesta == 1) {
                        peso = ((Cargo) nave).unload();
                        System.out.println("se ha retirado un container de la nave");
                        if (peso == 12) {
                            String mensaje = "el cargo " + nave.nombre + " esta vacio, no se puede retirar mas";
                            peso = 0;
                            System.out.println(mensaje);
                        }
                        nave = new Cargo(nombre, matricula, aceleracion, nave.velocidadX, nave.velocidadY, peso);
                        System.out.println("nombre: " + nave.nombre + "\n" +
                                "matricula " + nave.matricula + "\naceleracion " + nave.aceleracion + "\nvelocidad " + nave.velocidadX +
                                "\npeso: " + ((Cargo) nave).cargo + "\n\n");
                    }
                    System.out.println("la nave saldra desde el puerto de exportacion, coordenada 0,0\n\n" +
                            "introduzca cualquier tecla para la ignicion...\n");
                    sc = new Scanner(System.in);
                    nada = sc.nextLine();

                    System.out.println(nave.toString());
                    System.out.println(nave.interfaz());

                }

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

                naveTransporte = new SpaceShip(nombre, matricula, aceleracion, 1, 0);
                System.out.println("nombre: " + naveTransporte.nombre + "\n" +
                        "matricula " + naveTransporte.matricula + "\naceleracion " + naveTransporte.aceleracion + "\nvelocidad " + naveTransporte.velocidadX);

                System.out.println("la nave saldra desde la tierra, coordenada 0,0\n\n" +
                        "introduzca cualquier tecla para iniciar la ignicion...\n\n");
                sc = new Scanner(System.in);
                nada = sc.nextLine();

                System.out.println(naveTransporte.toString() + "\n\n");
                System.out.println(naveTransporte.interfaz());


                break;
            }


        SpaceShip naveFinal = nave;
        if (decision == 1) {
            naveFinal = nave;
            naveFinal = new Cargo(naveFinal.nombre, naveFinal.matricula, naveFinal.aceleracion, naveFinal.velocidadX, nave.velocidadY, ((Cargo) nave).cargo);

        } else if (decision == 2) {
            naveFinal = naveTransporte;
            naveFinal = new SpaceShip(naveFinal.nombre, naveFinal.matricula, naveFinal.aceleracion, naveFinal.velocidadX, nave.velocidadY);
        }
        naveFinal = new SpaceShip(naveFinal.nombre, naveFinal.matricula, naveFinal.aceleracion, naveFinal.velocidadX, nave.velocidadY);
        System.out.println("si desea aumentar la velocidad pulse '8' si desea reducirla pulse '2'\n" +
                "el freno de emergencia es la '5' y para salir pulse '0'\n\n" +
                "introduzca cualquier tecla para encender el control manual...\n\n");
        sc = new Scanner(System.in);
        String nada = sc.nextLine();
        int velocidad = 0;
        int salida = 2;
       while (salida != 1) {
            System.out.println(naveFinal.toString());
            System.out.println(naveFinal.interfaz());


            sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input == 0) {
                salida = 1;
            }
            salida = salida;
            if (input == 8) {
                velocidad = naveFinal.speedUp();
                naveFinal = new SpaceShip(naveFinal.nombre, naveFinal.matricula, naveFinal.aceleracion, velocidad, nave.velocidadY);
            } else if (input == 2) {
                velocidad = naveFinal.brake();
                naveFinal = new SpaceShip(naveFinal.nombre, naveFinal.matricula, naveFinal.aceleracion, velocidad, nave.velocidadY);

            } else if (input == 5) {
                velocidad = naveFinal.emergencyStop();
                naveFinal = new SpaceShip(naveFinal.nombre, naveFinal.matricula, naveFinal.aceleracion, velocidad, nave.velocidadY);

            }
           System.out.println(velocidad);
           System.out.println(salida);
       }
        System.out.println("la nave ha aterrizado, esperemos que le haya gustado su viaje");
    }
}
