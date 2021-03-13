import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class CalFuncTestFactrl {

    @BeforeClass
    public static void beforeCalFuncTestClass(){
        System.out.println("Before CalFuncTestFactrl Class");
    }

    @Before
    public void beforeCalFuncTest(){
        System.out.println("Before CalFuncTestFactrl Testing");
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
        Object[][] data = new Object[][] { {5.0,120.0,0.0}, {10.0, 3628800.0, 0}, {4.0, 24.0, 0}};
        return Arrays.asList(data);
    }

    @Test
    public void fractionalfuncTesting() {
        Scientific_Calc SCalc = new Scientific_Calc();
        assertEquals(SCalc.verifyFactorial(m1, m2), true);
    }

    @After
    public void afterEmailTest(){
        System.out.println("After CalFuncTestFactrl Testing");
    }

    @AfterClass
    public static void afterEmailClass(){
        System.out.println("After CalFuncTestFactrl Class");
    }

}

