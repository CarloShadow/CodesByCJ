package myOwnTests.banco.Tests;

import myOwnTests.banco.Pages.BasePage;
import myOwnTests.banco.Pages.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static myOwnTests.banco.Pages.Propriedades.NOME_CONTA_ALTERADA;

public class testsSaldo extends BaseTest {

    private BasePage page;

    @Before
    public void setUp() {
        page = new BasePage();
    }

    @Test
    public void testVerificarSaldoDasContas() {

        Assert.assertEquals("100000000000.00", page.obterSaldoConta("Conta Alterada 26211561351300"));
    }
}
