import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionPedidos gestion = new GestionPedidos();
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n--- PIZZERIA PIZZA-TRACK ---");
            System.out.println("1. Registrar Pizza (3 ingredientes)");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar Ultimo Pedido");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Por favor ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la pizza: ");
                    String nombre = sc.nextLine();
                    String[] ingredientes = new String[3];
                    for(int i=0; i<3; i++) {
                        System.out.print("Ingrediente " + (i+1) + ": ");
                        ingredientes[i] = sc.nextLine();
                    }
                    gestion.registrar(new Pizza(nombre, ingredientes));
                    break;
                case 2: gestion.deshacer(); break;
                case 3: gestion.rehacer(); break;
                case 4: gestion.mostrarActual(); break;
                case 0: System.out.println("Cerrando sistema..."); break;
                default: System.out.println("Opcion no valida.");
            }
        }
    }
}