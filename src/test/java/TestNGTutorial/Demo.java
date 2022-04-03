package TestNGTutorial;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


import java.sql.SQLOutput;

public class Demo {

    @AfterTest
    public void lastExecution(){
        System.out.println("I will execute last");
    }

    @Test
    public void Demo(){
        System.out.println("hello"); //automation
    }

    @AfterSuite
    public void afSuite(){
        System.out.println("I am the no 1 from last");
    }
    @Test
    public void SecondTest(){
        System.out.println("bye");
    }
}
