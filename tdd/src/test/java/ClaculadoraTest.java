import org.ehmsoft.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClaculadoraTest {
    @Test
    void testSuma() {
        assertEquals(5, Calculadora.sumar(2,3));
    }

    @Test
    void restar() {
        assertEquals(6, Calculadora.restar(10,4));
    }

}
