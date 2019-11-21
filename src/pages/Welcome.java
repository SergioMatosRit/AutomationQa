package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Welcome {
    WebDriver driver;


    By SkipButton = By.xpath("//div[@class='contentholder active']/div[@class='letsskip']/button");



    public Welcome(WebDriver driver) {
        this.driver = driver;
    }

    public void SkipButton() {
        WebElement button = driver.findElement(SkipButton);
        button.click();
    }



}