package myOwnTests.cadastroPackageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class dslCadastro {

    private final WebDriver navegador;

    public dslCadastro(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void escreve(String id_campo, String texto) {
        navegador.findElement(By.id(id_campo)).sendKeys(texto);
    }

    public String receberValorDoCampo(String id_campo) {
        return navegador.findElement(By.id(id_campo)).getAttribute("value");

    }

    public void clicarRadio(String id) {
        navegador.findElement(By.id(id)).click();
    }

    public boolean receberValorRadio(String id) {
        return navegador.findElement(By.id(id)).isSelected();
    }

    public void selecionarCombo(String id, String valor) {
        WebElement elemento = navegador.findElement(By.id(id));
        Select combo = new Select(elemento);
        combo.selectByVisibleText(valor);
    }

    public List<String> obterValoresCombo(String id) {
        WebElement element = navegador.findElement(By.id("elementosForm:esportes"));
        Select combo = new Select(element);

        List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
        Assert.assertEquals(3, allSelectedOptions.size());
        List<String> valores = new ArrayList<>();
        for (WebElement opcao : allSelectedOptions) {
            valores.add(opcao.getText());
        }
        return valores;
    }

    public String receberValorCombo(String id) {
        WebElement elemento = navegador.findElement(By.id(id));
        Select combo = new Select(elemento);
        return combo.getFirstSelectedOption().getText();
}

    public boolean verificarOpcaoCombo(String id, String opcao) {
        WebElement element = navegador.findElement(By.id(id));
        Select combo = new Select(element);
        List<WebElement> options = combo.getOptions();
        for (WebElement option : options) {
            if (option.getText().equals(opcao)) {
                return true;
            }
        }
        return false;
    }

    public void clicarBotao(String id) {
        navegador.findElement(By.id(id)).click();
    }

    public String receberValordoClickCadastroComnXpath(String xpath) {
        return navegador.findElement(By.xpath(xpath)).getText();
    }

    public String receberValorDoCadastroConfirmado(String id) {
        return navegador.findElement(By.id(id)).getText();
    }
}


