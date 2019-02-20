package com.boilerPlate.app.Vo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	@Id
    @GeneratedValue
    private int id;

    private String name;

    private boolean paid;

    @OneToMany(mappedBy = "cart")
    private List<Item> items;
}
