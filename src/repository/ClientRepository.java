package repository;

import features.Client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientRepository {

    // Singleton
    private static ClientRepository instance;

    private final Map<String, Client> clients;

    private ClientRepository() {
        clients = new HashMap<>();
    }

    public static ClientRepository getInstance() {
        if (instance == null) {
            instance = new ClientRepository();
        }
        return instance;
    }

    // Basic CRUD

    public void addClient(Client client) {
        clients.put(client.getNif(), client);
    }

    public Client getClientByNif(String nif) {
        return clients.get(nif);
    }

    public List<Client> getAllClients() {
        return new ArrayList<>(clients.values());
    }

    public void deleteClient(String nif) {
        clients.remove(nif);
    }

    public void updateClient(Client client) {
        clients.put(client.getNif(), client);
    }
}