// 1 - Pacote = Conjunto de classes
package todo;

// 2 - Bibliotecas = Métodos e Funções Prontos

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

// 3 - Classe
public class TarefasPuro {
    String url;
    WebDriver driver;

    @Before
    public void incicializar(){
        // Endereco do site
        url = "https://iterasys.com.br/";

        // Caminho do driver do Chrome
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        // Instanciar obj Selenium WebDriver com o Chrome
        driver = new ChromeDriver();

        // Maximizar janela
        driver.manage().window().maximize();
    }

    @After
    public void finalizar(){
        // Destroi obj Selenium WebDriver
        //driver.quit();
    }

    @Test
    public void simularCompraIterasys() throws InterruptedException {
        driver.get(url);

        driver.findElement(By.id("searchtext")).sendKeys(Keys.chord("TestLink"));
        driver.findElement(By.id("btn_form_search")).click();

        Thread.sleep(3000);
        driver.findElement(By.className("comprar")).click();
    }
}
