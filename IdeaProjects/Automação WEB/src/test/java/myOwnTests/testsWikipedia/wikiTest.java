package myOwnTests.testsWikipedia;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class wikiTest {
    private WebDriver navegador;
    private dslWiki dsl;

    @Before
    public void setUp() {
        navegador = webWiki.createBrowserStack1();
        dsl = new dslWiki(navegador);
    }

    @Test
    public void estudoEPraticaLivreWikipedia() {

        // Digitar "The Last of Us 2" na barra de pesquisa
        dsl.escreve("input[placeholder='Pesquisar na Wikipédia']", "The Last of Us 2");

        // Clicar na lupa de pesquisa com o cssSelector "input[name=go]"
        navegador.findElement(By.cssSelector("input[name=go]")).click();

        // Clicar no link clicar no link
        navegador.findElement(By.cssSelector("a[href='/wiki/The_Last_of_Us_Part_II']")).click();

        // Clicar em bibliografia
        navegador.findElement(By.cssSelector("a[href='#Bibliografia']")).click();
    }
    @After
    public void tearDown() {
        navegador.quit();
    }
}