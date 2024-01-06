package com.herokuapp.theinternet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTests {

    @Test
    public void loginTest() {
        //Webdriver creation
        System.out.println("Test Started");
        WebDriver driver = new ChromeDriver();
        System.out.println("Browser opened");
        //Open test page
        String url = "http://the-internet.herokuapp.com/login";
        driver.get(url);

        driver.manage().window().maximize();
        System.out.println("Test is executed: GuilleRoche");
        driver.close();
    }

}
