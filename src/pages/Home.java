package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Home {
    WebDriver driver;


    By SearchButton = By.xpath("//div[@class='search']/div/button");

    public Home(WebDriver driver) {
        this.driver = driver;
    }

    public void SearchBox() {
        WebElement button = driver.findElement(SearchButton);
        button.click();
    }



}