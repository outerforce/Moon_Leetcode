import org.junit.Test;
import static org.junit.Assert.*;
/**
 * @author created by Ying
 * Date: 2018-08-31
 */

//JUnit runner to run with all the methods instead of the main function
public class TestSort {
    @Test
    public void testSort(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testFindSmallest(){
        String[] input = {"i", "have", "an", "egg"};
        int expected  = 2;
        int actual = Sort.findSmallest(input, 0);
        assertEquals(expected, actual);

        String[] input2 = {"a", "there", "should", "have", "some", "geese"};
        int expected2 = 5;
        int actual2 = Sort.findSmallest(input2,1);
        assertEquals(expected2, actual2);
    }
}
