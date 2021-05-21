package SeleniumPrograms;

import okio.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class ActionsDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adity\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.asos.com/men/");
        Actions a=new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//nav[@class='_3EAPxMS']//button[8]"))).build().perform();
        a.moveToElement(driver.findElement(By.id("chrome-search"))).click().keyDown(Keys.SHIFT).sendKeys("Adamya").doubleClick().contextClick();
        a.build().perform();

        }
    }
