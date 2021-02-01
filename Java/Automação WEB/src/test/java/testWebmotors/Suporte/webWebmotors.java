package testWebmotors.Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class webWebmotors {

    public static WebDriver createEdge() {
        // Abrindo navegador
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        //navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Entrando na página
        navegador.get("https://www.webmotors.com.br/");

        return navegador;
    }

    public static WebDriver createEdge1() {
        // Abrindo navegador
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Entrando na página
        navegador.get("https://www.webmotors.com.br/carros/estoque/?IdRevendedor=3834764&TipoVeiculo=carros&anunciante=concession%C3%A1ria%7Cloja");

        return navegador;
    }
}