package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity9 {

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

        driver.findElement(By.linkText("Leads"))
                .click();

        for(int i=1; i<=10; i++) {

            String name =
                    driver.findElement(
                            By.xpath("(//table/tbody/tr)[" + i + "]/td[3]"))
                            .getText();

            String user =
                    driver.findElement(
                            By.xpath("(//table/tbody/tr)[" + i + "]/td[8]"))
                            .getText();

            System.out.println(
                    "Name: " + name +
                    " | User: " + user);
        }

        driver.quit();
    }
}