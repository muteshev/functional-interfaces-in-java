package dev.muteshev.chapter10;

import java.util.Comparator;

import static dev.muteshev.chapter10.Sect1_Ex1.removeVowels;
public class Sect3_Ex4 
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Larry", 1000, 3.82);
        Student s2 = new Student("Libby", 1001, 3.76);
        
        Comparator<Student> byNameConsonants = 
            Comparator.comparing(  x -> x.name,
                                 (x,y) -> removeVowels(x).compareTo(
                                                          removeVowels(y)));

        System.out.println(byNameConsonants.compare(s1,s2));
    }
}