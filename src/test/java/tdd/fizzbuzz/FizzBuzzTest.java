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

}
