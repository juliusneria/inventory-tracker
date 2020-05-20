package com.system.inventorytracker.app.client;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


/**
 * Created by juliusneria on 24/05/2018.
 */
@Repository
public interface ClientPageRepository extends PagingAndSortingRepository<Client, Long> {
    @Query("SELECT it " +
            "FROM ItemType it " +
            "WHERE it.itemTypeName LIKE :search ")
    Page<Client> search(@Param("search") String search, Pageable pageable);

    Page<Client> findAll();
}
