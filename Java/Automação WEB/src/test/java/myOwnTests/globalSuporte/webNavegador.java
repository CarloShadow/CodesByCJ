package myOwnTests.globalSuporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class webNavegador {

    private static WebDriver navegador;

    private webNavegador() {}

    public static WebDriver getNavegador(){
        if(navegador == null) {
            navegador = new EdgeDriver();
        }
        return navegador;
    }

    public static void killDriver(){
        if(navegador != null) {
            navegador.quit();
            navegador = null;
        }
    }
}

