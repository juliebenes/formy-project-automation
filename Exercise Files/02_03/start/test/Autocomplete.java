import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/julie/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autoComplete = driver.findElement(By.id("autocomplete"));
        autoComplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

        // slow test down so  web element has time to load
        Thread.sleep(1000);

        WebElement autoCompleteResult = driver.findElement(By.className("pac-item"));
        autoCompleteResult.click();



        driver.quit();
    }
}
