package sr.unasat.retailShop.designpatterns.chainOfResponsibility;

import static sr.unasat.retailShop.designpatterns.chainOfResponsibility.CouchTypeConstant.SOFA_BEDS;

public class SofaBedsHandler implements CouchesHandler {

    private CouchesHandler couchesHandler;

    @Override
    public void setNextCouchHandler(CouchesHandler nextChain) {
        this.couchesHandler = couchesHandler;

    }

    @Override
    public void check(Couches couches) {
        if (couches == null || couches.getBankstelType() == null || couches.getKwaliteit() == null || couches.getPrijs() == null) {
            System.out.println("U moet een valide bankstel type aangeven");

        } if (SOFA_BEDS.equals(couches.getBankstelType())) {
            System.out.println("het " + SOFA_BEDS + " is besteld en wordt geleverd");

        }else {
            this.couchesHandler.check(couches);
        }

    }
}
