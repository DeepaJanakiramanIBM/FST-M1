package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://alchemy.hguy.co/crm");

        String actualTitle = driver.getTitle();

        System.out.println("Title: " + actualTitle);

        if(actualTitle.equals("SuiteCRM")) {
            System.out.println("Title Verified");
        }

        driver.quit();
    }
}