package sr.unasat.retailShop.dao;

import sr.unasat.retailShop.entities.Employees;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.sql.SQLOutput;

public class EmployeesDao {

    private EntityManager entityManager;

    public EmployeesDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Employees findByVoornaam(String voornaam) {
        entityManager.getTransaction().begin();
        String jpql = "select e from Employees e where e.voornaam = :voornaam";
        TypedQuery<Employees> query = entityManager.createQuery(jpql, Employees.class);
        Employees employees = query.setParameter("voornaam", voornaam).getSingleResult();
        entityManager.getTransaction().commit();
        return employees;
    }

    public Employees insert(Employees employees) {
        entityManager.getTransaction().begin();
        entityManager.persist(employees);
        entityManager.getTransaction().commit();
        return employees;
    }

    public int delete(String voornaam) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from Employees e where e.voornaam = :voornaam ");
        query.setParameter("voornaam", voornaam);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }


}
