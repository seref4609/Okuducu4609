package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpenBrowser {

    public static void main(String[] args) {

        //we have to enter this line eve//        //we have to enter this line every time we want to open chrome
        ////        //hey webdrivermanager, can you make chrome ready for me for automation
        ////        WebDriverManager.chromedriver().setup();
        ////
        ////        //WebDriver represent the browser
        ////        //we are creating driver for chrome browser
        ////        //new ChromeDriver() --> this part will open chrome browser
        ////        WebDriver driver = new ChromeDriver();
        ////
        ////        //.get(url) method used for navigation to page
        ////        driver.get("https://cybertekschool.com");
        ////
        ////      //this line will allow selenium to automate firefox browserry time we want to open chrome

    // WebDriverManager.chromedriver().setup();
      // WebDriver driver=new ChromeDriver();.
       WebDriver driver=new SafariDriver();


        driver.get("https://cybertekschool.com");

   // WebDriverManager.edgedriver().setup();
   // WebDriverManager.firefoxdriver().setup();
   // WebDriver driver=new EdgeDriver();
   // WebDriver driver=new FirefoxDriver();
   // driver.get("https://cybertekschool.com");

        driver.manage().window().maximize();
        driver.navigate().back();
        driver.close();














    }
}
