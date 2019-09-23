import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/julie/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();   // create new instance of chrome driver

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        // define webelement for radio button1
        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));

        // click on rb1
        radioButton1.click();

        // define web element for radio button 2 based on the value
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));

        // click on rb2
        radioButton2.click();

        // example3 - assuming there is nothing to identify this button:  use xpath
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));

        // click on rb3
        radioButton3.click();



        driver.quit();
    }
}
