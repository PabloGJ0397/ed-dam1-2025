import features.Client;

import java.util.Scanner;
import services.ClientService;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        ClientService clientService = new ClientService();
        cargarDatosIniciales(clientService);

        System.out.println("\n=== Muebles SL - Gestión de Clientes ===\n");

        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            int opcion = leerEntero("Selecciona una opción: ");
            System.out.println();

            switch (opcion) {
                case 1:
                    buscarCliente(clientService);
                    break;
                case 2:
                    listarClientes(clientService);
                    break;
                case 3:
                    altaCliente(clientService);
                    break;
                case 4:
                    modificarCliente(clientService);
                    break;
                case 5:
                    borrarCliente(clientService);
                    break;
                case 6:
                    salir = true;
                    System.out.println("Hasta pronto.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.println();
        }
    }

    private static void mostrarMenu() {
        System.out.println("1. Buscar cliente por NIF");
        System.out.println("2. Listar todos los clientes");
        System.out.println("3. Alta de cliente");
        System.out.println("4. Modificar cliente");
        System.out.println("5. Borrar cliente");
        System.out.println("6. Salir");
    }

    private static void buscarCliente(ClientService clientService) {
        String nif = leerTextoObligatorio("Introduce el NIF: ");
        Client client = clientService.obtenerClientePorNif(nif);
        if (client == null) {
            System.out.println("No se encontró un cliente con ese NIF.");
        } else {
            System.out.println(client);
        }
    }

    private static void listarClientes(ClientService clientService) {

    }

    private static void altaCliente(ClientService clientService) {

    }

    private static void modificarCliente(ClientService clientService) {

    }

    private static void borrarCliente(ClientService clientService) {

    }

    /// Lee un numero del teclado
    private static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = SCANNER.nextLine().trim();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Introduce un número válido.");
            }
        }
    }

    /// Lee un texto del teclado. No admite texto vacío
    private static String leerTextoObligatorio(String mensaje) {
        String valor;
        do {
            valor = leerTexto(mensaje);
            if (valor.isBlank()) {
                System.out.println("El valor no puede estar vacío.");
            }
        } while (valor.isBlank());
        return valor;
    }

    /// Lee un texto del teclado. Admite vacío
    private static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return SCANNER.nextLine().trim();
    }

    ///  Carga datos iniciales en el respositorio
    private static void cargarDatosIniciales(ClientService clientService) {
        if (!clientService.obtenerTodosLosClientes().isEmpty()) {
            return;
        }

        clientService.crearCliente(new Client(
                "Ana",
                "García López",
                "12345678A",
                "Calle Mayor 1",
                "Madrid",
                "Madrid",
                "600111222",
                "ana@example.com"
        ));

        clientService.crearCliente(new Client(
                "Luis",
                "Pérez Martín",
                "87654321B",
                "Avenida Sol 10",
                "Sevilla",
                "Sevilla",
                "600333444",
                "luis@example.com"
        ));
    }
}