
package StringUtil;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StringUtilTest {
    
    @Test
    void testMadam() {
        StringUtil util = new StringUtil();

        assertTrue(util.isPalindrome("madam"));
    }

    @Test
    void testRaceCar() {
        StringUtil util = new StringUtil();

        assertTrue(util.isPalindrome("RaceCar"));
    }

    @Test
    void testHello() {
        StringUtil util = new StringUtil();

        assertFalse(util.isPalindrome("hello"));
    }

    @Test
    void testNull() {
        StringUtil util = new StringUtil();

        assertFalse(util.isPalindrome(null));
    }

    @Test
    void testEmptyString() {
        StringUtil util = new StringUtil();

        assertFalse(util.isPalindrome(""));
    }
    
}
