package testWebmotors.DSL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dslWebmotors {

    private final WebDriver navegador;

    public dslWebmotors(WebDriver navegador) {
        this.navegador = navegador;
    }

    public String receberTexto(By by) {
        return navegador.findElement(by).getText();
    }

    public void clicarBy(By by) {
        navegador.findElement(by).click();
    }

    public void escrever(String id, String texto) {
        navegador.findElement(By.id(id)).sendKeys(texto);
    }

    public String obterTextoByAttribute(String id) {
       return navegador.findElement(By.id(id)).getAttribute("value");
    }
}