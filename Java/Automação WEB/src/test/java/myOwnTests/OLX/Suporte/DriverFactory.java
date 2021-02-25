package myOwnTests.OLX.Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

    private static WebDriver navegador;

    private DriverFactory() {}

    public static WebDriver getDriver(){
        if (navegador == null) {
            navegador = new EdgeDriver();
        }
        return navegador;
    }

    public static void killDriver() {
        if (navegador != null) {
            navegador.quit();
            navegador = null;
        }
    }
}
