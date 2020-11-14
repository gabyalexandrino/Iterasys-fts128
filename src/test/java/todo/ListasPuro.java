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
public class ListasPuro {
    // 3.1 - Atributos = Caracteristicas
    String url; // guardara o endereco do site alvo
    WebDriver driver; // objeto do Selenium WebDriver


    // 3.2 - Metodos ou Funcionalidades = O que ele sabe fazer
    @Before
    public void inicializar(){
        // Declarando o endereco do site
        url = "https://todo.microsoft.com";

        // Informando o local
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        // Instanciar o objeto Selenium WebDriver com o navegador Chrome
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void finalizar(){
        //driver.quit(); // Destruir o objeto Selenium WebDriver
    }

    @Test
    public void criarListaComTresItens() throws InterruptedException {
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
        driver.findElement(By.id("baseAddInput-addList")).click(); // clica no elemento "Nova Lista"
        driver.findElement(By.id("baseAddInput-addList")).clear(); // apaga o texto do elemento
        //driver.findElement(By.id("baseAddInput-addList")).sendKeys("Musicas"); // cola a palavra "Musica"
        //driver.findElement(By.id("baseAddInput-addList")).sendKeys(Keys.chord("Musicas" + Keys.ENTER)); // soletra a palavra "Musica" e pressiona Enter
        driver.findElement(By.id("baseAddInput-addList")).sendKeys(Keys.chord("Musicas")); // soletra a palavra "Musica"
        // Todo: implementar o print da tela
        driver.findElement(By.id("baseAddInput-addList")).sendKeys(Keys.ENTER); // pressiona a tecla Enter

        driver.findElement(By.id("baseAddInput-addTask")).sendKeys(Keys.chord("O Quereres") + Keys.ENTER);
        driver.findElement(By.id("baseAddInput-addTask")).sendKeys(Keys.chord("Terra") + Keys.ENTER);
        driver.findElement(By.id("baseAddInput-addTask")).sendKeys(Keys.chord("Me Gusta") + Keys.ENTER);
    }
}
