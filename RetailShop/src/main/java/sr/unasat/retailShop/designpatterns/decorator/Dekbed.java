package sr.unasat.retailShop.designpatterns.decorator;

public class Dekbed extends BeddenSetDecorator{

    public Dekbed(BeddenSet beddenSet) {
        this.beddenSet = beddenSet;
    }


    public String getdescription() {
        return beddenSet.getdescription() + " en een dekbed erbij";
    }

    public double price() {
        return beddenSet.price();
    }
}
