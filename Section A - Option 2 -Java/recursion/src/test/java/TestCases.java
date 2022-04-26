import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.junit.JUnit4TestClass;
import org.testng.junit.JUnitTestClass;

public class TestCases {

    @Test
    public void test() {

        Assert.assertEquals("Result fibonacci Recursive", 5);
        Assert.assertEquals("Result fibonacci Recursive", 10);
        Assert.assertEquals("Result fibonacci Recursive",20);
        Assert.assertEquals("Result fibonacci Recursive",30);
    }

}
