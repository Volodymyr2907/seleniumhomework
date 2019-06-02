package testAndQuiz;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestAndQuiz {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "D:\\ITEA\\ChromeDriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.testandquiz.com/selenium/testing.html");
        webDriver.manage().window().maximize();


        WebElement tapLink = webDriver.findElement(By.linkText("This is a link"));
        tapLink.click();
        webDriver.navigate().back();

        WebElement inputText = webDriver.findElement(By.id("fname"));
        inputText.sendKeys("My text");

        WebElement clickSubmit = webDriver.findElement(By.id("idOfButton"));
        clickSubmit.click();


        WebElement chooseRadioButton = webDriver.findElement(By.cssSelector("input[id='male']"));
        chooseRadioButton.click();

        WebElement chooseCheckbox = webDriver.findElement(By.className("Automation"));
        chooseCheckbox.click();

        Select dropdown = new Select(webDriver.findElement(By.id("testingDropdown")));
        dropdown.selectByVisibleText("Database Testing");

        Actions action = new Actions(webDriver);
        WebElement chooseDoubleClick = webDriver.findElement(By.id("dblClkBtn"));
        action.doubleClick(chooseDoubleClick).perform();
        Alert alert = webDriver.switchTo().alert();
        alert.accept();


        WebElement generateAlertBox = webDriver.findElement(By.xpath("/html/body/div/div[11]/div/p/button"));
        generateAlertBox.click();
        alert.accept();

        WebElement generateConfirmBox = webDriver.findElement(By.xpath("/html/body/div/div[12]/div/p[1]/button"));
        generateConfirmBox.click();
        webDriver.switchTo().alert().dismiss();
        Thread.sleep(1000);

        WebElement dragAndDropFrom = webDriver.findElement(By.id("sourceImage"));
        WebElement dragAndDropTo = webDriver.findElement(By.id("targetDiv"));
        action.dragAndDrop(dragAndDropFrom, dragAndDropTo).build().perform();


    }
}
