package googleImage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.Keys.ENTER;

public class GoogleImage {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\ITEA\\ChromeDriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com");

        //input "apple" into google search
        webDriver.findElement(By.name("q")).sendKeys("Apple", ENTER);

        //open tab images
        WebElement elementImages = webDriver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a"));
        elementImages.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // confirm that opened tab Images
        WebElement elementPrint = webDriver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]"));
        String attribute = elementPrint.getAttribute("aria-selected");
        String text = elementPrint.getText();
        System.out.println("Tab name: " + text + ". Aria selected? " + attribute);

    }
}
