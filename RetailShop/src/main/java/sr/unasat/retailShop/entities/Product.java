package sr.unasat.retailShop.entities;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "product_id")
    private Long id;
    private String naam;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "groep_id")
    private ProductGroup productGroup;

    @OneToOne (mappedBy = "product")
    private ProductDetails productDetails;

    @ManyToMany
    @JoinTable (name = "order_product"
    , joinColumns = {@JoinColumn(name = "product_id")},
    inverseJoinColumns = {@JoinColumn(name = "order_id")})
    private Set<Orders> orders;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public ProductGroup getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(ProductGroup productGroup) {
        this.productGroup = productGroup;
    }

    public ProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", productGroup=" + productGroup +
                ", productDetails=" + productDetails +
                ", orders=" + orders +
                '}';
    }
}
