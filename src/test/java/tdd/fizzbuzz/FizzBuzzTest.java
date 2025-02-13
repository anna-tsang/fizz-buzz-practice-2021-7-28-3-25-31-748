package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_1_when_count_off_order_number_1_with_normal_case(){
        //given
        int order = 1;
        //when
        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.countOff(order);
        //then
        assertEquals("1",result);
    }

    @Test
    void should_return_fizz_when_count_off_number_3_with_multiple_of_3(){
        //given
        int order = 3;
        //when
        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.countOff(order);
        //then
        assertEquals("Fizz",result);
    }

    @Test
    void should_return_buzz_when_count_off_number_5_with_multiple_of_5(){
        //given
        int order = 5;
        //when
        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.countOff(order);
        //then
        assertEquals("Buzz",result);
    }
    @Test
    void should_return_whizz_when_count_off_number_7_with_multiple_of_7(){
        //given
        int order = 7;
        //when
        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.countOff(order);
        //then
        assertEquals("Whizz",result);
    }

    @Test
    void should_return_FizzBuzz_when_count_off_number_with_multiple_of_3_5(){
        //given
        int order = 15;
        //when
        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.countOff(order);
        //then
        assertEquals("FizzBuzz",result);
    }

    @Test
    void should_return_FizzWhizz_when_count_off_number_with_multiple_of_3_7(){
        //given
        int order = 21;
        //when
        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.countOff(order);
        //then
        assertEquals("FizzWhizz",result);
    }

    @Test
    void should_return_BuzzWhizz_when_count_off_number_with_multiple_of_5_7(){
        //given
        int order = 35;
        //when
        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.countOff(order);
        //then
        assertEquals("BuzzWhizz",result);
    }

    @Test
    void should_return_FizzBuzzWhizz_when_count_off_number_with_multiple_of_3_5_7(){
        //given
        int order = 105;
        //when
        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.countOff(order);
        //then
        assertEquals("FizzBuzzWhizz",result);
    }

}
