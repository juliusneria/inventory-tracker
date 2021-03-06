package com.system.inventorytracker.app.product;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long Id;
    private String refNo;
    private boolean hasSerialNo;
    private String serialNo;
    private Double unitCost;
    private String productName;
    private String type;
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

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public boolean isHasSerialNo() {
        return hasSerialNo;
    }

    public void setHasSerialNo(boolean hasSerialNo) {
        this.hasSerialNo = hasSerialNo;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public Double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Double unitCost) {
        this.unitCost = unitCost;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
