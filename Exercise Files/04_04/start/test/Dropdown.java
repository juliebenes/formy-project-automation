import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/julie/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenu = driver.findElement(By.id("dropdownMenuButton"));


        // this will open the drop down menu to expose the values
        dropdownMenu.click();

        // now we need to select an item from the list.  Pick the first one autoComplete
        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));

        // now click item and redirect to the autocomplete page.
        autocompleteItem.click();

        driver.quit();
    }
}
