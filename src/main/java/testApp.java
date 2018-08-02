import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;

public class testApp {

    static WebDriver driver;

    public void openChromeWithExtensions() {

        ChromeOptions options = new ChromeOptions();
        //set your path extension
        options.addExtensions(new File("extensions\extension.crx"));
        driver = new ChromeDriver(options);
    }
}
