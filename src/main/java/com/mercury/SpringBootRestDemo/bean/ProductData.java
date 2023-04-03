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

    @Column
    private String order_detail;

    @Column
    private String order_price;

    @Override
    public String toString() {
        return "AddToCart{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", product_id=" + product_id +
                ", product_qty=" + product_qty +
                ", order_detail='" + order_detail + '\'' +
                ", order_price='" + order_price + '\'' +
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

    public String getOrder_detail() {
        return order_detail;
    }

    public void setOrder_detail(String order_detail) {
        this.order_detail = order_detail;
    }

    public String getOrder_price() {
        return order_price;
    }

    public void setOrder_price(String order_price) {
        this.order_price = order_price;
    }

    public AddToCart(int id, String username, int product_id, int product_qty, String order_detail, String order_price) {
        this.id = id;
        this.username = username;
        this.product_id = product_id;
        this.product_qty = product_qty;
        this.order_detail = order_detail;
        this.order_price = order_price;
    }

    public AddToCart() {
    }
}
