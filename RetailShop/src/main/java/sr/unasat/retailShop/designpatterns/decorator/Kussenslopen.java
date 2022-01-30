package sr.unasat.retailShop.designpatterns.decorator;

public class Kussenslopen extends BeddenSetDecorator{

    public Kussenslopen(BeddenSet beddenSet) {
        this.beddenSet = beddenSet;
    }

    public String getdescription() {
        return beddenSet.getdescription() + " en kussenslopen erbij";
    }


    public double price() {
        return beddenSet.price() + 20;
    }
}
