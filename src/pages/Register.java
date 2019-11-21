package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register {
    WebDriver driver;


    By EmailInput = By.name("signup_email");
    By PasswordInput = By.name("password");
    By EmailNextButton = By.className("submitButton extraSpace signUpNextButtonClass");



    public Register(WebDriver driver) {
        this.driver = driver;
    }

    public void SetEmail(String email) {
        WebElement setEmail = driver.findElement(EmailInput);
        setEmail.click();
        setEmail.sendKeys(email);
    }

    public void ClickNextEmail() {
        WebElement nextemail = driver.findElement(EmailNextButton);
        nextemail.click();
    }

    public void SetPasssword(String password) {
        WebElement setPassword = driver.findElement(PasswordInput);
        setPassword.click();
        setPassword.sendKeys(password);
    }




}