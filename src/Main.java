import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cargo nave = new Cargo("nave", "1235bdj", 1, 1, 0, 10);

        System.out.println(nave.toString());

        System.out.println("desea añadir un container al cargo?");

        Scanner sc = new Scanner(System.in);
        String respuesta = sc.nextLine();
        if (respuesta == "si"){

            int cargo = nave.load();
            if (cargo == 11){
                String mensaje = "el cargo "+ nave.nombre +" esta completo, no se puede añadir mas";
                cargo = 10;

            }
            nave = new Cargo("nave", "1235bdj", 1, 1, 0, cargo);
        }


    }
}
