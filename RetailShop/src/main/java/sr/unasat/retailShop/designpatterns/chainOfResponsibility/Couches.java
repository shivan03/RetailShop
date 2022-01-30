package sr.unasat.retailShop.designpatterns.chainOfResponsibility;

public class Couches {

    private String bankstelType;
    private String kwaliteit;
    private String prijs;

    public Couches(String bankstelType, String kwaliteit, String prijs) {
        this.bankstelType = bankstelType;
        this.kwaliteit = kwaliteit;
        this.prijs = prijs;
    }

    public String getBankstelType() {
        return bankstelType;
    }

    public void setBankstelType(String bankstelType) {
        this.bankstelType = bankstelType;
    }

    public String getKwaliteit() {
        return kwaliteit;
    }

    public void setKwaliteit(String kwaliteit) {
        this.kwaliteit = kwaliteit;
    }

    public String getPrijs() {
        return prijs;
    }

    public void setPrijs(String prijs) {
        this.prijs = prijs;
    }

    @Override
    public String toString() {
        return "Couches{" +
                "bankstelType='" + bankstelType + '\'' +
                ", kwaliteit='" + kwaliteit + '\'' +
                ", prijs='" + prijs + '\'' +
                '}';
    }
}
