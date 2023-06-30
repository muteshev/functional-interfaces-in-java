package dev.muteshev.chapter12;

import java.util.stream.Stream;

import static dev.muteshev.chapter10.Sect1_Ex1.removeVowels;
public class Sect6_Ex1 
{
    public static void main(String[] args)
    {
        Stream.of("Kyle", "Jaquiline", "Jimmy")
              .min( (x,y) ->                              // Stream<String>
                removeVowels(x).compareTo(removeVowels(y)))
              .ifPresent(x -> System.out.println(x));     // Optional<String>
    }
}