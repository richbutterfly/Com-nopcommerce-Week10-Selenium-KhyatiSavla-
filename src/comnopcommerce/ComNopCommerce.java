package comnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demo.nopcommerce.com/login?returnUrl=%2F”
 * 7. Print the current url.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current url.
 * 11. Refresh the page.
 * 12. Enter the email to email field.
 * 13. Enter the password to password field.
 * 14. Click on Login Button.
 * 15. Close the browser.
 */
public class ComNopCommerce {

    public static void main(String[] args) {
        // Set up Chrome browser
        WebDriver driver = new ChromeDriver();
        // Opening the URL into browser
        String baseUrl = "https://demo.nopcommerce.com/";
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        // Implicit wait timing to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("The title of the webpage: " + title);
        // Print the current URL
        driver.getCurrentUrl();
        System.out.println("The current URL: " + driver.getCurrentUrl());
        // Print page source
        System.out.println(driver.getPageSource());
        System.out.println("The page source of the current URL is: " + driver.getPageSource());
        // Navigate to URL
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        // Print the current URL
        driver.navigate().to(loginUrl);
        System.out.println(" Get current URL: " + driver.getCurrentUrl());
        // Get back to the home page
        driver.navigate().back();
        //Print the current URL
        driver.navigate().forward();
        System.out.println("The current URL: " + driver.getCurrentUrl());
        // Refresh the page
        driver.navigate().refresh();
        // Find login link Element and click on it
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Find email field Element and Type the email
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("prime321@gmail.com");
        // Find the password field Element and Type the password
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("1234");
        //Click on Login Button
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
        loginButton.click();
        // Close the Browser
        driver.quit();


    }
}
