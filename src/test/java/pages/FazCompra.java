package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FazCompra {
     private WebDriver driver;

    public FazCompra(WebDriver driver) {
        this.driver = driver;
    }
    public void Faz_Compra(){
        
        driver.findElement(By.cssSelector("*[data-test=\"firstName\"]")).sendKeys("daniel");
        driver.findElement(By.cssSelector("*[data-test=\"lastName\"]")).sendKeys("bianchi");
        driver.findElement(By.cssSelector("*[data-test=\"postalCode\"]")).sendKeys("81459630");
        driver.findElement(By.cssSelector("*[data-test=\"continue\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"finish\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"back-to-products\"]")).click();
    }
}

    

