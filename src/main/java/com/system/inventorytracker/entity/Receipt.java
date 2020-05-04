package com.system.inventorytracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;

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
    private ProductQuantity items;

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

    public ProductQuantity getItems() {
        return items;
    }

    public void setItems(ProductQuantity items) {
        this.items = items;
    }
}
