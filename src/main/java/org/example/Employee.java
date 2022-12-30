package org.example;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToOne(cascade = ALL)
    private Department department;

    @OneToMany(cascade = ALL)
    @JoinColumn(name = "employeeID")
    private List<Address> addresses = new ArrayList<>();

    @ManyToMany(cascade = ALL)
    private List<Category> categories = new ArrayList<>();

    public Employee(){}
    public Employee(String name){
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addAddress(Address... addresses) {
        for(Address add : addresses)
            this.addresses.add(add);
    }

    public void addCategory(Category... categories) {
        for(Category c : categories)
            this.categories.add(c);
    }
}
