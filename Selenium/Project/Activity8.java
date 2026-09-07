package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity8 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://alchemy.hguy.co/crm");

        driver.findElement(By.id("user_name"))
                .sendKeys("admin");

        driver.findElement(By.id("username_password"))
                .sendKeys("pa$$w0rd");

        driver.findElement(By.id("bigbutton"))
                .click();

        driver.findElement(By.id("grouptab_0"))
                .click();

        driver.findElement(By.linkText("Accounts"))
                .click();

        List<WebElement> rows =
                driver.findElements(
                        By.xpath("//table/tbody/tr"));

        for(int i=1;i<=5;i++) {

            System.out.println(
                    driver.findElement(
                            By.xpath("//table/tbody/tr[" +
                                    ((i*2)-1) +
                                    "]/td[3]"))
                            .getText());
        }

        driver.quit();
    }
}