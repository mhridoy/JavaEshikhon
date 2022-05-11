package class23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class selenium {
    public static void main(String[] args) {
        // Setup the chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Moshiur\\Desktop\\ChromeDriver\\chromedriver.exe");

        // Crete a new object of ChromeDriver

        WebDriver webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.manage().deleteAllCookies();
        webdriver.get("https://www.google.com");
        webdriver.findElement(By.name("q")).sendKeys("How to drink water!");

        WebElement searchicon = webdriver.findElement(By.name("btnK"));
        searchicon.click();
        WebElement clickClick = webdriver.findElement(By.className("g"));
        clickClick.click();







    }
}
