package com.jumia.tests;

import com.jumia.tests.base.BaseClass;
import com.jumia.tests.pages.CartPage;
import com.jumia.tests.pages.HomePage;
import com.jumia.tests.pages.LoginPage;
import com.jumia.tests.pages.ShirtsPage;
import com.jumia.tests.utility.DataProviders;
import com.jumia.tests.utility.ExcelFileManger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class Testx extends BaseClass {
//    @DataProvider(name = "userData")
//    public Object[][] userData() throws IOException {
//        ExcelFileManger excelFile = new ExcelFileManger("src/test/java/testdata/JumiaTestData.xlsx");
//        return excelFile.getExcelData();
//    }
    @BeforeMethod
    public void setUp() {
        loadConfig();
        launchWeb();
    }

//    @Test(dataProvider = "NewUserData",dataProviderClass = DataProviders.class)
//    public void TC(String email,String password,String fname,String lname,String phone,String bdate) {
//        HomePage homePageObj = new HomePage();
//        LoginPage loginPageObj = new LoginPage();
//        ShirtsPage shirtsPageObj = new ShirtsPage();
//        CartPage cartPageObj =new CartPage();
//        homePageObj.skipWelcomePopUp();
//        homePageObj.openLoginPage();
//        loginPageObj.registerUser(email, password,fname,lname,phone,bdate);
//        boolean result = loginPageObj.validateAccountIsCreated();
//        Assert.assertTrue(result);
//        homePageObj.logOut();
//        homePageObj.openLoginPage();
//        loginPageObj.login(email, password);
//        homePageObj.navigateToShirtsCategory();
//        shirtsPageObj.addTProduct1ToCart();
//        shirtsPageObj.addTProduct2ToCart();
//        refreshCurrentPage();
//        Assert.assertEquals(cartPageObj.calculateProductsTotalPrice(),cartPageObj.subTotalPrice());
//    }
    @Test(priority =1,dataProvider = "Credentials",dataProviderClass = DataProviders.class)
    public void tc2(String email,String password,String fname,String lname,String phone,String bdate){
        HomePage homePageObj = new HomePage();
        LoginPage loginPageObj = new LoginPage();
        homePageObj.skipWelcomePopUp();
        homePageObj.openLoginPage();
        loginPageObj.registerUser(email, password,fname,lname,phone,bdate);
//        ExcelFileManger excelFileManger = new ExcelFileManger("src/test/java/testdata/TestData.xlsx");
//        String password= excelFileManger.getCellValue("Credentials",1,2);


    }
    @Test(priority = 2,dataProvider = "Login",dataProviderClass = DataProviders.class)
    public void tc3(String email,String password){
        HomePage homePageObj = new HomePage();
        LoginPage loginPageObj = new LoginPage();
        homePageObj.skipWelcomePopUp();
        homePageObj.openLoginPage();
        loginPageObj.login(email, password);
//        ExcelFileManger excelFileManger = new ExcelFileManger("src/test/java/testdata/TestData.xlsx");
//        String password= excelFileManger.getCellValue("Credentials",1,2);


    }
}
