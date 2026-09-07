package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7 {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.get("https://alchemy.hguy.co/crm");

        driver.findElement(By.id("user_name"))
                .sendKeys("admin");

        driver.findElement(By.id("username_password"))
                .sendKeys("pa$$w0rd");

        driver.findElement(By.id("bigbutton"))
                .click();

        driver.findElement(
                By.id("grouptab_0"))
                .click();

        driver.findElement(
                By.linkText("Leads"))
                .click();

        driver.findElement(
                By.xpath("(//span[contains(@class,'suitepicon-action-info')])[1]"))
                .click();

        System.out.println(
                driver.findElement(By.className("ui-dialog-content"))
                        .getText());

        driver.quit();
    }
}