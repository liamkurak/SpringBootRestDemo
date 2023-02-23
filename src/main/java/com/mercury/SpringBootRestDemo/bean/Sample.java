package com.mercury.SpringBootRestDemo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Sample {
    @Id
    private String name;
    @Column
    private int age;

    public Sample() {
    }

    public Sample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
