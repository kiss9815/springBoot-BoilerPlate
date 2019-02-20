package com.boilerPlate.app.Vo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Item {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int price;

    @ManyToOne
    @JoinColumn(name = "CART_ID")
    private Cart cart;
}
