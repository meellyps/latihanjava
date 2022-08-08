package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumTest {

    // open web browser
    // open url https://demo.midtrans.com/

    @Test
    public void tesMidtrans(){
        System.out.println("Before Test");
        // lokasi web driver
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demo.midtrans.com/");
        driver.findElement(By.xpath("//a[.='BUY NOW']")).click();
        driver.findElement(By.xpath("//input[@data-reactid='.0.0.1.0.1.0.1.0:$1.2.0']")).clear();
        driver.findElement(By.xpath("//input[@data-reactid='.0.0.1.0.1.0.1.0:$1.2.0']")).sendKeys("50000");
        driver.findElement(By.xpath("//input[@data-reactid='.0.0.1.0.3.0.0.0.1.0']")).clear();
        driver.findElement(By.xpath("//input[@data-reactid='.0.0.1.0.3.0.0.0.1.0']")).sendKeys("Melly");
        driver.findElement(By.xpath("//input[@data-reactid='.0.0.1.0.3.0.0.1.1.0']")).clear();
        driver.findElement(By.xpath("//input[@data-reactid='.0.0.1.0.3.0.0.1.1.0']")).sendKeys("melly@gmail.com");
        driver.findElement(By.xpath("//input[@data-reactid='.0.0.1.0.3.0.0.2.1.0']")).clear();
        driver.findElement(By.xpath("//input[@data-reactid='.0.0.1.0.3.0.0.2.1.0']")).sendKeys("081234567890");
        driver.findElement(By.xpath("//input[@data-reactid='.0.0.1.0.3.0.0.3.1.0']")).clear();
        driver.findElement(By.xpath("//input[@data-reactid='.0.0.1.0.3.0.0.3.1.0']")).sendKeys("DKI Jakarta");
        driver.findElement(By.xpath("//textarea[@data-reactid='.0.0.1.0.3.0.0.4.1.0']")).clear();
        driver.findElement(By.xpath("//textarea[@data-reactid='.0.0.1.0.3.0.0.4.1.0']")).sendKeys("Jl Kelapa Cengkir");
        driver.findElement(By.xpath("//input[@data-reactid='.0.0.1.0.3.0.0.5.1.0']")).clear();
        driver.findElement(By.xpath("//input[@data-reactid='.0.0.1.0.3.0.0.5.1.0']")).sendKeys("10510");
        driver.findElement(By.xpath("//div[@data-reactid='.0.0.1.1.0']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("snap-midtrans")));
        driver.switchTo().frame("snap-midtrans");
        driver.findElement(By.xpath("//img[@class='logo']")).click();
        driver.findElement(By.xpath("//a[@href='#/credit-card']")).click();
        driver.findElement(By.xpath("//input[@autocomplete='cc-number']")).sendKeys("4811 1111 1111 1114");
        driver.quit();


    }

}