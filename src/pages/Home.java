package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Home {
    WebDriver driver;


    By TakeTour = By.xpath("//div[@class='welcomesection']/div/button");
    By PopUpPromo = By.xpath("//span[@class='icon-cancel']/button");
    By DropDownCurrency = By.className("sel_state");
    By RegisterBtn = By.xpath("//[@class='loginDropDown']//*[contains(text(),'Register'");

    public Home(WebDriver driver) {
        this.driver = driver;
    }

    public void TakeTourPopUp() {
        WebElement button = driver.findElement(TakeTour);
        button.click();
    }


    public void PopUpPromoClose() {
        List<WebElement> popup = driver.findElements(PopUpPromo);
        popup.get(1).click();
    }


    public void SelectCurrency(String currency) {
        WebElement dropdown = driver.findElement(DropDownCurrency);
        dropdown.click();

        WebElement USD =  driver.findElement(By.xpath("//*[@class='currencyName'][text()='"+currency+"'])"));
        USD.click();
    }

    public void RegisterClient () {
        WebElement RegisterButton = driver.findElement(RegisterBtn);
        RegisterButton.click();
    }






}