package com.system.inventorytracker.app.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by juliusneria on 29/05/2018.
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private final ClientRepository clientRepository;

    @Autowired
    private final ClientPageRepository clientPageRepository;

    public ClientServiceImpl(ClientRepository clientRepository, ClientPageRepository clientPageRepository) {
        this.clientRepository = clientRepository;
        this.clientPageRepository = clientPageRepository;
    }

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClient(Long clientId) {
        return clientRepository.findByClientId(clientId);
    }

    @Override
    public Page<Client> findAll() {
        return clientPageRepository.findAll();
    }

    @Override
    public Client update(Client client) {
        return clientRepository.updateClient(client.getId(), client.getClientName(), client.getClientAddress());
    }

    @Override
    public void deleteById(Long id) {

    }
}
