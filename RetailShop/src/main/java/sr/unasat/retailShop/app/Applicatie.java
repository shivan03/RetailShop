package sr.unasat.retailShop.app;


import sr.unasat.retailShop.config.JpaConfig;
import static sr.unasat.retailShop.designpatterns.chainOfResponsibility.CouchTypeConstant.*;

import sr.unasat.retailShop.dao.*;

import sr.unasat.retailShop.designpatterns.chainOfResponsibility.Couches;
import sr.unasat.retailShop.designpatterns.chainOfResponsibility.CouchesChain;

import sr.unasat.retailShop.designpatterns.decorator.BedInABag;
import sr.unasat.retailShop.designpatterns.decorator.BeddenSet;
import sr.unasat.retailShop.designpatterns.decorator.Dekbed;
import sr.unasat.retailShop.designpatterns.decorator.Laken;
import sr.unasat.retailShop.designpatterns.factory.*;
import sr.unasat.retailShop.entities.*;

import java.time.LocalDate;
import java.util.List;


public class Applicatie {

    public static void main(String[] args) {
        JpaConfig.getEntityManager();
//       EmployeesDao employeesDao  = new EmployeesDao(JpaConfig.getEntityManager());
//       OrdersDao ordersDao = new OrdersDao(JpaConfig.getEntityManager());
//       AdressDao adressDao = new AdressDao(JpaConfig.getEntityManager());
//       ProductDao productDao = new ProductDao(JpaConfig.getEntityManager());
//       BillDao billDao = new BillDao((JpaConfig.getEntityManager()));
//       CustomerDao customerDao = new CustomerDao(JpaConfig.getEntityManager());
//        PaymentDao paymentDao = new PaymentDao(JpaConfig.getEntityManager());
        ProductDetailsDao productDetailsDao = new ProductDetailsDao(JpaConfig.getEntityManager());
//        ProductGroupDao productGroupDao = new ProductGroupDao(JpaConfig.getEntityManager());
//        SupplierDao supplierDao = new SupplierDao(JpaConfig.getEntityManager());


//              EMPLOYEES

        //insert

//        Employees employees = new Employees( "Mark", "Wirjo", LocalDate.parse("1994-05-12"), "SRD 2000", "verkoper");
//
//        Employees savedEmployee = employeesDao.insert(employees);
//        System.out.println(savedEmployee);


        //        delete
//        Employees foundDeletedEmployee = employeesDao.findByVoornaam("Darius");
//        int totalRecordsDeleted = employeesDao.delete("Darius");
//        System.out.println(totalRecordsDeleted);
//        System.out.println(foundDeletedEmployee);
//
//        JpaConfig.shutdown();

//              ORDERS

//          ophaal orders

//        List<Orders> ordersList = ordersDao.retrieveOrdersList();
//        ordersList.stream().forEach(System.out::println);
//        for (Orders orders : ordersList) {
//            System.out.println(orders);
//        }

//              PRODUCT

//          ophaal product
//        List<Product> productList = productDao.retrieveProductList();
//        productList.stream().forEach(System.out::println);
//        for (Product product : productList) {
//            System.out.println(product);
//        }


//              ADDRESS

//      ophaal
//        List<Address> addressList = adressDao.retrieveAddressList();
//        addressList.stream().forEach(System.out::println);
//    for(Address address : addressList){
//      System.out.println(address);
//    }

        //insert

//        Address address = new Address("Kokrostraat", 30);
//        Address savedAdress = adressDao.insert(address);
//        System.out.println(savedAdress);


        //          update

//        Address address = new Address();
//
//        Address foundAddress = adressDao.findByNaam("Wilhelminastraat");
//        System.out.println(foundAddress);
//        foundAddress.setStraatNaam("Dorastraat");
//        int updatedRecords = adressDao.updateAddress(foundAddress);
//        System.out.println(updatedRecords);
//        System.out.println(foundAddress);


        //delete address
//        Address foundDeletedEmployee = adressDao.findByNaam("Kokrostraat");
//        int totalRecordsDeleted = adressDao.delete("Kokrostraat");
//        System.out.println(totalRecordsDeleted);
//        System.out.println(foundDeletedEmployee);
//
//        JpaConfig.shutdown();

//          BILL

//      ophaal
//       List<Bill> billList = billDao.retrieveBillList();
//       billList.stream().forEach(System.out::println);
//       for (Bill bill : billList) {
//           System.out.println(bill);
//       }

//      insert

//         Bill bill = new Bill(LocalDate.parse("2021-12-12"), "SRD 120");
//
//         Bill savedBill = billDao.insert(bill);
//          System.out.println(savedBill);

        // CUSTOMER

        //insert
//        Customer customer = new Customer("Chris", "Bang", "8973645", "chrisB97@gmail.com");
//
//         Customer savedCustomer = customerDao.insert(customer);
//          System.out.println(savedCustomer);
//
//        Customer deletedCustomer = customerDao.findByCustomerName("Chris");
//        int totalRecordsDeleted = customerDao.delete("Chris");
//        System.out.println(totalRecordsDeleted);
//        System.out.println(deletedCustomer);
//
//        JpaConfig.shutdown();

        // PAYMENT

//    ophaal
//        List<Payment> paymentList = paymentDao.retrievePaymentList();
//       paymentList.stream().forEach(System.out::println);
//       for (Payment payment : paymentList) {
//           System.out.println(payment);
//       }

       // insert
//       Payment payment = new Payment("kaart", 6013456045869823L, "Chris Bang");
//
//         Payment savedPayment = paymentDao.insert(payment);
//          System.out.println(savedPayment);

        //          SUPPLIER
////       ophaal
//        List<Supplier> supplierList = supplierDao.retrieveSupplier();
//        supplierList.stream().forEach(System.out::println);
//        for (Supplier supplier : supplierList) {
//            System.out.println(supplier);
//        }


        // PRODUCTDETAILS

        List<ProductDetails> productDetailsList = productDetailsDao.retrieveProductDetails();
        productDetailsList.stream().forEach(System.out::println);
        for (ProductDetails productDetails : productDetailsList) {
            System.out.println(productDetails);
        }



//          PRODUCTGROUP

//      ophaal
//         List<ProductGroup> productGroupList = productGroupDao.retrieveProductGroup();
//         productGroupList.stream().forEach(System.out::println);
//       for (ProductGroup productGroup : productGroupList) {
//           System.out.println(productGroup);
//       }


//












//                      factory pattern

//        Applicatie app = new Applicatie();
//        app.factoryDemo();
//    }
//
//    private void factoryDemo() {
//        MerkFactory merkFactory = new MerkFactory();
//        Merk merk1 = merkFactory.getMerk("Sealy");
//        merk1.merk();
//        merk1.prijs();
//
//        Merk merk2 = merkFactory.getMerk("Serta");
//        merk2.merk();
//        merk2.prijs();
//
//        Merk merk3 = merkFactory.getMerk("Sierra");
//        merk3.merk();
//        merk3.prijs();


//        CouchesChain couchesChain = new CouchesChain();
//        Couches couches = new Couches(null, "stog", "SRD 1000");
//        couchesChain.firstCouchHandler.check(couches);

//        BeddenSet beddenSet = new BedInABag();
//        BeddenSet lakenset = new Laken(beddenSet);
//        BeddenSet dekbedset = new Dekbed(lakenset);
//        System.out.println(lakenset.getdescription()
//        + " : SRD" + lakenset.price());



    


    }
}
