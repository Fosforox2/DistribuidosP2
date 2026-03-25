import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    CalculadoraImpl calc;

    public CalculadoraTest() throws Exception {
        calc = new CalculadoraImpl();
    }

    @Test
    void testSuma() throws Exception {
        assertEquals(8, calc.sumar(5, 3));
    }

    @Test
    void testResta() throws Exception {
        assertEquals(2, calc.restar(5, 3));
    }

    @Test
    void testMultiplicacion() throws Exception {
        assertEquals(15, calc.multiplicar(5, 3));
    }

    @Test
    void testDivision() throws Exception {
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test
    void testDivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.dividir(5, 0);
        });
    }

    @Test
    void testRaiz() throws Exception {
        assertEquals(3, calc.raiz(9));
    }

    @Test
    void testRaizNegativa() {
        assertThrows(ArithmeticException.class, () -> {
            calc.raiz(-4);
        });
    }

    @Test
    void testSumarArray() throws Exception {
        float[] nums = {1, 2, 3};
        assertEquals(6, calc.sumarArray(nums));
    }
}