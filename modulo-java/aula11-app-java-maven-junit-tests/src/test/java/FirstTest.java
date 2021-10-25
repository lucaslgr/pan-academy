import org.junit.After;
import org.junit.Test;

/**
 * Todo método de teste deve estar anotado com a anotação @Test e deve ser public e retorno void
 */

public class FirstTest {

    @Test
    public void metodoDeTesteValido() {
        
    }

    //@Test
    public String metodoDeTesteInvalidoDevidoAoReturnString() {
        return "";
    }

    //Tem que ser método public para que o Junit aceite rode o teste
    //@Test
    private void metodoDeTesteInvalidoDevidoAoPrivate() {

    }

    //Tem que ser método public para que o Junit aceite rode o teste
    //@Test
    protected void metodoDeTesteInvalidoDevidoAoProtected() {

    }

    @After
    public void metodoDeExemploDeTesteImpressoNaTela() {
        System.out.println("Esta mensagem não deve aparecer");
    }


}
