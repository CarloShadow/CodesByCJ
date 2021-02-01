package testWebmotors.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testWebmotors.DSL.dslWebmotors;

public class webmotorsPage {

    private final dslWebmotors dsl;

    public webmotorsPage(WebDriver navegador) {
        dsl = new dslWebmotors(navegador);
    }

    public String obterTextoHondaCityNovosEUsados() {
        return dsl.receberTexto(By.id("honda-city"));
    }

    public String obterTextoHONDACITY15DX16VFLEX4PAUTOMATICO() {
        return dsl.receberTexto(By.id("honda-city-1.5-dx-16v-flex-4p-automatico"));
    }

    public String obterTextoVersoes() {
        return dsl.receberTexto(By.xpath("//div[text()='Versões']"));
    }

    public void clicarCampoPesquisa() {
        dsl.clicarBy(By.xpath("//a[@class='SearchBar__results__result']//div[@class='SearchBar__results__result__name']"));
    }

    public void desmarcarLocalSP() {
        dsl.clicarBy(By.cssSelector("div[class='AutoComplete__icon AutoComplete__icon--close']"));
    }

    public void clicarTodasVersoes() {
        dsl.clicarBy(By.xpath("//div[text()='Todas as versões']"));
    }

    public void clicarModeloCarro() {
        dsl.clicarBy(By.linkText("1.5 DX 16V FLEX 4P AUTOMÁTICO"));
    }

    public void escreverHondaCity() {
        dsl.escrever("searchBar", "Honda City");
    }

    public String obterTextoCampoBusca() {
        return dsl.obterTextoByAttribute("searchBar");
    }

    /********************** ESTOQUE DA LOJA **************************/

    public String obterTextoEstoque() {
        return dsl.receberTexto(By.xpath("//p[@class='sc-jlyJG eBdGuJ']"));
    }
}
