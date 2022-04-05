package org.example.Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class Practika {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");

        WebDriverManager.chromedriver().setup();
        WebDriver chromedriver = new ChromeDriver();
        chromedriver.get("https://nanoreview.net/");
        chromedriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement loginButton = chromedriver.findElement(By.id("logbtn"));
        loginButton.click();
        //Thread.sleep(1000);

        chromedriver.findElement(By.id("login_name")).sendKeys("Uitest123");
        //Thread.sleep(1000);

        chromedriver.findElement(By.id("login_password")).sendKeys("123456");
        //Thread.sleep(1000);

        chromedriver.findElement(By.xpath("//*[@id=\"logform\"]/form/ul/li[3]/button")).click();

        Thread.sleep(3000);

        chromedriver.quit();

    }
}
