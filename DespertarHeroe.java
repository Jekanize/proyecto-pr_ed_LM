import java.util.Scanner;

public class DespertarHeroe {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {

        int opcion;

        do {
            System.out.println("     EL DESPERTAR DEL HEROE");
            System.out.println("1. Nueva partida");
            System.out.println("2. Consultar ranking");
            System.out.println("3. Ayuda");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has iniciado una nueva partida.");
                    break;

                case 2:
                    System.out.println("El ranking esta vacio.");
                    break;

                case 3:
                    System.out.println("Debes derrotar a tres enemigos.");
                    break;

                case 4:
                    System.out.println("Hasta pronto, heroe.");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 4);

        sc.close();
    }



    public static void nuevaPartida() {

        System.out.print("Introduce el nombre de tu heroe: ");
        
        String nombre = sc.nextLine();

        while (nombre.trim().isEmpty()) {
            System.out.print("El nombre no puede estar vacio. Introduce otro: ");
            nombre = sc.nextLine();
        }

        int vida = 100;
        int pociones = 3;
        int puntuacion = 0;

        System.out.println();
        System.out.println("Tu aventura comienza, " + nombre + "!");
        System.out.println("Vida: " + vida);
        System.out.println("Pociones: " + pociones);
        System.out.println("Puntuacion: " + puntuacion);
        System.out.println();
    }
}



