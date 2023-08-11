package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TesteCarrinhoVazio {
    private WebDriver driver;

    public TesteCarrinhoVazio(WebDriver driver) {
        this.driver = driver;
    }

    public void CompraCarrinhoVazio() {

        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        driver.findElement(By.cssSelector("*[data-test=\"checkout\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"firstName\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"firstName\"]")).sendKeys("dan");
        driver.findElement(By.cssSelector("*[data-test=\"lastName\"]")).sendKeys("bian");
        driver.findElement(By.cssSelector("*[data-test=\"postalCode\"]")).sendKeys("8456123565");
        driver.findElement(By.cssSelector("*[data-test=\"continue\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"finish\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"back-to-products\"]")).click();
        {
        }
    }
}
