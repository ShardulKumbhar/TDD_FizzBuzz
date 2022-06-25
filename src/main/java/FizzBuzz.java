public class FizzBuzz {


    public String convert(int number){
        if (isDivisibleBy(number,3) && isDivisibleBy(number,5)) return "FizzBuzz";
        if (isDivisibleBy(number,3)) return "Fizz";
        if (isDivisibleBy(number,5)) return "Buzz";
        return Integer.toString(number);
    }

    private boolean isDivisibleBy(int divident,int divisor) {
        return divident % divisor == 0;
    }
}
