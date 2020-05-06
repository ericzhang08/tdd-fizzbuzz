package cn.xpbootcamp.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameNumberTest {

    @Test
    public void should_return_raw_number_given_normal_number() {
        checkOutput("1", 1);
    }

    @Test
    public void should_return_Fizz_when_number_is_divisible_by_3() {
        checkOutput("Fizz", 3);
    }

    @Test
    public void should_return_Buzz_when_number_is_divisible_by_5() {
        checkOutput("Buzz", 5);
    }


    @Test
    public void should_return_Whizz_when_number_is_divisible_by_7() {
        checkOutput("Whizz", 7);
    }

    @Test
    public void should_return_FizzBuzz_when_number_is_divisible_by_3_and_5() {
        checkOutput("FizzBuzz", 15);
    }





    private void checkOutput(String fizz, int i) {
        assertEquals(fizz, new GameNumber(i).toString());
    }
}
