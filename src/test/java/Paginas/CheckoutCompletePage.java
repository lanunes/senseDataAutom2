package Paginas;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage {
    private WebDriver navegador;

    public CheckoutCompletePage(WebDriver navegador) {
        this.navegador = navegador;

    }

    //Na pagina CheckoutComplete conferir a mensagem de compra com sucesso
    public CheckoutCompletePage conferirMensagemDeSucessoNaCompra(){
        String mensagemSucesso = navegador.findElement(By.cssSelector(".complete-header")).getText();
        Assertions.assertEquals("THANK YOU FOR YOUR ORDER", mensagemSucesso);

        return this;
    }

}
