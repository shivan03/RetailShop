package sr.unasat.retailShop.designpatterns.factory;

public class Serta implements Merk{
    @Override
    public void merk() {
        System.out.println("matrassen van het merk Serta");
    }

    @Override
    public void prijs() {
        System.out.println("SRD 275");
    }
}
