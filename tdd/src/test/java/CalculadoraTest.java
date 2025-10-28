import org.ehmsoft.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        double resultado = Calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testRestar() {
        double resultado = Calculadora.restar(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testMultiplicar() {
        double resultado = Calculadora.multiplicar(5, 3);
        assertEquals(15, resultado);
    }
}


