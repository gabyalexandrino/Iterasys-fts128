package todo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class AlterarListaPuro {
    String url;
    WebDriver driver;

    @Before
    public void inicializar(){
        // Endereco do site
        url = "https://todo.microsoft.com";

        // Caminho do driver do Chrome
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        // Instanciar obj Selenium WebDriver com o Chrome
        driver = new ChromeDriver();

        // Maximizar janela
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void finalizar(){
        //driver.quit(); // Destruir o objeto Selenium WebDriver
    }

    @Test
    public void alterarLista() throws InterruptedException {
        driver.get(url);
        // Página de Login
        driver.findElement(By.id("mectrl_headerPicture")).click();
        driver.findElement(By.id("i0116")).sendKeys(Keys.chord("gabriellaalexandrino@hotmail.com"));
        driver.findElement(By.id("idSIButton9")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("i0118")).sendKeys(Keys.chord("1072210521!"));
        driver.findElement(By.id("idSIButton9")).click();
        driver.findElement(By.id("idBtn_Back")).click();

        // Páginas de Taks - tarefas
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#l-1izt3tgblra .listItem-title > span")).click();
        driver.findElement(By.cssSelector("span:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector(".editing")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".editing"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.cssSelector(".editing")).sendKeys("Minhas musicas");
        driver.findElement(By.cssSelector(".editing")).sendKeys(Keys.ENTER);
    }
}
