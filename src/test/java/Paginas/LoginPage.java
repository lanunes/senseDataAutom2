package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPage {
    private WebDriver navegador;

    public LoginPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public LoginPage informarOUsuario(String usuario){
        navegador.findElement(By.id("user-name")).click();
        navegador.findElement(By.id("user-name")).sendKeys (usuario);

        return this;
    }

    public LoginPage informarASenha(String senha){
        navegador.findElement(By.id("password")).click();
        navegador.findElement(By.id("password")).sendKeys(senha);

        return this;
    }

    public ListaDeProdutosPage submeterFormularioDeLogin(){
        navegador.findElement(By.id("login-button")).click();

        return new ListaDeProdutosPage(navegador);

    }
}


