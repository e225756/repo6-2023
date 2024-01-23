package jp.ac.uryukyu.ie.e225756;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

public class gameMasterTest {

    @Test
    public void testReadUserAnswer() {
        String input = "1\n2\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, gameMaster.readUserAnswer());
    }

    @Test
    public void testCheack() {
        int[] rightAnswer = {1, 2, 3};
        int[] userAnswer = {1, 2, 3};
        gameMaster.cheack(rightAnswer, userAnswer);
        assertEquals(3, gameMaster.hit);
        assertEquals(0, gameMaster.blow);
    }
}