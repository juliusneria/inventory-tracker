package com.system.inventorytracker.app.client;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by juliusneria on 21/05/2018.
 */
@Repository
public interface ClientRepository extends CrudRepository<Client,Long> {

    @Modifying
    @Query("UPDATE Client c SET c.isDelete = true WHERE c.Id = ?1")
    void deleteClient(Long clientId);

    @Modifying
    @Query("SELECT * FROM Client c WHERE c.Id = ?1")
    Client findByClientId(Long clientId);

    @Modifying
    @Query("UPDATE Client c SET " +
            "c.clientName = ?2, " +
            "c.clientAddress = ?3 " +
            "WHERE c.Id = ?1")
    Client updateClient(Long clientId, String clientName, String clientAddress);
}
