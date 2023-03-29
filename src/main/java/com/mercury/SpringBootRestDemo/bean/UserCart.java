package com.mercury.SpringBootRestDemo.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "USERCART")
public class UserCart {

    @Id
    private String username;

    @Column
    private String cart_data;

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "UserCart{" +
                "username='" + username + '\'' +
                ", cart_data='" + cart_data + '\'' +
                '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCart_data() {
        return cart_data;
    }

    public void setCart_data(String cart_data) {
        this.cart_data = cart_data;
    }

    public UserCart(String username, String cart_data) {
        this.username = username;
        this.cart_data = cart_data;
    }

    public UserCart() {
    }
}
