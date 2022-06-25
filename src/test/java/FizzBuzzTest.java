import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {


    @Test
    void shouldReturnFizzIfTheNumberIsDivisibleBy3() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.print(3);

        assertEquals("Fizz", result);

    }

    @Test
    void shouldReturnBuzzIfTheNumberIsDivisibleBy5() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.print(5);

        assertEquals("Buzz",result);
        
    }
}
