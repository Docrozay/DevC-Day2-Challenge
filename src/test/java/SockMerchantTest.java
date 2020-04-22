import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SockMerchantTest {

    private SockMerchant sockMerchant;

    @Before
    public void setup() {
        sockMerchant = new SockMerchant();
    }

    @Test
    public void firstTestCase() {
        int expected = 3;
        int n = 9;
        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        assertEquals(expected, sockMerchant.sockMerchant(n, arr));
    }

    @Test
    public void secondTestCase() {
        int expected = 6;
        int n = 15;
        int[] arr = {6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5};


        assertEquals(expected, sockMerchant.sockMerchant(n, arr));

    }


    @Test
    public void thirdTestCase() {
        int expected = 28;
        int n = 100;
        int[] arr = {50, 49, 38, 49, 78, 36, 25, 96, 10, 67, 78, 58, 98, 8, 53, 1, 4, 7, 29, 6, 59, 93, 74, 3, 67, 47, 12, 85, 84, 40, 81, 85, 89, 70, 33, 66, 6, 9, 13, 67, 75, 42, 24, 73, 49, 28, 25, 5, 86, 53, 10, 44, 45, 35, 47, 11, 81, 10, 47, 16, 49, 79, 52, 89, 100, 36, 6, 57, 96, 18, 23, 71, 11, 99, 95, 12, 78, 19, 16, 64, 23, 77, 7, 19, 11, 5, 81, 43, 14, 27, 11, 63, 57, 62, 3, 56, 50, 9, 13, 45};

        assertEquals(expected, sockMerchant.sockMerchant(n, arr));


    }

}
