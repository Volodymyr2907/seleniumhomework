package googleMailLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class GoogleMail {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "D:\\ITEA\\ChromeDriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");


        WebElement inputEmail = webDriver.findElement(By.id("identifierId"));
        inputEmail.sendKeys("john.stylys@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);


        WebElement inputPassword = webDriver.findElement(By.name("password"));
        inputPassword.sendKeys("Pass_123", Keys.ENTER);


        webDriver.manage().window().maximize();
        WebElement buttonAll = webDriver.findElement(By.id("gbwa"));
        buttonAll.click();


        WebElement openMail = webDriver.findElement(By.id("gb23"));
        openMail.click();


        ArrayList<String> tabs_windows = new ArrayList<String>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs_windows.get(1));
        Thread.sleep(3000);


        WebElement writeMessage = webDriver.findElement(By.className("z0"));
        writeMessage.click();
        Thread.sleep(3000);


        //Enter address
        webDriver.findElement(By.name("to")).sendKeys("vvyastrubchak@gmail.com");
        //Enter topic
        webDriver.findElement(By.name("subjectbox")).sendKeys("Test");
        //Enter message
        webDriver.findElement(By.xpath("//*[@id=\":9w\"]")).sendKeys("Test Message");


        //Send message
        webDriver.findElement(By.id(":8h")).click();


    }
}
