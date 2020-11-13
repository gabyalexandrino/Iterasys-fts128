// 1 - Pacote = Conjunto de classes
package todo;

// 2 - Bibliotecas = Métodos e Funções Prontos

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
    }

    @After
    public void finalizar(){
        driver.quit(); // Destruir o objeto Selenium WebDriver
    }

    @Test
    public void criarListaComTresItens(){
        driver.get(url);
    }
}
