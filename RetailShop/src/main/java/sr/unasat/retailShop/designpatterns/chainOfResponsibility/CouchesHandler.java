package sr.unasat.retailShop.designpatterns.chainOfResponsibility;

interface CouchesHandler {

    void setNextCouchHandler(CouchesHandler nextChain);

    void check(Couches couches) ;

    default void validate(Couches couches) {
        if (couches == null || couches.getBankstelType() == null || couches.getKwaliteit() == null || couches.getPrijs() == null) {
            System.out.println("Er is geen bankstel type aangegeven");
            return;
        }
    }

}
