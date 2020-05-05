package com.system.inventorytracker.entity;

import javax.persistence.*;

@Entity
public class ProductQuantity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long Id;
    private Integer received;
    private Integer issued;
    private Integer balance;
    @OneToOne
    private Product product;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getIssued() {
        return issued;
    }

    public void setIssued(Integer issued) {
        this.issued = issued;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
