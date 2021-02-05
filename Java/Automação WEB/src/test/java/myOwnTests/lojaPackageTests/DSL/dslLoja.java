package myOwnTests.lojaPackageTests.DSL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static myOwnTests.globalSuporte.webNavegador.getNavegador;

public class dslLoja {


    public String obterTexto(String selector) {
        return getNavegador().findElement(By.cssSelector(selector)).getText();
    }

    public void escreverCssSelector(String cssSelector, String texto) {
        getNavegador().findElement(By.cssSelector(cssSelector)).sendKeys(texto);
    }

    public void clicar(By by) {
        getNavegador().findElement(by).click();
    }

    public String receberTexto(By by) {
        return getNavegador().findElement(by).getText();
    }

    public boolean receberValorRadio(String id) {
        return getNavegador().findElement(By.id(id)).isSelected();
    }

    public void escreverById(String id, String texto) {
        getNavegador().findElement(By.id(id)).clear();
        getNavegador().findElement(By.id(id)).sendKeys(texto);
    }

    public String receberValorDoCampo(String id_campo) {
        return getNavegador().findElement(By.id(id_campo)).getAttribute("value");

    }

    public void selecionarCombo(String id, String valor) {
        WebElement element = getNavegador().findElement(By.id(id));
        Select combo = new Select(element);
        combo.selectByIndex(Integer.parseInt(valor));
    }

    public String receberValorCombo(String id) {
        WebElement element = getNavegador().findElement(By.id(id));
        Select combo = new Select(element);
        return combo.getFirstSelectedOption().getText();
    }

    public void hoverNoMenu(String xpath) {
        WebElement women = getNavegador().findElement(By.xpath(xpath));
        Actions act = new Actions(getNavegador());
        act.moveToElement(women).perform();
    }

}