package sr.unasat.retailShop.designpatterns.factory;

public class Sealy implements Merk{
    @Override
    public void merk() {
        System.out.println("matrassen van het merk Sealy");
    }

    @Override
    public void prijs() {
        System.out.println("SRD 765");    }
}
