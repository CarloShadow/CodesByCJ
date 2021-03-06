package myOwnTests.lojaPackageTests.Pages;

import myOwnTests.lojaPackageTests.DSL.dslCadastro;
import org.openqa.selenium.By;

public class cadastroPage {

    private final dslCadastro dsl;

    public cadastroPage() {
        dsl = new dslCadastro();
    }

    public void setSignIn() {
        dsl.clicar(By.linkText("Sign in"));
    }

    public String obterTextoEmailAddress() {
        return dsl.obterTexto("label[for='email_create']");
    }

    public void setEmailCadastro() {
        dsl.escreverCssSelector("input[id='email_create']", "fabiana9444@uorak.com");
    }

    public void setCliqueBotaoCadastro() {
        dsl.clicar(By.id("SubmitCreate"));
    }

    public String setObterTextoCreatAnAnccount() {
        return dsl.receberTexto(By.tagName("h3"));
    }

    public void setCliqueRadioMasculino() {
        dsl.clicar(By.id("id_gender1"));
    }

    public boolean setObterCliqueRadio() {
        return dsl.receberValorRadio("id_gender1");
    }

}
