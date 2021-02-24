package myOwnTests.OLX.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.concurrent.TimeUnit;

public class web {

    public static WebDriver createEdge() {
        //Abrindo navegador
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando para a página "Task it"
        navegador.get("https://www.olx.com.br/");

        return navegador;

    }
}
