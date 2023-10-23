package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page.HomePage;

public class Test {
    HomePage homePage;

    public Test()
    {
        homePage = new HomePage(Hooks.driver);
        //  datosTarjetaPage = new DatosTarjetaPage(Hooks.driver);
        // datosPagosPage = new DatosPagosPage(Hooks.driver);
    }

    @Given("la pagina demoguru esta disponible")
    public void laPaginaDemoguruEstaDisponible() {
        Hooks.driver.get("https://www.diainternacionalde.com/calcular-diferencia-entre-fechas");
    }

    @When("doy click en la Fecha")
    public void doyClickEnLaFecha() {
        homePage.seleccionarAnio();
        homePage.desplegarAnio();
        homePage.desplegarAnio2();
    }
}







