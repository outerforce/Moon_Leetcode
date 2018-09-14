import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author created by Ying
 * Date: 2018-09-10
 */
public class TestDate {
    @Test
    public void testEquals(){
        Date d1 = new Date(9,10,2018);
        Date d2 = new Date(9,10,2018);
        Date d3 = new Date(4,20,1990);
        assertEquals(d1, d1);
        assertEquals(d1, d2);
        assertNotEquals(d1, d3);
        assertNotEquals(d1, "horse");
        assertNotEquals(d1, null);
    }
}
