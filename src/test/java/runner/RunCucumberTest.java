package runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.AdcionarCarrinho;
import pages.FazCompra;
import pages.LoginPage;
import pages.TesteCarrinhoVazio;

public class RunCucumberTest {

    private WebDriver driver;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void teste_login() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fazerLogin();
        
        AdcionarCarrinho adcionarCarrinho = new AdcionarCarrinho(driver);
        adcionarCarrinho.AdicionarCarrinho();
        
       FazCompra  fazCompra = new FazCompra(driver);
       fazCompra.Faz_Compra(); 

       TesteCarrinhoVazio testeCarrinhoVazio = new TesteCarrinhoVazio(driver);
       testeCarrinhoVazio.CompraCarrinhoVazio();
    }
}
