import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GCDTest {

    @Test
    public void gcdTest(){
        int expected = 6;
        int actual = GCD.gcd(6,12);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void gcdTest2(){
        int expected = 1;
        int actual = GCD.gcd(7, 2221);

        Assert.assertEquals(expected,actual);
    }

}