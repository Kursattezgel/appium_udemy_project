package TestNGTutorial;

import org.testng.annotations.*;

import java.sql.SQLOutput;

public class LoginCar {
    @BeforeClass
    public void befoclass(){
        System.out.println("before executing any method in the class");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("after executing all methods in the class");
    }
    @Parameters({"URL"})
    @Test
    public void WebLoginCarLoan(String urlName){
        //selenium
        System.out.println("weblogincar");
        System.out.println(urlName);
    }
    @BeforeMethod
    public void beforeevery(){
        System.out.println("I will execute before every test method in LoginCar class");
    }

    @AfterMethod
    public void afterevery(){
        System.out.println("I will execute after every test method in LoginCar class");
    }

    @Test(groups = {"Smoke"})
    public void MobileLoginCarLoan(){
        //Appium
        System.out.println("Mobilelogincar");
    }
    @BeforeSuite
    public void Bfsuite(){
        System.out.println("I am no 1");
    }
    @Test(enabled = false) //(timeOut = 4000)
    public void MobileSigninCarLoan() {
        //appium
        System.out.println("MobileSigninCarLoan");
    }

    @Test(timeOut = 4000) //(enabled = false)
    public void MobileSignoutCarLoan() {
        //appium
        System.out.println("MobileSignoutCarLoan");
    }

    @Test(dependsOnMethods ={"WebLoginCarLoan","MobileSignoutCarLoan"} )
    public void APICarLoan(){
        //Rest API automation
        System.out.println("APIlogincar");
    }
}
