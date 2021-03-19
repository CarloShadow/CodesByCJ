package Podium.Pages;


import static Podium.Suport.DriverFactory.getDriver;

public class Link extends basePage_{

    public void acessHomePage() {

        getDriver().get("https://www.podium.com/");
    }
}
