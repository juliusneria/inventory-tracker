package com.system.inventorytracker.app.client;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by juliusneria on 21/05/2018.
 */
@Repository
public interface ClientService {

    //create
    Client save(Client itemType);

    //read
    Client getClient(Long clientId);

    //read all
    Page<Client> findAll();

    //update
    Client update(Client client);

    //delete
    void deleteById(Long id);
}
