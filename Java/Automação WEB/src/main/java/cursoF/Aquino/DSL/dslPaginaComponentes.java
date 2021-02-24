package cursoF.Aquino.DSL;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class dslPaginaComponentes {

    private final WebDriver navegador;

    public dslPaginaComponentes(WebDriver navegador) {
        this.navegador = navegador;
    }

    //************************** LINKS ******************************\\

    public void ClicarNoLink(String id) {
        navegador.findElement(By.linkText(id)).click();
    }

    public String obterValorDoLink(String id) {
        return navegador.findElement(By.id(id)).getText();
    }

    //************************* TEXTO NA TELA ***************************\\

    public String receberTextoPorTagName(String tag) {

        return navegador.findElement(By.tagName(tag)).getText();
    }


    public String receberTextoPorCssSelector(String cssSelector) {
        return  navegador.findElement(By.cssSelector(cssSelector)).getText();
    }

    //************************* COMBO *************************************\\

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

    public int obterQuantidaOpcoesCombo(String id){
        WebElement element = navegador.findElement(By.id(id));
        Select combo = new Select(element);
        List<WebElement> options = combo.getOptions();
        return options.size();
    }

    public boolean verificarOpacaoCombo(String id, String opcao) {
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

    //*************************** ALERT ******************************\\

    public String alertaOberTexto() {
        Alert alert = navegador.switchTo().alert();
        return alert.getText();
    }

    public String alertaObterTextoENegar() {
        Alert alert = navegador.switchTo().alert();
        String valor = alert.getText();
        alert.dismiss();
        return valor;
    }

    public void alertaEscrever(String valor) {
        Alert alert = navegador.switchTo().alert();
        alert.sendKeys(valor);
        alert.accept();
    }

    //******************************** FRAME ***************************\\

    public void entrarFrame(String id) {
        navegador.switchTo().frame(id);
    }

    public void sairFrame(){
        navegador.switchTo().defaultContent();
    }

    public void trocarJanela(String id) {
        navegador.switchTo().window(id);
    }
}

