import org.junit.Test;
import static org.junit.Assert.*;

public class CheckItTest {

    //This test covers all the possible paths for P is true
    @Test
    public void testCheckIt_PIsTrue() {
        // Test when a, b, and c are true
        CheckIt.checkIt(true, true, true);

        // Test when a and b is true and c is false
        CheckIt.checkIt(true, true, false);

        // Test when a is true, b is false and c is true
        CheckIt.checkIt(true, false, true);

        // Test when a is true, b is false and c is false
        CheckIt.checkIt(true, false, false);

        // Test when b and c are true
        CheckIt.checkIt(false, true, true);
    }

    //This test covers all the possible paths for P is false
    @Test
    public void testCheckIt_PIsFalse() {
        // Test when a is false, b is true and c is false
        CheckIt.checkIt(false, true, false);

        // Test when a is false, b is false and c is true
        CheckIt.checkIt(false, false, true);

        // Test when a is false, b is false and c is false
        CheckIt.checkIt(false, false, false);
    }
}