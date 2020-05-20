package com.system.inventorytracker.app.quantity;

import com.system.inventorytracker.app.product.Product;

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
    private boolean isDelete;

    @PrePersist
    protected void prePersist(){
        isDelete = false;
    }

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

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
