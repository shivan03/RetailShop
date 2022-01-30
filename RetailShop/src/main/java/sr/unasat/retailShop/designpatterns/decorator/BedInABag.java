package sr.unasat.retailShop.designpatterns.decorator;

public class BedInABag extends BeddenSet{

    public BedInABag() {
        description = "een dekbed, een bedrok, lakens en hoeslakens, kussenslopen, dekens en sierkussens";
    }


    public double price() {
        return 100;


    }
}
