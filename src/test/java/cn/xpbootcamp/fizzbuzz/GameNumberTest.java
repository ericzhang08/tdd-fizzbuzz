package cn.xpbootcamp.fizzbuzz;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class GameNumberTest {

    @Test
    public void should_return_raw_number_when_say_given_normal_number() {
        checkOutput("1", 1);
    }

    @Test
    public void should_return_Fizz_when_say_given_number_is_divisible_by_3() {
        checkOutput("Fizz", 3);
    }

    @Test
    public void should_return_Buzz_when_say_given_number_is_divisible_by_5() {
        checkOutput("Buzz", 5);
    }


    @Test
    public void should_return_Whizz_when_say_given_number_is_divisible_by_7() {
        checkOutput("Whizz", 7);
    }

    @Test
    public void should_return_FizzBuzz_when_say_given_number_is_divisible_by_3_and_5() {
        checkOutput("FizzBuzz", 240);
    }

    @Test
    public void should_return_FizzWhizz_when_say_given_number_is_divisible_by_3_and_7() {
        checkOutput("FizzWhizz", 21);
    }


    @Test
    public void should_return_BuzzWhizz_when_say_given_number_is_divisible_by_5_and_7() {
        checkOutput("BuzzWhizz", 70);
    }


    @Test
    public void should_return_FizzBuzzWhizz_when_say_given_number_is_divisible_by_3_and_5_and_7() {
        checkOutput("FizzBuzzWhizz", 210);
    }

    @Test
    public void should_return_Fizz_when_say_given_number_contains_3() {
        checkOutput("Fizz", 13);
    }

    @Test
    public void should_return_fizz_when_say_given_number_contains_3_and_is_dividable_by_all_numbers() {
        checkOutput("Fizz", 2310);
    }

    @Test
    public void should_return_BuzzWhizz_when_say_given_number_contains_5_and_is_dividable_by_all_numbers() {
        checkOutput("BuzzWhizz", 2415);
    }

    @Test
    public void should_return_BuzzWhizz_when_say_given_number_contains_3_and_5_and_is_dividable_by_all_numbers() {
        checkOutput("BuzzWhizz", 1365);
    }




    private void checkOutput(String fizz, int number) {
        assertEquals(fizz, new GameNumber(number).say());
    }
}
