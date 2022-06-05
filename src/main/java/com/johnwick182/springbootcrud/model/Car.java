package com.johnwick182.springbootcrud.model;

import javax.persistence.*;

@Entity
@Table(name="Car")
public class Car {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String model;
    private String brand;
    private int hp;
    private int maxSpeed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car() {}

    public Car(int id, String model, String brand, int hp, int maxSpeed) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.hp = hp;
        this.maxSpeed = maxSpeed;
    }
}
