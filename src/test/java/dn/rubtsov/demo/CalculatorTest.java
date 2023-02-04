package dn.rubtsov.demo;

import dn.rubtsov.demo.model.Calculator;
import dn.rubtsov.demo.exception.DivisionByZeroException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Сложение")
    void sum() {
        assertThat(calculator.sum(2,2)).isEqualTo(4);
    }

    @Test
    @DisplayName("Разница")
    void diff() {
        assertThat(calculator.diff(2,2)).isEqualTo(0);
    }

    @Test
    @DisplayName("Умножение")
    void multiply() {
        assertThat(calculator.multiply(2,2)).isEqualTo(4);
    }

    @Test
    @DisplayName("Деление")
    void divideBy() {
        assertThat(calculator.divide(2,2)).isEqualTo(1);
    }
    @Test
    @DisplayName("Деление на 0. Тест проверяет: выбрасывается или нет соответствующее исключение.")
    void divisionByZero() {
        assertThatThrownBy(()->calculator.divide(2,0)).isInstanceOf(DivisionByZeroException.class);
    }
}