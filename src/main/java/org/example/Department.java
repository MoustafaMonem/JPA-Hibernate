package org.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    public Department(){};
    public Department(String name){
        this.name = name;
    }

}
