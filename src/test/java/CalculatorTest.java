import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() throws Exception {
        Calculator calc = new Calculator();
        Assert.assertEquals(4, calc.add(2,2));
    }
}
