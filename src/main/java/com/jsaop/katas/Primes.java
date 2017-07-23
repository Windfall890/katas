package com.jsaop.katas;

import java.util.ArrayList;
import java.util.List;

public class Primes {
    public static List<Integer> of(int n) {
        List<Integer> list = new ArrayList<>();

        for(int divisor =2; n > 1; divisor ++)
            for (;n % divisor == 0; n /= divisor)
                list.add(divisor);

        return list;
    }
}

