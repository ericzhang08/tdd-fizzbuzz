package cn.xpbootcamp.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameNumberTest {

    @Test
    public void should_return_raw_number_given_normal_number() {
        assertEquals("1", new GameNumber(1).toString());
    }
}
