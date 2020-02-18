package com.mission3;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Product {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer id;
    private String name;
    private Float price;

    public Product() {
    }

    public Product(Integer id, String name, Float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
