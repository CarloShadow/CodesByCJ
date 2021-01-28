package cursoJulioDeLima.tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import cursoJulioDeLima.pages.LoginPage;
import cursoJulioDeLima.suporte.Web;
import static org.junit.Assert.*;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "InformacoesUsuariosPageObjectsTest.csv")
public class InformacoesUsuariosPageObjectsTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createBrowserStack();

    }
    @Test
    public void testAdicionarUmaInformacaoDoUsuario(
            @Param(name="login")String login,
            @Param(name="senha")String senha,
            @Param(name="tipo")String tipo,
            @Param(name="contato")String contato,
            @Param(name="mensagem")String mensagem


    ) {
        String textoToast = new LoginPage(navegador)
                .clicarSignIn()
                .fazerLogin(login,senha)
                .clicarme()
                .clicarAbaMoreDataAboutYou()
                .clicarBotaoAddMoreDataAboutYou()
                .adicionarContato(tipo, contato)
                .capturarTextoToast();

        assertEquals(mensagem, textoToast);
    }

    @After
    public void tearDown() {
        navegador.quit();
    }
}
