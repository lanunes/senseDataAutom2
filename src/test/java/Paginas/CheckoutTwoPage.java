package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutTwoPage {
    private WebDriver navegador;

    public CheckoutTwoPage(WebDriver navegador) {
        this.navegador = navegador;

    }
    //Na pagina CheckoutTwoPage clicar em Finish
    public CheckoutCompletePage finalizarCompra(){
        //Na pagina CheckoutTwoPage clicar em Finish
        navegador.findElement(By.id("finish")).click();

        return new CheckoutCompletePage(navegador);
    }

}
