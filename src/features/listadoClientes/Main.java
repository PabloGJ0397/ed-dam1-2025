package features.listadoClientes;

import java.util.List;

public class Main {
    static void main(String[] args) {
        GestorClientes gestor = new GestorClientes();

        //1.Añadir
        Cliente cliente1 = new Cliente("Ana", "García Moreno", "A12345678",
                "calle del Sol 7", "Alpedrete", "Madrid",
                "123 456 789", "anaGM@mail.com");
        gestor.anadirCliente(cliente1);

        Cliente cliente2 = new Cliente("Pedro", "Delgado Pérez", "B12345678",
                "calle Larga 20", "Zamarramala", "Segovia",
                "234 567 891", "pdp@mail.com");
        gestor.anadirCliente(cliente2);

        Cliente cliente3 = new Cliente("Ana María", "Pérez Yepes", "C12345678",
                "Calle Del Doctor Esquerdo", "Madrid", "Madrid",
                "345 678 912", "AnaMPeYe@mail.com");
        gestor.anadirCliente(cliente3);

        //2.Recuperar por nif
        Cliente encontrado = gestor.obtenerCliente("A12345678");
        System.out.println("Cliente encontrado: " + encontrado.getNombre() + "; " + encontrado.getApellidos() + "; " + encontrado.getNIF());

        //3.Modificar

        gestor.modificarCliente("A12345678",
                "Calle Real 1", "Alcobendas", "Madrid",
                "987 654 321",
                "GMana@mail.com");

        //4.Recuperar lista de todos
        System.out.println("Total de clientes: " + gestor.obtenerTodos().size());

        String provinciaFiltro = "Madrid"; // <-- Define aquí la provincia que quieres buscar

        // 5.1. Llamar al método y guardar la lista devuelta
        List<Cliente> clientesEncontrados = gestor.obtenerPorProvincia(provinciaFiltro);

        System.out.println("\n--- Lista de clientes en " + provinciaFiltro + " ---");
        System.out.println("Total encontrados: " + clientesEncontrados.size());

        // 5.2. Recorrer la lista para imprimir Nombre y Apellidos
        for (Cliente cliente : clientesEncontrados) {
            System.out.println("- " + cliente.getNombre() + " " + cliente.getApellidos());
        }

        //6.Eliminar un cliente
        gestor.eliminarCliente("A12345678");
        System.out.println("Total de clientes tras la eliminación: " + gestor.obtenerTodos().size());
    }
}
