package com.mercury.SpringBootRestDemo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name = "COMMENT_TABLE")
public class Comment {

    @Id
    private int id;

    @Column
    private String name;

    @Column
    private String review;

    @Column
    private int stars;

    @Column
    private String reviewdate;

    public Comment() {
    }
    public Comment(int id) {
        this.id = id;
    }

    public Comment(int id, String name, String review, int stars, String reviewdate) {
        this.id = id;
        this.name = name;
        this.review = review;
        this.stars = stars;
        this.reviewdate = reviewdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getReviewdate() {
        return reviewdate;
    }

    public void setReviewdate(String reviewdate) {
        this.reviewdate = reviewdate;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", review='" + review + '\'' +
                ", stars=" + stars +
                ", reviewdate='" + reviewdate + '\'' +
                '}';
    }
}
