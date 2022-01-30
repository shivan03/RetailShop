package sr.unasat.retailShop.entities;


import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long id;
    private String voornaam;
    private String achternaam;

    @Column(name = "telefoon_nummer")
    private String telefoonNummer;
    @Column(name = "email_adres")
    private String emailAdres;

    public Customer(String voornaam, String achternaam, String telefoonNummer, String emailAdres) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.telefoonNummer = telefoonNummer;
        this.emailAdres = emailAdres;
    }

    public Customer() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getTelefoonNummer() {
        return telefoonNummer;
    }

    public void setTelefoonNummer(String telefoonNummer) {
        this.telefoonNummer = telefoonNummer;
    }

    public String getEmailAdres() {
        return emailAdres;
    }

    public void setEmailAdres(String emailAdres) {
        this.emailAdres = emailAdres;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", telefoonNummer='" + telefoonNummer + '\'' +
                ", emailAdres='" + emailAdres + '\'' +

                '}';
    }
}
