package sr.unasat.retailShop.designpatterns.chainOfResponsibility;

public class CouchesChain {

    public CouchesHandler firstCouchHandler;

    public CouchesChain() {

        SectionalSofasHandler sectionalSofasHandler = new SectionalSofasHandler();
        SofaBedsHandler sofaBedsHandler = new SofaBedsHandler();
        HighBackSofasHandler highBackSofasHandler = new HighBackSofasHandler();
        sectionalSofasHandler.setNextCouchHandler(sofaBedsHandler);
        sofaBedsHandler.setNextCouchHandler(highBackSofasHandler);
        this.firstCouchHandler = sectionalSofasHandler;
    }

    public static void main(String[] args) {

        CouchesChain couchesChain = new CouchesChain();
        Couches couches = new Couches("Sectional", "stog", "SRD 1000");
        couchesChain.firstCouchHandler.check(couches);
    }
}
