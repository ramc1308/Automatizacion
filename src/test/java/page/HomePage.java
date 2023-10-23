package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage  extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//li[@data-view='month current']")
    private WebElement txtFecha;
    @FindBy(name ="FechaInicio")
    private WebElement txtFecha2;

    @FindBy(xpath ="//li[@data-view='year current']")
    private WebElement txtAnio;

    @FindBy(xpath ="//li[@data-view='month picked']")
    private WebElement txtMes;

    @FindBy(xpath ="//li[@data-view='month']")
    private WebElement txtMesNuevo;
    public void  seleccionarAnio(){
        wait.until(ExpectedConditions.visibilityOf(txtFecha2));
        txtFecha2.click();
        //txtFecha2.sendKeys("2023");
    }

    public void  desplegarAnio (){
        txtFecha.click();
        //txtMesNuevo.sendKeys("Jul");


    }
    public void  desplegarAnio2 (){

        wait.until(ExpectedConditions.visibilityOf(txtMes));
        System.out.println("mes "+txtMes.getText());
        System.out.println("mes2 "+txtMesNuevo.getText());
        System.out.println("mes2 "+txtMesNuevo.getText());
        txtMes.click();
        //txtFecha.sendKeys("Jul");
        System.out.println("aqui otra vez "+txtAnio.getText());

    }
}



