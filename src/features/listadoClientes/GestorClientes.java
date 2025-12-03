package features.listadoClientes;

import java.util.ArrayList;
import java.util.List;

public class GestorClientes {
    //creas el ALMACÉN: una lista para guardar a todos los objetos Cliente
    private final List<Cliente> listadoClientes;

    //creas el CONSTRUCTOR: Inicializa la lista cuando se crea un GestorClientes
    public GestorClientes() {
        this.listadoClientes = new ArrayList<>();
    }
//Implementas las operaciones básicas:

    //añadir Cliente
    public void anadirCliente(Cliente cliente) {
        this.listadoClientes.add(cliente);
        System.out.println("Cliente añadido con éxito: " + cliente.getNombre());
    }

    //recuperar listado completo
    public List<Cliente> obtenerTodos() {
        return this.listadoClientes;
    }

    //recuperar por Provincia
    /*
     Recupera un listado de clientes que residen en una provincia específica.
     @param provinciaBuscada El nombre de la provincia a buscar.
     @return Una lista de objetos Cliente que cumplen con el criterio.
     */
    public List<Cliente> obtenerPorProvincia(String provinciaBuscada) {
        //1.Creas una lista donde guardar los clientes que cumplen el filtro.
        List<Cliente> clientesPorProvincia = new ArrayList<>();

        //2.Recorres la lista completa de clientes
        for (Cliente cliente : listadoClientes) {

            //3.Comparas la provincia del cliente actual con la provinciaBuscada
            //Se usa equalsIgnoreCase() para ignorar mayúsculas/minúsculas en la búsqueda.
            if (cliente.getProvincia().equalsIgnoreCase(provinciaBuscada)) {
                clientesPorProvincia.add(cliente);
            }
        }
        return clientesPorProvincia;
    }


    //recuperar por NIF
    public Cliente obtenerCliente(String nif) {
        for (Cliente cliente : listadoClientes) {
            if (cliente.getNIF().equalsIgnoreCase(nif)) {
                return cliente; //encontrado
            }
        }
        return null; //si no se encuentra
    }

    //eliminar un cliente
    public boolean eliminarCliente(String nif) {
        Cliente clienteAEliminar = obtenerCliente(nif); //Reutilizamos el método recuperar por nif.

        if (clienteAEliminar != null) {
            this.listadoClientes.remove(clienteAEliminar);
            return true; //eliminado con éxito
        }
        return false; //no se encontró el cliente.
    }

    //modificar un cliente (2 pasos: 1. buscas por nif (p.ej) 2. Si lo encuentras, llamas a sus setters para actualizar datos.
    public boolean modificarCliente(String nif, String nuevaDireccion, String nuevaLocalidad, String nuevaProvincia,
                                    String nuevoTelefono, String nuevoEmail) { //solo modifica datos dinámicos
        Cliente clienteAModificar = obtenerCliente(nif);

        if (clienteAModificar != null) {
            clienteAModificar.setDireccion(nuevaDireccion);
            clienteAModificar.setLocalidad(nuevaLocalidad);
            clienteAModificar.setProvincia(nuevaProvincia);
            clienteAModificar.setTelefono(nuevoTelefono);
            clienteAModificar.setEmail(nuevoEmail);
            return true;
        }
        return false;
    }

}
