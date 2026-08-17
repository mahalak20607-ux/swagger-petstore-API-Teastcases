package TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;
import Code.Calculator;
public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator cal = new Calculator();
        int actual = cal.add(10, 20);
        int expected = 30;
        Assert.assertEquals(actual, expected);
        System.out.println("Addition Test Passed");
    }
    @Test
    public void testSubtraction() {
        Calculator cal = new Calculator();
        int actual = cal.subtract(20, 10);
        int expected = 10;
        Assert.assertEquals(actual, expected);
        System.out.println("Subtraction Test Passed");
    }
    @Test
    public void testMultiplication() {
        Calculator cal = new Calculator();
        int actual = cal.multiply(5, 4);
        int expected = 20;
        Assert.assertEquals(actual, expected);
        System.out.println("Multiplication Test Passed");
    }
}