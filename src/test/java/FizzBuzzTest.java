import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {


    @Test
    void shouldReturnFizzIfTheNumberIsDivisibleBy3() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.print(3);

        assertEquals("Fizz", result);
        
    }
}
