import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GCD2Test {



    @Test
    public void gdc2Test(){
        int expected = 1;
        int actual = GCD2.gcd2(7, 2221);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void gdc2Test2(){
        int expected = 2;
        int actual = GCD2.gcd2(8, 2222);

        Assert.assertEquals(expected,actual);
    }



}