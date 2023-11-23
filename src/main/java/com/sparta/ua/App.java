package com.sparta.ua;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        List<String> names = new ArrayList<>();
        names.add("harrys");
        names.add("harrys");
        names.add("harrys");
        names.add("penelopy");
        names.add("charizard");
        names.add("incrediblehulk");
        names.add("barrys");
        names.add("dinosour");
        names.add("chickenwing");

        List<Integer> nums = new ArrayList<>();

        System.out.println(squareThenMax(1, 100));

        System.out.println(lengthNoDups(names));
    }

    public static List lengthNoDups(List<String> names){
        return names.stream()
                .filter(name -> name.length() == 6)
                .distinct()
                .collect(Collectors.toList());
    }

    public static int squareThenMax(int min, int max) {
        return IntStream.rangeClosed(min, max)
                .map(number -> number * number)
                .filter(number -> number < 100)
                .max()
                .getAsInt();
    }
}
