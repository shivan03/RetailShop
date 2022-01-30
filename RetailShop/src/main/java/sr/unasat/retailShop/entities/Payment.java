package sr.unasat.retailShop.entities;

import javax.persistence.*;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "betaling_id")
    private Long id;
    @Column(name = "betalings_methode")
    private String betalingsMethode;
    @Column(name = "kaart_nummer")
    private Long kaartNummer;
    @Column(name = "naam_op_kaart")
    private String naamOpKaart;

    // private Customer customer;
    // private Employees employees;


    public Payment(String betalingsMethode, Long kaartNummer, String naamOpKaart) {
        this.betalingsMethode = betalingsMethode;
        this.kaartNummer = kaartNummer;
        this.naamOpKaart = naamOpKaart;
    }

    public Payment() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBetalingsMethode() {
        return betalingsMethode;
    }

    public void setBetalingsMethode(String betalingsMethode) {
        this.betalingsMethode = betalingsMethode;
    }

    public Long getKaartNummer() {
        return kaartNummer;
    }

    public void setKaartNummer(Long kaartNummer) {
        this.kaartNummer = kaartNummer;
    }

    public String getNaamOpKaart() {
        return naamOpKaart;
    }

    public void setNaamOpKaart(String naamOpKaart) {
        this.naamOpKaart = naamOpKaart;
    }

//    // public Customer getCustomer() {
//    //    return customer;
//    }

//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }


//    public Employees getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(Employees employees) {
//        this.employees = employees;
//    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", betalingsMethode='" + betalingsMethode + '\'' +
                ", kaartNummer=" + kaartNummer +
                ", naamOpKaart='" + naamOpKaart + '\'' +
                //", customer=" + customer +

                //", employees=" + employees +
                '}';
    }
}
