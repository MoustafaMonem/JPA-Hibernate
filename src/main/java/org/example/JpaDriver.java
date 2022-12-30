package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaDriver {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction tx = em.getTransaction();

    public void createEmployee(Employee employee) {
        tx.begin();
        em.persist(employee);
        tx.commit();
    }

    public Employee findEmployee(int id) {
        return em.find(Employee.class, id);
    }
    public void deleteEmployee(int id) {
        Employee employee = em.find(Employee.class, id);
        if (employee != null) {
            tx.begin();
            em.remove(employee);
            tx.commit();
        }
    }
    public void updateEmployeeDepartment(int id, Department department) {
        Employee employee = em.find(Employee.class, id);
        if (employee != null) {
            tx.begin();
            employee.setDepartment(department);
            tx.commit();
        }
    }
}
