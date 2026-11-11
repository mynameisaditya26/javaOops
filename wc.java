import java.util.*;
public class wc{
    public static void main(String args[]){

        // ArrayList<Integer> numbers = new ArrayList<>();
        // numbers.add(10);
        // numbers.add(20);
        // numbers.add(30);
        // System.out.println(numbers);
        // for (Integer number : numbers) {
        //     System.out.println(number.getClass().getName());
        // }
        // System.out.println(numbers.get(0).getClass());

        // int a = 10;
        // Integer b = a;    // autoboxing 
        // System.out.println(b);
        // System.out.println(b.getClass());
        // System.out.println(b.getClass().getName());

        // Integer a = 50;
        // int b = a;     // unboxing 
        // System.out.println(b);

        // 1. parseInt() - String to primitive int
        int a = Integer.parseInt("100");
        System.out.println("parseInt(): " + a);

        // 2. valueOf() - String to Integer object
        Integer b = Integer.valueOf("200");
        System.out.println("valueOf(): " + b);

        // 3. toString() - Convert number to String
        String str = Integer.toString(300);
        System.out.println("toString(): " + str);

        // 4. compareTo() - Compare two wrapper objects
        Integer x = 10;
        Integer y = 20;
        System.out.println("compareTo(): " + x.compareTo(y));

        // 5. intValue() - Integer object to primitive int
        Integer num = 500;
        int value = num.intValue();
        System.out.println("intValue(): " + value);

        // 6. doubleValue() - Integer object to primitive double
        double d = num.doubleValue();
        System.out.println("doubleValue(): " + d);

        // 7. MAX_VALUE - Maximum int value
        System.out.println("MAX_VALUE: " + Integer.MAX_VALUE);

        // 8. MIN_VALUE - Minimum int value
        System.out.println("MIN_VALUE: " + Integer.MIN_VALUE);

        // 9. isDigit() - Check whether a character is a digit
        System.out.println("isDigit(): " + Character.isDigit('5'));

        // 10. isLetter() - Check whether a character is a letter
        System.out.println("isLetter(): " + Character.isLetter('A'));

        // 11. isUpperCase() - Check uppercase character
        System.out.println("isUpperCase(): " + Character.isUpperCase('A'));

        // 12. isLowerCase() - Check lowercase character
        System.out.println("isLowerCase(): " + Character.isLowerCase('a'));

        // 13. parseDouble() - String to primitive double
        double price = Double.parseDouble("99.5");
        System.out.println("parseDouble(): " + price);

        // 14. parseBoolean() - String to primitive boolean
        boolean flag = Boolean.parseBoolean("true");
        System.out.println("parseBoolean(): " + flag);

        // 15. equals() - Compare wrapper values
        Integer p = 100;
        Integer q = 100;
        System.out.println("equals(): " + p.equals(q));

        // 16. getClass() - Get runtime class of an object
        System.out.println("getClass(): " + b.getClass());
    }
}