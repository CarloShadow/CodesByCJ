package myOwnTests.lojaPackageTests.DSL;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dslCadastro {

    private final WebDriver navegador;

    public dslCadastro(WebDriver navegador) {
        this.navegador = navegador;
    }

    public String obterTexto(String selector) {
        return navegador.findElement(By.cssSelector(selector)).getText();
    }

    public void escreverCssSelector(String cssSelector, String texto) {
        navegador.findElement(By.cssSelector(cssSelector)).sendKeys(texto);
    }

    public void clicar(By by) {
        navegador.findElement(by).click();
    }

    public String receberTexto(By by) {
        return navegador.findElement(by).getText();
    }

    public boolean receberValorRadio(String id) {
        return navegador.findElement(By.id(id)).isSelected();
    }

    public void escreverById(String id, String texto) {
        navegador.findElement(By.id(id)).clear();
        navegador.findElement(By.id(id)).sendKeys(texto);
    }

    public String receberValorDoCampo(String id_campo) {
        return navegador.findElement(By.id(id_campo)).getAttribute("value");

    }

    public void selecionarCombo(String id, String valor) {
        WebElement element = navegador.findElement(By.id(id));
        Select combo = new Select(element);
        combo.selectByIndex(Integer.parseInt(valor));
    }

    public String receberValorCombo(String id) {
        WebElement element = navegador.findElement(By.id(id));
        Select combo = new Select(element);
        return combo.getFirstSelectedOption().getText();
    }

}
