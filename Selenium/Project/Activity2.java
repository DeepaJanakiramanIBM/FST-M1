package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://alchemy.hguy.co/crm");

        WebElement image =
                driver.findElement(By.xpath("//img[contains(@class,'img-responsive')]"));

        String imageURL = image.getAttribute("src");

        System.out.println("Header Image URL: " + imageURL);

        driver.quit();
    }
}