package com.mercury.SpringBootRestDemo.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "MSI_ORDER_PRODUCT")
public class OrderProduct {
    @Id
    @SequenceGenerator(name = "msi_order_product_seq_gen", sequenceName = "MSI_ORDER_PRODUCT_SEQ", allocationSize = 1)
    @GeneratedValue(generator="msi_order_product_seq_gen", strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int qty;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    private Product product;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    private Order order;

    public OrderProduct() {
    }

    public OrderProduct(int qty, Product product, Order order) {
        this.qty = qty;
        this.product = product;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @JsonIgnore
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderProduct{" +
                "id=" + id +
                ", qty=" + qty +
                ", product=" + product +
                ", order=" + order +
                '}';
    }
}
