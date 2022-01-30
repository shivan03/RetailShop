package sr.unasat.retailShop.designpatterns.factory;

public class Sierra implements Merk{
    @Override
    public void merk() {
        System.out.println("matrassen van het merk Sierra");
    }

    @Override
    public void prijs() {
        System.out.println("SRD 299");
    }
}
