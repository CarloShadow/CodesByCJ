package myOwnTests.lojaPackageTests.Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.concurrent.TimeUnit;

public class webLoja {

    public static WebDriver createEdge2() {
        // Abrindo navegador
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Entrando na página
        navegador.get("http://automationpractice.com/index.php");

        return navegador;
    }
}
