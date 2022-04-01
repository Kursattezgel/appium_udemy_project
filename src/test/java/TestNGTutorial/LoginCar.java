package TestNGTutorial;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class LoginCar {

    @Test
    public void WebLoginCarLoan(){
        //selenium
        System.out.println("weblogincar");
    }

    @Test
    public void MobileLoginCarLoan(){
        //Appium
        System.out.println("Mobilelogincar");
    }

    @Test //(timeOut = 4000)
    public void MobileSigninCarLoan() {
        //appium
        System.out.println("MobileSigninCarLoan");
    }

    @Test //(enabled = false)
    public void MobileSignoutCarLoan() {
        //appium
        System.out.println("MobileSignoutCarLoan");
    }

    @Test
    public void APICarLoan(){
        //Rest API automation
        System.out.println("APIlogincar");
    }
}
