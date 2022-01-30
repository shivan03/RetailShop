package sr.unasat.retailShop.designpatterns.chainOfResponsibility;

import static sr.unasat.retailShop.designpatterns.chainOfResponsibility.CouchTypeConstant.HIGHBACK_SOFA;
import static sr.unasat.retailShop.designpatterns.chainOfResponsibility.CouchTypeConstant.SECTIONAL_SOFA;

public class HighBackSofasHandler implements CouchesHandler {

    private CouchesHandler nextCouchesHandler;
    @Override
    public void setNextCouchHandler(CouchesHandler nextCouchesHandler) {
        this.nextCouchesHandler = nextCouchesHandler;

    }

    @Override
    public void check(Couches couches) {
        if (couches == null || couches.getBankstelType() == null || couches.getKwaliteit() == null || couches.getPrijs() == null) {
            System.out.println("U moet een valide bankstel type aangeven");

    } if (HIGHBACK_SOFA.equals(couches.getBankstelType())) {
            System.out.println("het " + HIGHBACK_SOFA + " is besteld en wordt geleverd");
        } else {
            this.nextCouchesHandler.check(couches);
        }
    }
}
