package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrinhoPage {

    private WebDriver navegador;

    public CarrinhoPage(WebDriver navegador){
        this.navegador = navegador;

    }

    //Na pagina do Carrinho clicar em Checkout
    public CheckoutOnePage confirmarProdutos(){
        navegador.findElement(By.id("checkout")).click();

        return new CheckoutOnePage(navegador);
    }
}
