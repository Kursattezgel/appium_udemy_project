package TestNGTutorial;

import org.testng.annotations.*;

import java.util.Iterator;

public class LoginCar {
    @BeforeClass
    public void befoclass(){
        System.out.println("before executing any method in the class");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("after executing all methods in the class");
    }
    @Parameters({"URL","APIKey/username"})
    @Test
    public void WebLoginCarLoan(String urlName, String key){
        //selenium
        System.out.println("weblogincar");
        System.out.println(urlName);
        System.out.println(key);
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
        System.out.println("MobileSigninCarLoan");;
    }

    @Test(dataProvider = "getData") //(enabled = false) (timeOut = 4000)
    public void MobileSignoutCarLoan(String username, String password) {
        //appium
        System.out.println("MobileSignoutCarLoan");
        System.out.println(username);
        System.out.println(password);
    }

    @Test(dependsOnMethods ={"WebLoginCarLoan","MobileSignoutCarLoan"} )
    public void APICarLoan(){
        //Rest API automation
        System.out.println("APIlogincar");
    }

    @DataProvider
    public Object[][] getData(){
        //1st combination - username password - good credit history= row
        //2nd - username password  - no credit history
        //3rd - fraudulent credit history
        Object[][] data = new Object[3][2];
        //1st set
        data[0][0] = "firstsetusername";
        data[0][1] = "firstpassword";
        //columns in the row are nothing but values for that particular combination(row)

        //2nd set
        data[1][0] = "secondsetusername";
        data[1][1] = "secondpassword";

        //3rd set
        data[2][0] = "thirdsetusername";
        data[2][1] = "thirdpassword";

        return data;

    }
}
