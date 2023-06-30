package dev.muteshev.chapter10;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import static dev.muteshev.chapter10.Sect1_Ex1.removeVowels;
public class Sect9_Ex3 
{
    public static void main(String[] args)
    {
        Comparator<String> byConsonants = (x,y) ->
                removeVowels(x).compareTo(removeVowels(y));

        TreeMap<String,String> pets = new TreeMap<>(byConsonants);

        pets.put("gerbil", "small cute rodents");
        pets.put("guinea pig", "rodents, not pigs");
        pets.put("cat", "have nine lives");
        pets.put("chicken", "more populous than people");   

        Map.Entry<String,String> cat = pets.ceilingEntry("cat");
        Map.Entry<String,String> chicken = pets.ceilingEntry("chicken");
        
        Comparator<Map.Entry<String,String>> cmapCons =
              Map.Entry.comparingByKey(byConsonants);
    
        System.out.println(cmapCons.compare(cat, chicken));
    }
}
