package cn.xpbootcamp.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameNumberTest {

    @Test
    public void should_return_raw_number_given_normal_number() {
        GameNumber gameNumber = new GameNumber(1);
        assertEquals("1", gameNumber.toString());
    }
}
