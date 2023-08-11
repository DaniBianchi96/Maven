package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fazerLogin() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().setSize(new Dimension(1038, 1040));
        
        // Preencher campos de login
        driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
        
        // Clicar no botão de login
        driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
    }
}
    