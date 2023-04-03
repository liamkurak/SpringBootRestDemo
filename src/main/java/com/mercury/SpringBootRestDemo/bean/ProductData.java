package com.mercury.SpringBootRestDemo.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "PRODUCTDATA")
public class ProductData {

    @Id
    private int id;

    @Column
    private int stock;

    @Column
    private float price;

    @Column
    private String name;

    @Column
    private String descri;

    @Column
    private String img;

    @Column
    private String category;

    @Column
    private String weight;

    @Override
    public String toString() {
        return "ProductData{" +
                "id=" + id +
                ", stock=" + stock +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", descri='" + descri + '\'' +
                ", img='" + img + '\'' +
                ", category='" + category + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public ProductData(int id, int stock, float price, String name, String descri, String img, String category, String weight) {
        this.id = id;
        this.stock = stock;
        this.price = price;
        this.name = name;
        this.descri = descri;
        this.img = img;
        this.category = category;
        this.weight = weight;
    }

    public ProductData() {
    }
}
