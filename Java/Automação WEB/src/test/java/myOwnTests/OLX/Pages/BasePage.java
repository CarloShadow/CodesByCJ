package myOwnTests.OLX.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private final DSL dsl;

    public BasePage(WebDriver navegador) {
        dsl = new DSL(navegador);
    }
    public String obterTextoImoveis() {
        return dsl.obterTexto(By.xpath("//small[.='Imóveis']"));
    }

    public void clickImoveis() {
        dsl.click(By.xpath("//small[.='Imóveis']"));
    }

    public String obterTextoImoveis1() {
        return dsl.obterTexto(By.xpath("//div[@class='sc-1i4l3ts-1 dKzxhF']/span"));
    }

    public void clickCasasEAps() {
        dsl.click(By.xpath("//span[.='Venda - casas e apartamentos']"));
    }

    public void clickCheckCasas() {
        dsl.click(By.xpath("//body/div[@id='root']/div[@id='content']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]" +
                "/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/ul[1]/li[2]/label[1]/div[1]/input[1]"));
    }

    public void escreverPrecoMin() {
        dsl.escrever(By.xpath("//input[@placeholder='Min.']"), "0");
    }

    public void escreverPrecoMax() {
        dsl.escrever(By.xpath("//input[@placeholder='Máx.']"), "200000");
    }

    public boolean obterValorCheckCasas() {
        return dsl.isCheckMarcado(By.xpath("//body/div[@id='root']/div[@id='content']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]" +
                "/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/ul[1]/li[2]/label[1]/div[1]/input[1]"));
    }

    public String obterTextoValorMin() {
        return dsl.obterValorCampo(By.xpath("//input[@placeholder='Min.']"));
    }

    public String obterTextoValorMax() {
        return dsl.obterValorCampo(By.xpath("//input[@placeholder='Máx.']"));
    }

    public void clickPesquisaValores() {
        dsl.click(By.xpath("//div[@class='sc-270te7-5 jDUxQu']/button"));
    }

    public void selecionarComboValorAreaMin() {
        dsl.selecionarCombo(By.xpath("//body/div[@id='root']/div[@id='content']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]" +
                "/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/select[1]"), "90");
    }

    public void selecionarComboValorAreaMax() {
        dsl.selecionarCombo(By.xpath("//body/div[@id='root']/div[@id='content']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]" +
                "/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/select[1]"), "180");
    }

    public String obterValorComboAreaMin() {
        return dsl.obterValorCombo(By.xpath("//body/div[@id='root']/div[@id='content']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]" +
                "/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/select[1]"));
    }

    public String obterValorComboAreaMax() {
        return dsl.obterValorCombo(By.xpath("//body/div[@id='root']/div[@id='content']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]" +
                "/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/select[1]"));
    }

    public void clickPesquisaArea() {
        dsl.click(By.xpath("//body/div[@id='root']/div[@id='content']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/" +
                "div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[3]/button[1]/*[1]"));
    }
}
