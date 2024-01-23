package jp.ac.uryukyu.ie.e225756;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumTest {

    @Test
    public void makeNumTest() {
        int[] result = Num.makeNum();
        assertEquals(Num.answer_size, result.length);

        for (int i = 0; i < result.length; i++) {
            assertTrue(result[i] >= 0 && result[i] < 10);
        }
    }
}
