package services;

import features.Client;

import java.util.ArrayList;
import java.util.List;
import repository.ClientRepository;

public class ClientService {

    private final ClientRepository repository;

    public ClientService() {
        this.repository = ClientRepository.getInstance();
    }

    public Client obtenerClientePorNif(String nif) {
        return repository.getClientByNif(nif);
    }

    public List<Client> obtenerTodosLosClientes() {
        return new ArrayList<>();
    }

    public void crearCliente(Client client) {
        repository.addClient(client);
    }

    public void eliminarCliente(String nif) {
        // To be implemented
    }

    public void modificarCliente(Client client) {
        // To be implemented
    }
}