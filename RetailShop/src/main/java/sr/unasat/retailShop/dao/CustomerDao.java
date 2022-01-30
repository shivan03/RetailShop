package sr.unasat.retailShop.dao;

import sr.unasat.retailShop.entities.Customer;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class CustomerDao {
    private EntityManager entityManager;

    public CustomerDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public  Customer findByCustomerName(String voornaam) {
        entityManager.getTransaction().begin();
        String jpql = "select c from Customer c where c.voornaam = :voornaam";
        TypedQuery<Customer> query = entityManager.createQuery(jpql, Customer.class);
        Customer customer = query.setParameter("voornaam", voornaam).getSingleResult();
        entityManager.getTransaction().commit();
        return customer;
    }

    public Customer insert(Customer customer) {
        entityManager.getTransaction().begin();
        entityManager.persist(customer);
        entityManager.getTransaction().commit();
        return customer;
    }

    public int delete(String voornaam) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from Customer c where c.voornaam = :voornaam");
        query.setParameter("voornaam", voornaam);
        int rowsDeleted = query.executeUpdate();
        System.out.println("deleted:" + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }



}
