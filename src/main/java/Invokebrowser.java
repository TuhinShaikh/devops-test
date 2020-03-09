import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invokebrowser {

    @Test
    public void test2() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.edureka.co/");
        driver.manage().window().fullscreen();
        String titile = driver.getTitle();
        System.out.println("The title of the page is: " + titile);


        driver.quit();
    }
}
