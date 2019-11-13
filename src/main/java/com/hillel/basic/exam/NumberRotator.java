package com.hillel.basic.exam;

/**
 * Take a number: 56789. Rotate left, you get 67895.
 * Keep the first digit in place and rotate left the other digits: 68957.
 * Keep the first two digits in place and rotate the other ones: 68579.
 * Keep the first three digits and rotate left the rest: 68597. Now it is over since keeping the first four it remains
 * only one digit which rotated is itself.
 * <p>
 * You have the following sequence of numbers:
 * 56789 -> 67895 -> 68957 -> 68579 -> 68597
 * and you must return the greatest: 68957.
 * <p>
 * Calling this function max_rot (or maxRot or ... depending on the language)
 * max_rot(56789) should return 68957
 */

public class NumberRotator {

    public static long rotate(long n) {
        String numberString = n+"";
        //char[] numberArr = numberString.toCharArray();
        long result = n;

        //char temp ;
       // String temp2;
        for (int i = 0; i < numberString.length()-1; i++) {
            if(i == 0) {
                char temp = numberString.charAt(i);
                //  temp = numberString.charAt(i);
                String substring = numberString.substring(i + 1);
                String newString = substring + temp;
                numberString = newString;
                System.out.println(newString);
                long toCompare = Long.parseLong(newString);

                if (result < toCompare) {
                    result = toCompare;
                }
            } else {
                char temp = numberString.charAt(i);
                String newString = numberString.substring(0,i) + numberString.substring(i+1) + temp;
                numberString = newString;
                System.out.println(newString);
                long toCompare = Long.parseLong(newString);
                if (result < toCompare) {
                    result = toCompare;
                }


            }

        }
        return result;

    }
}
