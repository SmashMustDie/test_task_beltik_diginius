import static com.beltik.PolyndromDetector.isPalindrom;
import com.beltik.singleton.Counter;
import com.beltik.singleton.CounterFactory;
import com.beltik.singleton.SingletonCounter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    //overall I've personally used singleton in one of
    //my applications with factory pattern to create client
    //instance for http calls to avoid flooding app with
    //copies of this client
    public void testCounterSingletonWithFactory() {
        Counter counter = null;
        for (int i = 0; i < 10; i++) {
            counter = CounterFactory.getCounter(false);
            counter.iterate();
        }
        assertEquals(10, counter.getCount());
    }

    @Test
    public void testCounterSingleton() {
        Counter counter = null;
        for (int i = 0; i < 10; i++) {
            counter = SingletonCounter.getInstance();
            counter.iterate();
        }
        assertEquals(10, counter.getCount());
    }

    @Test
    public void testCounterNotASingleton() {
        Counter counter = null;
        for (int i = 0; i < 10; i++) {
            counter = new Counter();
            counter.iterate();
        }
        assertNotEquals(10, counter.getCount());
    }

    @Test
    public void testPolindrom() {
        String stringToCheck = "kayak";
        assertTrue(isPalindrom(stringToCheck));
        stringToCheck = "Not a Palindrom";
        assertFalse(isPalindrom(stringToCheck));
        stringToCheck = "raCecAr";
        assertTrue(isPalindrom(stringToCheck));
        stringToCheck = "    was It a car or a cAt I saw ";
        assertTrue(isPalindrom(stringToCheck));
    }
}
