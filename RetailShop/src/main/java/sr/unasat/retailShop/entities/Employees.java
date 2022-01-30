package sr.unasat.retailShop.entities;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import lombok.*;


@Entity
@Table(name = "employees")
public class Employees {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "employee_id")
    private long id;
    @Column
    private String voornaam;
    @Column
    private String achternaam;
    @Column
    private LocalDate geboortedatum;
    @Column
    private String salaris;
    @Column
    private String functie;




    public Employees(String voornaam, String achternaam, LocalDate geboortedatum, String salaris, String functie) {
        this.id = id;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
        this.salaris = salaris;
        this.functie = functie;
    }
    public Employees() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public String getSalaris() {
        return salaris;
    }

    public void setSalaris(String salaris) {
        this.salaris = salaris;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", geboortedatum=" + geboortedatum +
                ", salaris='" + salaris + '\'' +
                ", functie='" + functie + '\'' +
                '}';
    }
}

