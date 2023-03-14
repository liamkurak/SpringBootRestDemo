package com.mercury.SpringBootRestDemo.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ADDTOCART")
public class AddToCart {

    @Id
    private int id;

    @Column
    private String username;

    @Column
    private int product_id;

    @Column
    private int product_qty;


    public AddToCart() {
    }

    @Override
    public String toString() {
        return "AddToCart{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", product_id=" + product_id +
                ", product_qty=" + product_qty +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getProduct_qty() {
        return product_qty;
    }

    public void setProduct_qty(int product_qty) {
        this.product_qty = product_qty;
    }

    public AddToCart(int id, String username, int product_id, int product_qty) {
        this.id = id;
        this.username = username;
        this.product_id = product_id;
        this.product_qty = product_qty;
    }
}
