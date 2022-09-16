import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTests {
    private calculator calculator = new calculator();
    private final double num1 = 10;
    private final double num2 = 5;

    @Test(priority = 3)
    public void checkAdd(){
        double expectedResult = num1 + num2;
        double actualResult = calculator.add(num1,num2);

        Assert.assertEquals(actualResult, expectedResult, "test failed for method add");
    }
    @Test(priority = 1)
    public void checkMult(){
        double expectedResult = num1 * num2;
        double actualResult = calculator.mult(num1,num2);

        Assert.assertEquals(actualResult, expectedResult, "test failed for method multiplication");
    }
    @Test(priority = 4)
    public void checkDiv(){
        double expectedResult = num1 / num2;
        double actualResult = calculator.div(num1,num2);

        Assert.assertEquals(actualResult, expectedResult, "test failed for method division");
    }
    @Test
    public void checkSub(){
        double expectedResult = num1 - num2;
        double actualResult = calculator.sub(num1,num2);

        Assert.assertEquals(actualResult, expectedResult, "test failed for method substacrion");
    }


}
