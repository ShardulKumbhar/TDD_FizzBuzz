import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {


    @Test
    void shouldReturnFizzIfTheNumberIsDivisibleBy3() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(3);

        assertEquals("Fizz", result);

    }

    @Test
    void shouldReturnBuzzIfTheNumberIsDivisibleBy5() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(5);

        assertEquals("Buzz",result);
        
    }

    @Test
    void shouldReturnFizzBuzzIfTheNumberIsDivisibleByBoth5and3() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(30);

        assertEquals("FizzBuzz",result);
        
    }
}
