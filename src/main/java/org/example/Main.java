package org.example;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Mostafa");
        Department department1 = new Department("Computer");
        Address address1 = new Address("Benha");
        Address address2 = new Address("Cairo");
        Category category1 = new Category("Engineers");
        Category category2 = new Category("Managers");

        employee.setDepartment(department1);
        employee.addAddress(address1, address2);
        employee.addCategory(category1, category2);

        JpaDriver company = new JpaDriver();

        company.createEmployee(employee);

        Department department2 = new Department("Electrical");
        company.findEmployee(1);
        company.updateEmployeeDepartment(1, department2);
    }
}