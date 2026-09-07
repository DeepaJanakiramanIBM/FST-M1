package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://alchemy.hguy.co/crm");

        WebElement copyright =
                driver.findElement(By.id("admin_options"));

        System.out.println(copyright.getText());

        driver.quit();
    }
}