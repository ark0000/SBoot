package com.dark;

public class Order {
    public Order(String custName, String prodName, String prodID) {
        this.custName=custName;
        this.prodID=prodID;
        this.prodName=prodName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }


    public String getCustName() {
        return custName;
    }

    public String getProdName() {
        return prodName;
    }

    public String getProdID() {
        return prodID;
    }

    private String prodName;
    private String prodID;
    private String custName;


    @Override
    public String toString() {
        return "Order{" +
                "custName='" + custName + '\'' +
                ", prodName='" + prodName + '\'' +
                ", prodID='" + prodID + '\'' +
                '}';
    }
}
