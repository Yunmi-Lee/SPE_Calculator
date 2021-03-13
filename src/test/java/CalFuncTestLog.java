import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class CalFuncTestLog {

    @BeforeClass
    public static void beforeCalFuncTestClass(){
        System.out.println("Before CalFuncTestLog Class");
    }

    @Before
    public void beforeCalFuncTest(){
        System.out.println("Before CalFuncTestLog Testing");
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
        Object[][] data = new Object[][] {{10, 2.302585092994046, 0}, {4, 1.3862943611198906, 0}};
        return Arrays.asList(data);
    }

    @Test
    public void natuallogarithmfuncTesting() {
        Scientific_Calc SCalc = new Scientific_Calc();
        assertEquals(SCalc.verifyNaturalLog(m1, m2), true);
    }

    @After
    public void afterEmailTest(){
        System.out.println("After CalFuncTestLog Testing");
    }

    @AfterClass
    public static void afterEmailClass(){
        System.out.println("After CalFuncTestLog Class");
    }

}
