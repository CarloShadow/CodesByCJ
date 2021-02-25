package myOwnTests.OLX.Suporte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static myOwnTests.OLX.Suporte.DriverFactory.getDriver;

public class DSL {

    public String obterTexto(By by) {
        return getDriver().findElement(by).getText();
    }

    public void click(By by) {
        getDriver().findElement(by).click();
    }

    public void escrever(By by,String string) {
        getDriver().findElement(by).sendKeys(string);
    }

    public boolean isCheckMarcado(By by){
        return getDriver().findElement(by).isSelected();
    }

    public String obterValorCampo(By by) {
        return getDriver().findElement(by).getAttribute("value");
    }

    public void selecionarCombo(By by, String valor) {
        WebElement element = getDriver().findElement(by);
        Select combo = new Select(element);
        combo.selectByVisibleText(valor);
    }

    public String obterValorCombo(By by) {
        WebElement element = getDriver().findElement(by);
        Select combo = new Select(element);
        return combo.getFirstSelectedOption().getText();
    }
}
