package sr.unasat.retailShop.dao;

import sr.unasat.retailShop.entities.Customer;
import sr.unasat.retailShop.entities.Employees;
import sr.unasat.retailShop.entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class ProductDao {
    private EntityManager entityManager;

    public ProductDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Product findBynaam(String naam) {
        entityManager.getTransaction().begin();
        String jpql = "select p from Product p where p.naam = :naam";
        TypedQuery<Product> query = entityManager.createQuery(jpql, Product.class);
        Product product = query.setParameter("naam", naam).getSingleResult();
        entityManager.getTransaction().commit();
        return product;
    }

    public List<Product> retrieveProductList() {
        entityManager.getTransaction().begin();
        String jpql = "select p from Product p";
        TypedQuery<Product> query = entityManager.createQuery(jpql, Product.class);
        List<Product> productList = query.getResultList();
        entityManager.getTransaction().commit();
        return productList;
    }

//    public Product insert(Product product) {
//        entityManager.getTransaction().begin();
//        entityManager.persist(product);
//        entityManager.getTransaction().commit();
//        return product;
//    }

    public int delete(String naam) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from Product p where p.naam = :naam ");
        query.setParameter("naam", naam);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;


    }
}
