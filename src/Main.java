import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cargo nave = new Cargo("nave", "1235bdj", 1, 1, 0, 10);

        System.out.println(nave.toString());


        System.out.println("desea añadir un container al cargo?");

        Scanner sc = new Scanner(System.in);
        int respuesta = sc.nextInt();
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
