package myOwnTests.lojaPackageTests.Pages;

import myOwnTests.lojaPackageTests.DSL.dslLoja;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LojaPage {

    private final dslLoja dsl;

    public LojaPage(WebDriver navegador) {
        dsl = new dslLoja(navegador);
    }

    public void setSignIn() {
        dsl.clicar(By.linkText("Sign in"));
    }

    public void setEmail(String email) {
        dsl.escreverById("email", email);
    }

    public void setSenha(String senha) {
        dsl.escreverById("passwd", senha);
    }

    public void setBotaoLogin() {
        dsl.clicar(By.id("SubmitLogin"));
    }

    public void setHoverMenu() {
        dsl.hoverNoMenu("//div[@id='block_top_menu']//a[@title='Women']");
    }

    public void setOpcaoTshirt() {
        dsl.clicar(By.xpath("//ul[@style='display: none;']//a[@title='T-shirts']"));
    }

    public String obterTextoEmailAddress() {
        return dsl.obterTexto("label[for='email_create']");
    }

    public String obterEmail() {
        return dsl.receberValorDoCampo("email");
    }

    public String obterSenha() {
        return dsl.receberValorDoCampo("passwd");
    }

    public String obterTextoMyAccount() {
        return dsl.receberTexto(By.tagName("h1"));
    }

    public String obterTextoTshirt() {
        return dsl.receberTexto(By.xpath("//h1[@class='page-heading product-listing']//span[@class='cat-name']"));
    }
}
