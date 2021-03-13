import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class CalFuncTestSqrt {

    @BeforeClass
    public static void beforeCalFuncTestClass(){
        System.out.println("Before CalFuncTestSqrt Class");
    }

    @Before
    public void beforeCalFuncTest(){
        System.out.println("Before CalFuncTestSqrt Testing");
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
        Object[][] data = new Object[][] {{81.0,9.0,0.0}, {16.0,4.0,0.0}, {25.0,5.0,0.0}};
        return Arrays.asList(data);
    }

    @Test
    public void squarerootfuncTesting() {
        Scientific_Calc SCalc = new Scientific_Calc();
        assertEquals(SCalc.verifySqrRoot(m1, m2), true);
    }

    @After
    public void afterEmailTest(){
        System.out.println("After CalFuncTestSqrt Testing");
    }

    @AfterClass
    public static void afterEmailClass(){
        System.out.println("After CalFuncTestSqrt Class");
    }

}

