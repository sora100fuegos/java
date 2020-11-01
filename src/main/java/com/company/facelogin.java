package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;

public class facelogin {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "src\\main\\java\\com\\company\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        Map<String, Object> prefs=new HashMap<String,Object>();
        prefs.put("profile.default_content_setting_values.notifications", 1);
//1-Allow, 2-Block, 0-default
        options.setExperimentalOption("prefs",prefs);
        ChromeDriver driver=new ChromeDriver(options);
       // WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement Login = driver.findElement(By.id("u_0_b"));
        username.sendKeys("cienfuegossilvacarlos@gmail.com");
        password.sendKeys("100fuegos");
        Login.click();
        Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser

        //browser.keys("Escape");
        //Object webdriver;


        WebElement search = driver.findElementByXPath ("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[1]/div/div/label/input");
        search.sendKeys("malinali cabrera  " +"\n");


        WebElement  mag = driver.findElementByXPath("/html/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div[3]/span/div");
        mag.click();
        WebElement chat = driver.findElementByXPath("/html/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div[3]/span/div/i");
         chat.click();
        WebElement navigationclick = driver.findElement(By.id("logoutMenu"));
        WebElement logout = driver.findElement(By.xpath("//div[@id='u_d_1']/div/div/div/div/div/ul/li[12]/a/span/span"));
        navigationclick.click();
        if(logout.isEnabled() && logout.isDisplayed()) {
            logout.click();
        }
        else {
            System.out.println("Element not found");
        }

    }


}
