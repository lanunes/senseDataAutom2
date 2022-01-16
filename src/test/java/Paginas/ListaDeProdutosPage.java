package Paginas;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaDeProdutosPage {

    private WebDriver navegador;

    public ListaDeProdutosPage(WebDriver navegador){
        this.navegador = navegador;

    }
    //Na pagina de Produtos Ordenar Low to High
    public ListaDeProdutosPage ordenarProdutosLowToHigh(){
        navegador.findElement(By.className("product_sort_container")).click();
        navegador.findElement(By.cssSelector("option[value='lohi']")).click();

        return this;
    }

    //Na pagina de Produtos adicionar Sauce Labs Onesie e Test.allTheThings() T-Shirt (Red) ao carrinho
    public ListaDeProdutosPage adicionarSauceLabsOnesieETestAllTheThingsTShirtRedAoCarrinho(){
        navegador.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        navegador.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();

        return this;
    }

    //Na pagina de Produtos clicar no carrinho
    public CarrinhoPage clicarNoCarrinho(){
        navegador.findElement(By.className("shopping_cart_link")).click();

        return new CarrinhoPage(navegador);
    }
}
