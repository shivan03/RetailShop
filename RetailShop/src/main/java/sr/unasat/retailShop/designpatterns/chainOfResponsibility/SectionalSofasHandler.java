package sr.unasat.retailShop.designpatterns.chainOfResponsibility;


import static sr.unasat.retailShop.designpatterns.chainOfResponsibility.CouchTypeConstant.SECTIONAL_SOFA;

public class SectionalSofasHandler implements CouchesHandler{

    private CouchesHandler nextCouchesHandler;
    @Override
    public void setNextCouchHandler(CouchesHandler nextCouchesHandler) {
        this.nextCouchesHandler = nextCouchesHandler;


    }

    public void check(Couches couches) {
        if (couches == null || couches.getBankstelType() == null || couches.getKwaliteit() == null || couches.getPrijs() == null) {
            System.out.println("U moet een valide bankstel type aangeven");

        } if (SECTIONAL_SOFA.equals(couches.getBankstelType())) {
            System.out.println("het " + SECTIONAL_SOFA + " is besteld en wordt geleverd");

        }else {
            this.nextCouchesHandler.check(couches);
        }



    }
}
