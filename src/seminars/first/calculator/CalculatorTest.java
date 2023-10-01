package seminars.first.calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        // Проверка базового функционала с целыми числами, с использованием утверждений:
        assert 4500.00 == Calculator.calculateDiscount(5_000.00, 10);
        assert 970.00 == Calculator.calculateDiscount(1000.00, 3);
        assert 4950.00 == Calculator.calculateDiscount(5000.00, 5);

        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
        assertThat(Calculator.calculateDiscount(5000.00, 10)).isEqualTo(4500.00);
        assertThat(Calculator.calculateDiscount(5000.00, 5)).isEqualTo(4750.00);
        assertThat(Calculator.calculateDiscount(5000.00, 1)).isEqualTo(4950.00);

        // Проверка ожидаемого исключения с использованием утверждений AssertJ:
        try {
            Calculator.calculateDiscount(-1.0, -1);
        } catch (ArithmeticException e) {
            assertThatThrownBy(() ->
                    Calculator.calculateDiscount(0, -1)).isInstanceOf(ArithmeticException.class);
        }
        assertThatThrownBy(() ->
                Calculator.calculateDiscount(10, -5)).isInstanceOf(ArithmeticException.class);
    }
}