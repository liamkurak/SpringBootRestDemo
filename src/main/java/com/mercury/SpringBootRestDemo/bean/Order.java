package com.mercury.SpringBootRestDemo.bean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "MSI_ORDER")
public class Order {
    @Id
    @SequenceGenerator(name = "msi_order_seq_gen", sequenceName = "MSI_ORDER_SEQ", allocationSize = 1)
    @GeneratedValue(generator="msi_order_seq_gen", strategy = GenerationType.AUTO)
    private int id;

    @Column
    private Date purchase_date;

    @Column
    private int userId;

    // let the order field of each element of the list point back to this order object
    // mappedBy only functions when get
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "order")
    private List<OrderProduct> orderProductList;

    public Order() {
    }

    public Order(Date purchase_date, int userId, List<OrderProduct> orderProductList) {
        this.purchase_date = purchase_date;
        this.userId = userId;
        this.orderProductList = orderProductList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(Date purchase_date) {
        this.purchase_date = purchase_date;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<OrderProduct> getOrderProductList() {
        return orderProductList;
    }

    public void setOrderProductList(List<OrderProduct> orderProductList) {
        this.orderProductList = orderProductList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", purchase_date=" + purchase_date +
                ", userId=" + userId +
                ", orderProductList=" + orderProductList +
                '}';
    }
}