import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HtmlPageTest {
    private final String PATH = "C:\\Users\\anduser\\IdeaProjects\\task5calculate\\src\\test\\resources\\index1.html";

    @Test
    public void TitleExistsTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open url of my page about trips
        driver.get(PATH);

        //Add check
        WebElement title = driver.findElement(By.name("header_trips"));
        boolean isErrorDislplayed = title.isDisplayed();
        driver.quit();
        Assert.assertTrue(isErrorDislplayed, "Title isn't displayed");
    }

    @Test
    public void TableExistsTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open url of my page about trips
        driver.get(PATH);

        //Add check
        WebElement table = driver.findElement(By.name("table"));
        boolean isErrorDislplayed = table.isDisplayed();
        driver.quit();
        Assert.assertTrue(isErrorDislplayed, "Table isn't displayed");
    }

    @Test
    public void LinkExistsTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open url of my page about trips
        driver.get(PATH);

        //Add check
        WebElement link = driver.findElement(By.name("link"));
        boolean isErrorDislplayed = link.isDisplayed();
        driver.quit();
        Assert.assertTrue(isErrorDislplayed, "Link isn't displayed");
    }

    @Test
    public void MyNameExistsTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open url of my page about trips
        driver.get(PATH);

        //take a name
        WebElement nameUser = driver.findElement(By.name("my_name"));
        String nameText = nameUser.getText();

        //Add check

        System.out.println(nameText.contains("Andrei"));
        driver.quit();

    }

    @Test
    public void ClickLinkTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open url of my page about trips
        driver.get(PATH);

        // Click "W3Schools"
        driver.findElement(By.name("link")).click();

        //Add check
        WebElement reference = driver.findElement(By.className("w3-hide-small"));
        boolean isButtonDislplayed = reference.isDisplayed();
        driver.quit();
        Assert.assertTrue(isButtonDislplayed, "Button isn't displayed");
    }

    @Test
    public void alterNativeTextTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open url of my page about trips
        driver.get(PATH);

        //take a alt

        WebElement messageAlt = driver.findElement(By.id("img_1"));
        String namePage = messageAlt.getAttribute("alt");

        //Add check

        System.out.println(namePage.contains("oops, you found it"));
        driver.quit();
    }
}
