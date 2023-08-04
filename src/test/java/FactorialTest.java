import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void testFactorial() {
        long expected = 120;
        long actual = Factorial.factorial(5);

        Assert.assertEquals(expected,actual);



    }
@Test
    public void testFactorial2() {
        long expected = 720;
        long actual = Factorial.factorial(6);

        Assert.assertEquals(expected,actual);



    }
}