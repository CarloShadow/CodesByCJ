package myOwnTests.OLX.Pages;

import org.openqa.selenium.By;
import static myOwnTests.OLX.Suporte.DriverFactory.getDriver;

public class ImoveisPage extends BasePage {

    /**************************************** NAVEGANDO ATÉ IMÓVEIS ****************************************/

    public void acessarTelaInicial() {

        getDriver().get("https://www.olx.com.br/");
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

    public boolean obterValorCheckCasas() {
        return dsl.isCheckMarcado(By.xpath("//body/div[@id='root']/div[@id='content']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]" +
                "/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/ul[1]/li[2]/label[1]/div[1]/input[1]"));
    }
}
