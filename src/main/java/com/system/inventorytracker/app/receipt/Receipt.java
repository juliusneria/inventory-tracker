package com.system.inventorytracker.app.receipt;

import com.system.inventorytracker.app.client.Client;
import com.system.inventorytracker.app.quantity.ProductQuantity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Receipt {

    @Id
    private String transactionCode;
    private Date date;
    private String remarks;
    private String preparedBy;
    private Date deliveryDate;
    private boolean isTransmittal;
    @OneToMany
    private List<ProductQuantity> items;
    @OneToOne
    private Client client;
    private boolean isDelete;

    @PrePersist
    protected void prePersist(){
        isDelete = false;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPreparedBy() {
        return preparedBy;
    }

    public void setPreparedBy(String preparedBy) {
        this.preparedBy = preparedBy;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public boolean isTransmittal() {
        return isTransmittal;
    }

    public void setTransmittal(boolean transmittal) {
        isTransmittal = transmittal;
    }

    public List<ProductQuantity> getItems() {
        return items;
    }

    public void setItems(List<ProductQuantity> items) {
        this.items = items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
