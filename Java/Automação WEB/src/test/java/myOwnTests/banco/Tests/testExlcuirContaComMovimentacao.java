package myOwnTests.banco.Tests;

import myOwnTests.banco.Pages.BasePage;
import myOwnTests.banco.Pages.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testExlcuirContaComMovimentacao extends BaseTest {

    private BasePage page;

    @Before
    public void setUp() {
        page = new BasePage();
    }

    @Test
    public void test3RemoverContaComMovimentacao() {

        // Navegando até lista de contas
        page.setClickContas();
        page.setClickListar();
        Assert.assertEquals("Conta", page.obterTextoConta());

        // Clicando em excluir conta com movimentação
        page.setClicarExcluirConta("Conta Bill Gates");
        Assert.assertEquals("Conta em uso na movimentações", page.obterTextoContaEmUso());
    }
}
