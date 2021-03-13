import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class CalFuncTestPow {

    @BeforeClass
    public static void beforeCalFuncTestClass(){
        System.out.println("Before CalFuncTestPow Class");
    }

    @Before
    public void beforeCalFuncTest(){
        System.out.println("Before CalFuncTestPow Testing");
    }

    // fields used together with @Parameter must be public
    @Parameterized.Parameter(0)
    public double m1;

    @Parameterized.Parameter(1)
    public double m2;

    @Parameterized.Parameter(2)
    public double result;

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data = new Object[][] {{2, 10, 1024}, {4, 5, 1024}, {11, 3, 1331}};
        return Arrays.asList(data);
    }

    @Test
    public void powerfuncTesting() {
        Scientific_Calc SCalc = new Scientific_Calc();
        assertEquals(SCalc.verifyPower(m1, m2, result), true);
    }

    @After
    public void afterEmailTest(){
        System.out.println("After CalFuncTestPow Testing");
    }

    @AfterClass
    public static void afterEmailClass(){
        System.out.println("After CalFuncTestPow Class");
    }

}
