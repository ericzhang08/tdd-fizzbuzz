package cn.xpbootcamp.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameNumberTest {

    @Test
    public void should_return_raw_number_given_normal_number() {
        assertEquals("1", new GameNumber(1).toString());
    }

    @Test
    public void should_return_Fizz_when_number_is_divisible_by_3() {
        assertEquals("Fizz", new GameNumber(3).toString());
    }
}
