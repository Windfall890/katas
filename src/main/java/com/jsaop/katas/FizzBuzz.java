package com.jsaop.katas;

public class FizzBuzz {

    public static String buzzFizz(int limit) {
        StringBuilder sb = new StringBuilder();

        for (int current = 1; limit >= current; current++) {
            if (isDivis(current, 3) || isDivis(current, 5) || isDivis(current, 7)) {
                sb.append(handle("fizz", 3, current));
                sb.append(handle("buzz", 5, current));
                sb.append(handle("pop", 7, current));
            } else
                sb.append(current);

            sb.append('\n');
        }

        return sb.toString();
    }

    private static String handle(String s, int divisor, int current) {
        if (isDivis(current, divisor))
            return s;
        return "";
    }

    private static boolean isDivis(int current, int divisor) {
        return current % divisor == 0;
    }
}
