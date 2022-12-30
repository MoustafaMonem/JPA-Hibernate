package org.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    public Address(){};
    public Address(String name){
        this.name = name;
    }
}
