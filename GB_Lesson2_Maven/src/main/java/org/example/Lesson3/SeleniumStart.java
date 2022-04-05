package org.example.Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumStart {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        //WebDriver driver = new ChromeDriver();
        //driver.get("https://google.com");

        //Thread.sleep(5000);
        //driver.quit();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");

        WebDriverManager.firefoxdriver().setup();
        WebDriver ffDriver = new FirefoxDriver();
        ffDriver.get("https://nanoreview.net/");

        Thread.sleep(5000);

        ffDriver.quit();


    }


}
