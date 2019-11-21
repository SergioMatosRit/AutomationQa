package config;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.chrome.ChromeOptions;
        import pages.Home;

public class Base {
    //private static WebDriver driver;
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = GetDriver("Chrome", false);
        driver.manage().window().maximize();
        driver.get("https://google.com");

        Home home = new Home(driver);
        //Closing the browser
        driver.close();
    }


    private static WebDriver GetDriver(String browser, boolean headless) {
        WebDriver driver;

        switch (browser) {
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                if (headless) {
                    chromeOptions.addArguments("--headless");
                }
                driver = new ChromeDriver(chromeOptions);
                break;
            default:
                System.out.printf("Browser not found, using Chrome as default");
                driver = new ChromeDriver();
        }
        return driver;
    }


    private static void Wait(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException err) {
            System.out.println("Failed to wait ");
        }
    }
}