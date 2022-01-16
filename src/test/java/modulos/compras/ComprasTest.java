package modulos.compras;

import Paginas.LoginPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@DisplayName("Testes web SenseData")
public class ComprasTest {
    private WebDriver navegador;

    @BeforeEach
    public void beforeEach(){
        // Abrir o Navegador
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver96\\chromedriver.exe");
        this.navegador = new ChromeDriver();

        //Maximizando a tela
        this.navegador.manage().window().maximize();
        this.navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //Navegar para a pagina da Swag Labs
        this.navegador.get("https://www.saucedemo.com");
    }

    @Test
    @DisplayName("Teste de uma simulacao de Compras no site Swag Labs")
    public void testComprasSwagLabs(){

        //Fazer Login
        new LoginPage(navegador)
                .informarOUsuario("standard_user")
                .informarASenha("secret_sauce")
                .submeterFormularioDeLogin().adicionarSauceLabsOnesieETestAllTheThingsTShirtRedAoCarrinho()
                .clicarNoCarrinho()
                .confirmarProdutos()
                .preencherDadosdeCompra()
                .submeterDadosdeCompra()
                .finalizarCompra()
                .conferirMensagemDeSucessoNaCompra();


    }
    @AfterEach
    public void afterEach(){
        //Fechando o navegador
        navegador.quit();
    }
}
