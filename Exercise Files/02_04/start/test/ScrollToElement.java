import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/julie/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = ((ChromeDriver) driver).findElement(By.id("name"));
        // action class = use alt + enter to import the class
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Julie Benes");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2020");



        driver.quit();
    }
}
