package myOwnTests.OLX.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {
    private final WebDriver navegador;

    public DSL(WebDriver navegador) {
        this.navegador = navegador;
    }


    public String obterTexto(By by) {
        return navegador.findElement(by).getText();
    }

    public void click(By by) {
        navegador.findElement(by).click();
    }

    public void escrever(By by,String string) {
        navegador.findElement(by).sendKeys(string);
    }

    public boolean isCheckMarcado(By by){
        return navegador.findElement(by).isSelected();
    }

    public String obterValorCampo(By by) {
        return navegador.findElement(by).getAttribute("value");
    }

    public void selecionarCombo(By by, String valor) {
        WebElement element = navegador.findElement(by);
        Select combo = new Select(element);
        combo.selectByVisibleText(valor);
    }

    public String obterValorCombo(By by) {
        WebElement element = navegador.findElement(by);
        Select combo = new Select(element);
        return combo.getFirstSelectedOption().getText();
    }
}
