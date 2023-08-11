package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdcionarCarrinho {
    private WebDriver driver;

    public AdcionarCarrinho(WebDriver driver) {
        this.driver = driver;
    }
    public void AdicionarCarrinho(){
         driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-bike-light\"]")).click();
        driver.findElement(By.linkText("2")).click();
        driver.findElement(By.cssSelector("*[data-test=\"checkout\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"firstName\"]")).click();
    }
}
