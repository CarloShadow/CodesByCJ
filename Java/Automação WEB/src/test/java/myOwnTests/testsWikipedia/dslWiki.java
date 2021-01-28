package myOwnTests.testsWikipedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dslWiki {

    private final WebDriver navegador;

    public  dslWiki(WebDriver navegador) {
        this.navegador = navegador;
    }
    public void escreve(String xpath_campo, String texto){
        navegador.findElement(By.xpath(xpath_campo)).sendKeys(texto);
    }
}
