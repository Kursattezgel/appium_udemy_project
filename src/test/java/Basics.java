import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomePage;
import pageObjects.Preferences;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Basics extends Base{
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = capabilities("real");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Preference\"]").click();
        HomePage homePage = new HomePage(driver);
        homePage.Preferences.click();

        Preferences preferences = new Preferences(driver);
        preferences.PreferenceDependencies.click();
        //driver.findElementByXPath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]").click();

        driver.findElementById("android:id/checkbox").click();
        driver.findElementsByClassName("android.widget.RelativeLayout").get(1).click();
        driver.findElementById("android:id/edit").sendKeys("Hello Guys");
        //driver.findElementById("android:id/button1").click();
        //driver.findElementsByClassName("android.widget.Button").get(1).click();

        preferences.Buttons.get(1).click();
    }
}