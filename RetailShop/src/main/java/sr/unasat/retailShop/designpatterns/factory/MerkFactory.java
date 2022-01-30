package sr.unasat.retailShop.designpatterns.factory;

public class MerkFactory {

    public Merk getMerk (String merkType) {

        if (merkType == null) {
            return null;
        }

        if (merkType.equalsIgnoreCase("SEALY")) {
            return new Sealy();
        }else if(merkType.equalsIgnoreCase("SERTA")) {
            return new Serta();
        }else if (merkType.equalsIgnoreCase("SIERRA")) {
            return new Sierra();
        }

        return null;
    }



}
