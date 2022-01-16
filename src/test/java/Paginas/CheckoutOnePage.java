package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOnePage {
    private WebDriver navegador;

    public CheckoutOnePage(WebDriver navegador) {
        this.navegador = navegador;

    }
    //Na pagina CheckoutOnePage Preencher o formulario
    public CheckoutOnePage preencherDadosdeCompra(){
        navegador.findElement(By.id("first-name")).sendKeys("Lanunes");
        navegador.findElement(By.id("last-name")).sendKeys("Lanunes");
        navegador.findElement(By.id("postal-code")).sendKeys("54321");

        return this;
    }

    //Na pagina CheckoutOnePage submeter clicando em Continue
    public CheckoutTwoPage submeterDadosdeCompra(){
        navegador.findElement(By.id("continue")).click();

        return new CheckoutTwoPage(navegador);
    }

}
