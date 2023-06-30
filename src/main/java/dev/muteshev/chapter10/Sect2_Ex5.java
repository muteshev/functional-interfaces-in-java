package dev.muteshev.chapter10;

import java.util.Comparator;

import static dev.muteshev.chapter10.Sect1_Ex1.removeVowels;
public class Sect2_Ex5 
{
    public static void main(String[] args)
    {
        Comparator<String> byConsonants = (x,y) -> 
                  removeVowels(x).compareTo(removeVowels(y));
        
        System.out.println(byConsonants.reversed()
                                       .compare("Larry", "Libby"));
    }
}
