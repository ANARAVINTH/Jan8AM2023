package reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BrowserInvocation {

   public static WebDriver driver;
   public static  Properties prob ;

    public static WebDriver launchApplication() throws IOException {

       String path = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(new File(path +"\\src\\main\\resources\\utility\\configuration.properties"));
        prob = new Properties();
        prob.load(fis);

        switch (prob.getProperty("Browser").toLowerCase()){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "D:\\SeleniumFiles\\Drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.navigate().to(prob.getProperty("URL"));
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                driver.manage().window().maximize();
                break;
            case "edge":
                driver = new EdgeDriver();
                driver.navigate().to(prob.getProperty("URL"));
                break;
            default:
                throw new IllegalArgumentException();

        }


        return driver;

    }

}
