package myOwnTests.OLX.Pages;

import org.openqa.selenium.By;

public class olxPage extends BasePage {

    public void escreverPrecoMin() {
        dsl.escrever(By.xpath("//input[@placeholder='Min.']"), "0");
    }

    public void escreverPrecoMax() {
        dsl.escrever(By.xpath("//input[@placeholder='Máx.']"), "200000");
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
