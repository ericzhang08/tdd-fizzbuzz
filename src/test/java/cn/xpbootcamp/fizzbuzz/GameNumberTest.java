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
    public void test() {
        checkOutput("52", 52);
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
        checkOutput("BuzzWhizz", 140);
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

    @Test
    public void should_return_FizzWhizz_when_say_given_number_contains_7_and_is_dividable_by_all_numbers() {
        checkOutput("FizzWhizz", 1470);
    }

    @Test
    public void should_return_Fizz_when_say_given_number_contains_7_and_3_is_dividable_by_all_numbers() {
        checkOutput("Fizz", 2730);
    }

    @Test
    public void should_return_FizzWhizz_when_say_given_number_contains_7_and_5_is_dividable_by_all_numbers() {
        checkOutput("FizzWhizz", 1785);
    }

    @Test
    public void should_return_FizzWhizz_when_say_given_number_contains_7_and_5_and_3_is_dividable_by_all_numbers() {
        checkOutput("FizzWhizz", 735);
    }

    @Test
    public void checkAllCase() {
        checkOutput("Fizz", 13);
        checkOutput("Fizz", 30);
        checkOutput("BuzzWhizz", 35);
        checkOutput("Fizz", 75);
        checkOutput("1", 1);
        checkOutput("4", 4);
        checkOutput("Fizz", 6);
        checkoutPut(1, "1");
        checkoutPut(4, "4");
        checkoutPut(6, "Fizz");
        checkoutPut(10, "Buzz");
        checkoutPut(14, "Whizz");
        checkoutPut(60, "FizzBuzz");
        checkoutPut(21, "FizzWhizz");
        checkoutPut(140, "BuzzWhizz");
        checkoutPut(210, "FizzBuzzWhizz");
        checkoutPut(13, "Fizz");
        checkoutPut(3, "Fizz");
        checkoutPut(130, "Fizz");
        checkoutPut(133, "Fizz");
        checkoutPut(30, "Fizz");
        checkoutPut(63, "Fizz");
        checkoutPut(1330, "Fizz");
        checkoutPut(630, "Fizz");
        checkoutPut(52, "52");
        checkoutPut(51, "51");
        checkoutPut(5, "Buzz");
        checkoutPut(56, "Whizz");
        checkoutPut(15, "Buzz");
        checkoutPut(252, "Whizz");
        checkoutPut(245, "BuzzWhizz");
        checkoutPut(105, "BuzzWhizz");
        checkoutPut(17, "17");
        checkoutPut(27, "Fizz");
        checkoutPut(170, "170");
        checkoutPut(7, "Whizz");
        checkoutPut(270, "Fizz");
        checkoutPut(147, "FizzWhizz");
        checkoutPut(70, "Whizz");
        checkoutPut(1470, "FizzWhizz");
        checkoutPut(53, "53");
        checkoutPut(153, "153");
        checkoutPut(235, "Buzz");
        checkoutPut(532, "Whizz");
        checkoutPut(135, "Buzz");
        checkoutPut(1533, "Whizz");
        checkoutPut(35, "BuzzWhizz");
        checkoutPut(315, "BuzzWhizz");
        checkoutPut(37, "Fizz");
        checkoutPut(73, "Fizz");
        checkoutPut(237, "Fizz");
        checkoutPut(370, "Fizz");
        checkoutPut(371, "Fizz");
        checkoutPut(2370, "Fizz");
        checkoutPut(378, "Fizz");
        checkoutPut(3710, "Fizz");
        checkoutPut(2370, "Fizz");
        checkoutPut(157, "157");
        checkoutPut(57, "Fizz");
        checkoutPut(275, "275");
        checkoutPut(574, "Whizz");
        checkoutPut(75, "Fizz");
        checkoutPut(567, "FizzWhizz");
        checkoutPut(175, "Whizz");
        checkoutPut(1575, "FizzWhizz");
        checkoutPut(1357, "1357");
        checkoutPut(537, "Fizz");
        checkoutPut(1375, "1375");
        checkoutPut(3157, "Whizz");
        checkoutPut(375, "Fizz");
        checkoutPut(357, "FizzWhizz");
        checkoutPut(3745, "Whizz");
        checkoutPut(735, "FizzWhizz");

    }


    private void checkoutPut(int number, String fizz) {
        assertEquals(fizz, new GameNumber(number).say());
    }

    private void checkOutput(String fizz, int number) {
        assertEquals(fizz, new GameNumber(number).say());
    }
}
