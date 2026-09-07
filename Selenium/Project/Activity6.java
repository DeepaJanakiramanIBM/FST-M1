package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity6 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://alchemy.hguy.co/crm");

        driver.findElement(By.id("user_name"))
                .sendKeys("admin");

        driver.findElement(By.id("username_password"))
                .sendKeys("pa$$w0rd");

        driver.findElement(By.id("bigbutton"))
                .click();

        WebElement activities =
                driver.findElement(
                        By.linkText("Activities"));

        System.out.println(
                "Displayed: "
                + activities.isDisplayed());

        System.out.println(
                "Enabled: "
                + activities.isEnabled());

        driver.quit();
    }
}