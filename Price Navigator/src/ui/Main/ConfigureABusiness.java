/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Main;

import model.Business.Business;
import model.SuperMarketManagement.SuperMarketDirectory;
import model.SuperMarketManagement.SuperMarketProfile;
import model.LogisticPartner.LogisticPartnerDirectory;
import model.LogisticPartner.LogisticPartnerProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.EmployeeDirectory;
import model.Personnel.EmployeeProfile;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.RegularUser.RegularUserDirectory;
import model.RegularUser.RegularUserProfile;
import model.RegulatoryBody.RegulatoryBodyDirectory;
import model.RegulatoryBody.RegulatoryBodyProfile;
import model.DistributorManagement.DistributorPersonDirectory;
import model.DistributorManagement.DistributorPersonProfile;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.Supplier.SupplierProfile;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author Aniruddha
 */
class ConfigureABusiness {

    static Business initialize() {

        Business business = new Business("Global Foods Inc.");
        SupplierDirectory suplierdirectory = business.getSupplierDirectory();
        //Supplier 1

        Supplier supplier1 = suplierdirectory.newSupplier("CandyCraft Confections");
        ProductCatalog productCatalog1 = supplier1.getProductCatalog();

        Product products1p1 = productCatalog1.newProduct("Chocolate Bliss Bars", 45.0, 20.0, 5.0, 10.0, 7000, 16500, 10000);
        Product products1p2 = productCatalog1.newProduct("Gourmet Gummies", 30.0, 15.0, 3.0, 5.0, 10000, 25000, 16500);
        Product products1p3 = productCatalog1.newProduct("Heavenly Honeycomb", 50.0, 25.0, 8.0, 12.0, 22000, 40000, 36500);
        Product products1p4 = productCatalog1.newProduct("Creamy Dreamy Fudge", 55.0, 30.0, 10.0, 15.0, 30000, 70000, 50000);
        Product products1p5 = productCatalog1.newProduct("Luxury Lollipops", 35.0, 18.0, 6.0, 9.0, 19000, 36500, 25000);
        Product products1p6 = productCatalog1.newProduct("Silky Truffles", 40.0, 22.0, 7.0, 11.0, 90000, 125000, 105000);
        Product products1p7 = productCatalog1.newProduct("Caramel Crisps", 43.0, 19.0, 6.0, 9.0, 22000, 60000, 36500);
        Product products1p8 = productCatalog1.newProduct("Fruit Delight Drops", 38.0, 18.0, 5.5, 8.0, 30000, 70000, 50000);
        Product products1p9 = productCatalog1.newProduct("Pecan Pleasures", 47.0, 23.0, 9.0, 13.0, 30000, 70000, 50000);
        Product products1p10 = productCatalog1.newProduct("Mint Magic Cookies", 39.0, 20.0, 7.0, 10.0, 30000, 70000, 50000);

// Supplier 2: Bakery Products
        Supplier supplier2 = suplierdirectory.newSupplier("Staples");
        ProductCatalog productCatalog2 = supplier2.getProductCatalog();

        Product products2p1 = productCatalog2.newProduct("ClearWrite Pens", 25.0, 12.0, 15.0, 4.0, 300, 120, 443);
        Product products2p2 = productCatalog2.newProduct("BrightNotes Pads", 30.0, 14.0, 18.0, 7.0, 320, 130, 464);
        Product products2p3 = productCatalog2.newProduct("SmoothErase Erasers", 5.0, 2.0, 12.0, 0.0, 340, 140, 485);
        Product products2p4 = productCatalog2.newProduct("SharpSketch Pencils", 20.0, 10.0, 5.0, 6.0, 360, 150, 506);
        Product products2p5 = productCatalog2.newProduct("GripClips Paper Clips", 3.0, 0.5, 11.0, 0.0, 380, 160, 527);
        Product products2p6 = productCatalog2.newProduct("QuickStick Glue", 27.0, 3.0, 16.0, 2.0, 400, 170, 548);
        Product products2p7 = productCatalog2.newProduct("EasyFile Folders", 25.0, 12.0, 5.0, 8.0, 420, 180, 569);
        Product products2p8 = productCatalog2.newProduct("PerfectPoint Markers", 28.0, 15.0, 19.0, 10.0, 440, 190, 590);
        Product products2p9 = productCatalog2.newProduct("TrueBind Binders", 4.0, 1.0, 14.0, 0.0, 460, 200, 611);
        Product products2p10 = productCatalog2.newProduct("LastingLines Rulers", 23.0, 13.0, 6.0, 5.0, 480, 210, 632);

        Supplier supplier3 = suplierdirectory.newSupplier("VitalFlow Beverages");
        ProductCatalog productCatalog3 = supplier3.getProductCatalog();

        Product products3p1 = productCatalog3.newProduct("UltraBlast Energy", 40.0, 0.0, 20.0, 0.0, 500, 220, 653);
        Product products3p2 = productCatalog3.newProduct("MegaFizz Cola", 0.0, 0.0, 18.0, 0.0, 520, 230, 674);
        Product products3p3 = productCatalog3.newProduct("HyperHydrate Sports Drink", 30.0, 0.0, 5.0, 0.0, 540, 240, 695);
        Product products3p4 = productCatalog3.newProduct("SparkleSprint Soda", 0.0, 0.0, 0.0, 0.0, 560, 250, 716);
        Product products3p5 = productCatalog3.newProduct("PowerPunch Energy", 25.0, 0.0, 15.0, 0.0, 580, 260, 737);
        Product products3p6 = productCatalog3.newProduct("ChillBerry Soda", 35.0, 0.0, 5.0, 0.0, 600, 270, 758);
        Product products3p7 = productCatalog3.newProduct("RushHour Energy", 28.0, 0.0, 25.0, 0.0, 620, 280, 779);
        Product products3p8 = productCatalog3.newProduct("GlowGrape Soda", 24.0, 0.0, 19.0, 0.0, 640, 290, 800);
        Product products3p9 = productCatalog3.newProduct("FusionFlow Energy", 0.0, 0.0, 3.0, 0.0, 660, 300, 821);
        Product products3p10 = productCatalog3.newProduct("CrystalClear Soda", 0.0, 0.0, 2.0, 0.0, 680, 310, 842);

        Supplier supplier4 = suplierdirectory.newSupplier("CrunchTime Snacks");
        ProductCatalog productCatalog4 = supplier4.getProductCatalog();

// Adding snack products to Snack Heaven
        Product products4p1 = productCatalog4.newProduct("PopChips Delight", 35.0, 22.0, 25.0, 0.0, 700, 320, 863);
        Product products4p2 = productCatalog4.newProduct("MunchyMix Trail", 0.0, 0.0, 30.0, 0.0, 720, 330, 884);
        Product products4p3 = productCatalog4.newProduct("CrispyTwist Pretzels", 10.0, 15.0, 20.0, 0.0, 740, 340, 905);
        Product products4p4 = productCatalog4.newProduct("GoldenGraze Granola", 25.0, 20.0, 22.0, 1.0, 760, 350, 926);
        Product products4p5 = productCatalog4.newProduct("CheeseCrunch Bites ", 15.0, 5.0, 33.0, 25.0, 780, 360, 947);
        Product products4p6 = productCatalog4.newProduct("SweetSpiral Cookies", 20.0, 10.0, 15.0, 5.0, 800, 370, 968);
        Product products4p7 = productCatalog4.newProduct("ZestyZing Popcorn", 0.0, 15.0, 30.0, 0.0, 820, 380, 989);
        Product products4p8 = productCatalog4.newProduct("NuttyNibbles Bars", 5.0, 2.0, 28.0, 0.0, 840, 390, 1010);
        Product products4p9 = productCatalog4.newProduct("SizzleSticks Meat Snacks", 45.0, 0.0, 10.0, 0.0, 860, 400, 1031);
        Product products4p10 = productCatalog4.newProduct("FruitFiesta Chips", 25.0, 18.0, 15.0, 10.0, 880, 410, 1052);

// Supplier 5: Dairy Products
        Supplier supplier5 = suplierdirectory.newSupplier("Creamy Creations");
        ProductCatalog productCatalog5 = supplier5.getProductCatalog();

// Adding dairy products to Dairy Delights
        Product products5p1 = productCatalog5.newProduct("Velvet Vanilla Yogurt", 5.0, 3.0, 11.0, 20.0, 900, 420, 1073);
        Product products5p2 = productCatalog5.newProduct("Golden Gouda Cheese", 5.0, 0.0, 12.0, 1.0, 920, 430, 1094);
        Product products5p3 = productCatalog5.newProduct("Silky Smooth Butter", 0.5, 30.0, 2.0, 80.0, 940, 440, 1115);
        Product products5p4 = productCatalog5.newProduct("Choco Bliss Milk", 2.0, 25.0, 20.0, 100.0, 960, 450, 1136);
        Product products5p5 = productCatalog5.newProduct("Heavenly Heavy Cream", 15.0, 5.0, 12.0, 10.0, 980, 460, 1157);
        Product products5p6 = productCatalog5.newProduct("Cottage Charm", 20.0, 15.0, 5.0, 30.0, 1000, 470, 1178);
        Product products5p7 = productCatalog5.newProduct("Mozza Magic", 4.0, 5.0, 18.0, 20.0, 1020, 480, 1199);
        Product products5p8 = productCatalog5.newProduct("Lush Lassi", 3.0, 20.0, 10.0, 60.0, 1040, 490, 1220);
        Product products5p9 = productCatalog5.newProduct("Creamy Custard", 4.0, 23.0, 15.0, 70.0, 1060, 500, 1241);
        Product products5p10 = productCatalog5.newProduct("Brie Bliss", 2.5, 22.0, 18.0, 90.0, 1080, 510, 1262);

// Create PersonDirectory Object
        PersonDirectory persondirectory = business.getPersonDirectory();

// Creating SalesPerson       
        Person xeroxsalesperson001 = persondirectory.newPerson("Distributor", "Distributor", "sample@gmail.com", " ", " ", 10);

        //Creating Admin
        Person adminUser = persondirectory.newPerson("Admin", "Admin", "sample@gmail.com", " ", " ", 10);

        // Create Admins to manage the business
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile adminUser00 = employeedirectory.newEmployeeProfile(adminUser);

// We are create person objects to represent customer organizations. 
        Person customer1 = persondirectory.newPerson("Walmart", "Walmart", "aniruddhachitte123@gmail.com", " ", " ", 0);

        Person customer2 = persondirectory.newPerson("BestBuy", "BestBuy", "aniruddhachitte111@gmail.com", " ", " ", 0);

        Person customer3 = persondirectory.newPerson("Target", "Target", "aniruddhachitte111@gmail.com", " ", " ", 0);

        Person customer4 = persondirectory.newPerson("Amazon", "Amazon", "aniruddhachitte111@gmail.com", " ", " ", 0);

        Person customer5 = persondirectory.newPerson("Flipkart", "Flipkart", "aniruddhachitte111@gmail.com", " ", " ", 0);

        Person customer6 = persondirectory.newPerson("Shaws", "Shaws", "aniruddhachitte111@gmail.com", " ", " ", 0);

        Person customer7 = persondirectory.newPerson("Costco", "Costco", "aniruddhachitte111@gmail.com", " ", " ", 0);

        Person customer8 = persondirectory.newPerson("Big Y", "Big Y", "aniruddhachitte111@gmail.com", " ", " ", 0);

        Person customer9 = persondirectory.newPerson("Stop&Shop", "Stop&Shop", "aniruddhachitte111@gmail.com", " ", " ", 0);

        Person customer10 = persondirectory.newPerson("IKEA", "IKEA", "aniruddhachitte111@gmail.com", " ", " ", 0);

// Creating Customers
        SuperMarketDirectory customedirectory = business.getCustomerDirectory();

        SuperMarketProfile customerprofile1 = customedirectory.newCustomerProfile(customer1);
        customerprofile1.setDistance(20);

        SuperMarketProfile customerprofile2 = customedirectory.newCustomerProfile(customer2);
        customerprofile2.setDistance(25);

        SuperMarketProfile customerprofile3 = customedirectory.newCustomerProfile(customer3);
        customerprofile3.setDistance(25);

        SuperMarketProfile customerprofile4 = customedirectory.newCustomerProfile(customer4);
        customerprofile4.setDistance(20);

        SuperMarketProfile customerprofile5 = customedirectory.newCustomerProfile(customer5);
        customerprofile5.setDistance(30);

        SuperMarketProfile customerprofile6 = customedirectory.newCustomerProfile(customer6);
        customerprofile6.setDistance(30);

        SuperMarketProfile customerprofile7 = customedirectory.newCustomerProfile(customer7);
        customerprofile7.setDistance(30);

        SuperMarketProfile customerprofile8 = customedirectory.newCustomerProfile(customer8);
        customerprofile8.setDistance(30);

        SuperMarketProfile customerprofile9 = customedirectory.newCustomerProfile(customer9);
        customerprofile9.setDistance(30);

        SuperMarketProfile customerprofile10 = customedirectory.newCustomerProfile(customer10);
        customerprofile10.setDistance(20);

// Create Sales people
        DistributorPersonDirectory salespersondirectory = business.getSalesPersonDirectory();

        DistributorPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson001);

// Create User accounts that link to specific sales profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();

        UserAccount ua1 = uadirectory.newUserAccount(salespersonprofile, "Distributor", "XXXX"); /// order products for one of the customers and performed by a sales person
        UserAccount admin = uadirectory.newUserAccount(adminUser00, "admin", "XXXX");
        UserAccount supermarketLogin = uadirectory.newUserAccount(customerprofile10, "IKEA", "XXXX");
        UserAccount amazonLogin = uadirectory.newUserAccount(customerprofile4, "Amazon", "XXXX");

        Person supplierPerson = persondirectory.newPerson("supplierDairy", "supplierDairy", "Pricenavigator1@gmail.com", "Vermont", "M", 0);

// Creating a SupplierProfile for the user account
        SupplierProfile supplierProfile = suplierdirectory.newSupplierProfile(supplier1, supplierPerson);

// Using the UserAccountDirectory to create a new account for the supplier
        UserAccount supplierAccount = uadirectory.newUserAccount(supplierProfile, "supplierDairy", "XXXX");

        RegularUserDirectory regularUserDirectory = new RegularUserDirectory();

        Person regularUser1 = persondirectory.newPerson("John", "John", "sameermalve1@gmail.com", "Massachusetts", "Male", 29);
        RegularUserProfile regularUserProfile1 = regularUserDirectory.newRegularUserProfile(regularUser1);
        UserAccount regularUserAccount1 = uadirectory.newUserAccount(regularUserProfile1, "regularUser1", "XXXX");

        Person regularUser2 = persondirectory.newPerson("Emily", "Emily", "emily@gmail.com", "Massachusetts", "Female", 26);
        RegularUserProfile regularUserProfile2 = regularUserDirectory.newRegularUserProfile(regularUser2);
        UserAccount regularUserAccount2 = uadirectory.newUserAccount(regularUserProfile2, "regularUser2", "XXXX");

        Person regularUser3 = persondirectory.newPerson("Liam", "Liam", "liam@gmail.com", "Massachusetts", "Male", 34);
        RegularUserProfile regularUserProfile3 = regularUserDirectory.newRegularUserProfile(regularUser3);
        UserAccount regularUserAccount3 = uadirectory.newUserAccount(regularUserProfile3, "regularUser3", "XXXX");

// Logistic Partners Creation
        LogisticPartnerDirectory logisticPartnerDirectory = new LogisticPartnerDirectory();

        Person logisticPartner1 = persondirectory.newPerson("Bob", "Bob", "bob@gmail.com", "Massachusetts", "Male", 40);
        LogisticPartnerProfile logisticPartnerProfile1 = logisticPartnerDirectory.newLogisticPartnerUserProfile(logisticPartner1);
        UserAccount lpAccount1 = uadirectory.newUserAccount(logisticPartnerProfile1, "logisticsUser1", "XXXX");

        Person logisticPartner2 = persondirectory.newPerson("Alice", "Alice", "alice@gmail.com", "Massachusetts", "Female", 32);
        LogisticPartnerProfile logisticPartnerProfile2 = logisticPartnerDirectory.newLogisticPartnerUserProfile(logisticPartner2);
        UserAccount lpAccount2 = uadirectory.newUserAccount(logisticPartnerProfile2, "logisticsUser2", "XXXX");

        Person logisticPartner3 = persondirectory.newPerson("Sean", "Sean", "sean@gmail.com", "Massachusetts", "Male", 38);
        LogisticPartnerProfile logisticPartnerProfile3 = logisticPartnerDirectory.newLogisticPartnerUserProfile(logisticPartner3);
        UserAccount lpAccount3 = uadirectory.newUserAccount(logisticPartnerProfile3, "logisticsUser3", "XXXX");

// Regulatory Body Users Creation
        RegulatoryBodyDirectory regulatoryBodyDirectory = new RegulatoryBodyDirectory();

        Person regulatoryBody1 = persondirectory.newPerson("Sophia", "Sophia", "sophia@gmail.com", "Massachusetts", "Female", 28);
        RegulatoryBodyProfile regulatoryBodyProfile1 = regulatoryBodyDirectory.newRegularatoryBodyProfile(regulatoryBody1);
        UserAccount regularBodyAccount1 = uadirectory.newUserAccount(regulatoryBodyProfile1, "regularBodyUser1", "XXXX");

        Person regulatoryBody2 = persondirectory.newPerson("Noah", "Noah", "noah@gmail.com", "Massachusetts", "Male", 30);
        RegulatoryBodyProfile regulatoryBodyProfile2 = regulatoryBodyDirectory.newRegularatoryBodyProfile(regulatoryBody2);
        UserAccount regularBodyAccount2 = uadirectory.newUserAccount(regulatoryBodyProfile2, "regularBodyUser2", "XXXX");

        Person regulatoryBody3 = persondirectory.newPerson("Grace", "Grace", "grace@gmail.com", "Massachusetts", "Female", 35);
        RegulatoryBodyProfile regulatoryBodyProfile3 = regulatoryBodyDirectory.newRegularatoryBodyProfile(regulatoryBody3);
        UserAccount regularBodyAccount3 = uadirectory.newUserAccount(regulatoryBodyProfile3, "regularBodyUser3", "XXXX");

// Process 10 default Orders on behalf of sales person and customer
/*
         Person regularUser = persondirectory.newPerson("user","Mark","Mark@gmail.com","Massachuctes","Male",31);
         Person logisticPartner = persondirectory.newPerson("LogisticPartner","Allen","allen@gmail.com","Massachuctes","Male",35);
         Person regulatoryBody = persondirectory.newPerson("RegulatoryBody","Eva","Eva@gmail.com","Massachuctes","Male",24);
         
         // Adding to Userdirectory
         
         RegularUserDirectory regularUserDirectory = new RegularUserDirectory();
         RegularUserProfile regularUserProfile = regularUserDirectory.newRegularUserProfile(regularUser);

// Assuming you have a method to create user accounts that takes a profile as an argument
        UserAccount regularUserAccount = uadirectory.newUserAccount(regularUserProfile, "regularUser", "XXXX");
        
        LogisticPartnerDirectory lpd = new LogisticPartnerDirectory();
        LogisticPartnerProfile lpp = lpd.newLogisticPartnerUserProfile(logisticPartner);
        UserAccount lpAccount = uadirectory.newUserAccount(lpp, "logisticsUser", "XXXX");
        
        
        RegulatoryBodyDirectory rbd = new RegulatoryBodyDirectory();
        RegulatoryBodyProfile rbp = rbd.newRegularatoryBodyProfile(regulatoryBody);
        
        UserAccount regularBodyAccount = uadirectory.newUserAccount(rbp, "regularBodyUser", "XXXX");
         */
        MasterOrderList masterorderlist = business.getMasterOrderList();

        //Walmart Orders       
        Order Walmart1 = masterorderlist.newOrder(customerprofile1, salespersonprofile);

        OrderItem Walmart11 = Walmart1.newOrderItem(products1p1, 17000, 1);

        OrderItem Walmart12 = Walmart1.newOrderItem(products1p2, 9500, 4);

        OrderItem Walmart13 = Walmart1.newOrderItem(products1p3, 29500, 10);

        OrderItem Walmart14 = Walmart1.newOrderItem(products1p4, 30000, 1);

        OrderItem Walmart15 = Walmart1.newOrderItem(products1p5, 2000, 3);

        OrderItem Walmart16 = Walmart1.newOrderItem(products1p6, 95000, 2);

        OrderItem Walmart17 = Walmart1.newOrderItem(products1p7, 26500, 3);

        OrderItem Walmart18 = Walmart1.newOrderItem(products1p8, 40000, 2);

        OrderItem Walmart19 = Walmart1.newOrderItem(products1p9, 40000, 2);

        OrderItem Walmart110 = Walmart1.newOrderItem(products1p10, 40000, 2);

        //BestBuy products
        Order BestBuy1 = masterorderlist.newOrder(customerprofile2, salespersonprofile);

        OrderItem BestBuy11 = BestBuy1.newOrderItem(products1p1, 17000, 1);

        OrderItem BestBuy12 = BestBuy1.newOrderItem(products1p2, 9500, 4);

        OrderItem BestBuy13 = BestBuy1.newOrderItem(products1p3, 29500, 10);

        OrderItem BestBuy14 = BestBuy1.newOrderItem(products1p4, 30000, 1);

        OrderItem BestBuy15 = BestBuy1.newOrderItem(products1p5, 2000, 3);

        OrderItem BestBuy16 = BestBuy1.newOrderItem(products1p6, 95000, 2);

        OrderItem BestBuy17 = BestBuy1.newOrderItem(products1p7, 26500, 3);

        OrderItem BestBuy18 = BestBuy1.newOrderItem(products1p8, 40000, 2);

        OrderItem BestBuy19 = BestBuy1.newOrderItem(products1p9, 40000, 2);

        OrderItem BestBuy110 = BestBuy1.newOrderItem(products1p10, 40000, 2);

        //Target Orders
        Order Target1 = masterorderlist.newOrder(customerprofile3, salespersonprofile);

        OrderItem Target11 = Target1.newOrderItem(products1p1, 17000, 1);

        OrderItem Target12 = Target1.newOrderItem(products1p2, 9500, 4);

        OrderItem Target13 = Target1.newOrderItem(products1p3, 29500, 10);

        OrderItem Target14 = Target1.newOrderItem(products1p4, 30000, 1);

        OrderItem Target15 = Target1.newOrderItem(products1p5, 2000, 3);

        OrderItem Target16 = Target1.newOrderItem(products1p6, 95000, 2);

        OrderItem Target17 = Target1.newOrderItem(products1p7, 26500, 3);

        OrderItem Target18 = Target1.newOrderItem(products1p8, 40000, 2);

        OrderItem Target19 = Target1.newOrderItem(products1p9, 40000, 2);

        OrderItem Target110 = Target1.newOrderItem(products1p10, 40000, 2);

        //Amazon Orders
        Order amazonOrder1 = masterorderlist.newOrder(customerprofile4, salespersonprofile);

        OrderItem amazonOrder11 = amazonOrder1.newOrderItem(products1p1, 18000, 1);

        OrderItem amazonOrder12 = amazonOrder1.newOrderItem(products1p2, 19500, 4);

        OrderItem amazonOrder13 = amazonOrder1.newOrderItem(products1p3, 36500, 10);

        OrderItem amazonOrder14 = amazonOrder1.newOrderItem(products1p4, 50000, 1);

        OrderItem amazonOrder15 = amazonOrder1.newOrderItem(products1p5, 25000, 3);

        OrderItem amazonOrder16 = amazonOrder1.newOrderItem(products1p6, 105000, 2);

        OrderItem amazonOrder17 = amazonOrder1.newOrderItem(products1p7, 36500, 3);

        OrderItem amazonOrder18 = amazonOrder1.newOrderItem(products1p8, 50000, 2);

        OrderItem amazonOrder19 = amazonOrder1.newOrderItem(products1p9, 40000, 2);

        OrderItem amazonOrder110 = amazonOrder1.newOrderItem(products1p10, 20000, 2);

        //Flipkart Orders
        Order flipkartOrder1 = masterorderlist.newOrder(customerprofile5, salespersonprofile);

        OrderItem flipkartOrder11 = flipkartOrder1.newOrderItem(products1p1, 17000, 1);

        OrderItem flipkartOrder12 = flipkartOrder1.newOrderItem(products1p2, 9500, 4);

        OrderItem flipkartOrder13 = flipkartOrder1.newOrderItem(products1p3, 29500, 10);

        OrderItem flipkartOrder14 = flipkartOrder1.newOrderItem(products1p4, 30000, 1);

        OrderItem flipkartOrder15 = flipkartOrder1.newOrderItem(products1p5, 2000, 3);

        OrderItem flipkartOrder16 = flipkartOrder1.newOrderItem(products1p6, 95000, 2);

        OrderItem flipkartOrder17 = flipkartOrder1.newOrderItem(products1p7, 26500, 3);

        OrderItem flipkartOrder18 = flipkartOrder1.newOrderItem(products1p8, 40000, 2);

        OrderItem flipkartOrder19 = flipkartOrder1.newOrderItem(products1p9, 10000, 2);

        OrderItem flipkartOrder110 = flipkartOrder1.newOrderItem(products1p10, 50000, 2);

        return business;

    }

}
