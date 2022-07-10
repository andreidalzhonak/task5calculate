import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculateTestMessage {
    @Test
    public void categoryMessageIsStarvationTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open url of BMI Calculator
        driver.get("https://healthunify.com/bmicalculator/");

        //Input  Weight
        driver.findElement(By.name("wg")).sendKeys("40");

        // Input or cms
        driver.findElement(By.name("ht")).sendKeys("180");

        //Click "Continue"
        driver.findElement(By.cssSelector("[value=Calculate]")).click();


        //Add check
        String categoryMessage = driver.findElement(By.name("desc")).getAttribute("value");
        driver.quit();
        Assert.assertEquals(categoryMessage, "Your category is Starvation");
    }

    @Test
    public void categoryMessageIsUnderweightTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open url of BMI Calculator
        driver.get("https://healthunify.com/bmicalculator/");

        //Input  Weight
        driver.findElement(By.name("wg")).sendKeys("50");

        // Input or cms
        driver.findElement(By.name("ht")).sendKeys("180");

        //Click "Continue"
        driver.findElement(By.cssSelector("[value=Calculate]")).click();


        //Add check
        String categoryMessage = driver.findElement(By.name("desc")).getAttribute("value");
        driver.quit();
        Assert.assertEquals(categoryMessage, "Your category is Underweight");
    }

    @Test
    public void categoryMessageIsNormalTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open url of BMI Calculator
        driver.get("https://healthunify.com/bmicalculator/");

        //Input  Weight
        driver.findElement(By.name("wg")).sendKeys("60");

        // Input or cms
        driver.findElement(By.name("ht")).sendKeys("180");

        //Click "Continue"
        driver.findElement(By.cssSelector("[value=Calculate]")).click();


        //Add check
        String categoryMessage = driver.findElement(By.name("desc")).getAttribute("value");
        driver.quit();
        Assert.assertEquals(categoryMessage, "Your category is Normal");
    }

    @Test
    public void categoryMessageIsOverweightTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open url of BMI Calculator
        driver.get("https://healthunify.com/bmicalculator/");

        //Input  Weight
        driver.findElement(By.name("wg")).sendKeys("90");

        // Input or cms
        driver.findElement(By.name("ht")).sendKeys("180");

        //Click "Continue"
        driver.findElement(By.cssSelector("[value=Calculate]")).click();


        //Add check
        String categoryMessage = driver.findElement(By.name("desc")).getAttribute("value");
        driver.quit();
        Assert.assertEquals(categoryMessage, "Your category is Overweight");
    }

    @Test
    public void categoryMessageIsObeseTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open url of BMI Calculator
        driver.get("https://healthunify.com/bmicalculator/");

        //Input  Weight
        driver.findElement(By.name("wg")).sendKeys("100");

        // Input or cms
        driver.findElement(By.name("ht")).sendKeys("180");

        //Click "Continue"
        driver.findElement(By.cssSelector("[value=Calculate]")).click();


        //Add check
        String categoryMessage = driver.findElement(By.name("desc")).getAttribute("value");
        driver.quit();
        Assert.assertEquals(categoryMessage, "Your category is Obese");
    }
}