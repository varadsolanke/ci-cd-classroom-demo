package demo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class CalculatorTest {
private final Calculator calculator = new Calculator();
@Test
void addReturnsSum() {
assertEquals(5, calculator.add(2, 3));
}
@Test
void subtractReturnsDifference() {
assertEquals(1, calculator.subtract(3, 2));
}
@Test
void multiplyReturnsProduct() {
assertEquals(6, calculator.multiply(2, 3));
}
}
