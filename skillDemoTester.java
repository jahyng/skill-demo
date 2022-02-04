import static org.junit.Assert.*;
import org.junit.*;


public class skillDemoTester {
    @Test 
    public void testSubtract() {
        assertEquals("Subtraction test fails!",2,skillDemo.subtract(3, 1)); 
        // test should pass 
    }
}
