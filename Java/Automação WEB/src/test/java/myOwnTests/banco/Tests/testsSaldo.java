package myOwnTests.banco.Tests;

import myOwnTests.banco.Pages.BasePage;
import myOwnTests.banco.Pages.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testsSaldo extends BaseTest {

    private BasePage page;

    @Before
    public void setUp() {
        page = new BasePage();
    }

    @Test
    public void testVerificarSaldoDasContas() {

        Assert.assertEquals("100000000000.00", page.obterSaldoConta("Conta Bill Gates"));
    }
}
