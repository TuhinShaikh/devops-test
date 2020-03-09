import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InkofeFF {

    @Test

    public void mytest() {
        System.setProperty("webdriver.gecko.driver", "geckodriver");

        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://www.edureka.co/");
        driver.manage().window().fullscreen();
        String title = driver.getTitle();
        System.out.println("The title of the page is: " + title);


        driver.quit();
    }
}
