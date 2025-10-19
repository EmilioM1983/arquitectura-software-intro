import org.ehmsoft.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {
    @Test
    void testSuma() {
        assertEquals(5, Calculadora.sumar(2,3));
    }

    @Test
    void testRestar() {
        assertEquals(6, Calculadora.restar(10,4));
    }

}
