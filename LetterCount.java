import java.util.Map;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Comparator;

public class LetterCount
{
 private Map<Character,Integer> map;
 private int lengthOfString = 0;
 private int frequencyOfLetter = 1;

 LetterCount()
 {
 map = new HashMap<Character,Integer>();
 }

 public void printLettersFrequency(String testString)
 {
 lengthOfString = testString.length();
 char ch = '\0';
 for(int index = 0; index<lengthOfString; index++)
  {
  ch = testString.charAt(index);
  if(map.get(ch) != null)
   {
   frequencyOfLetter = map.get(ch) + 1;
   }
   map.put(ch,frequencyOfLetter);
   frequencyOfLetter = 1;
  }
 System.out.println(map);
 System.out.println(entriesSortedByValues());
 }
 List<Entry<Character, Integer>> entriesSortedByValues() {

    List<Entry<Character,Integer>> sortedEntries = new ArrayList<Entry<Character,Integer>>(map.entrySet());

    Collections.sort(sortedEntries, 
            new Comparator<Entry<Character,Integer>>() {
                @Override
                public int compare(Entry<Character,Integer> value1, Entry<Character,Integer> value2) {
                    return value2.getValue().compareTo(value1.getValue());
                }
            }
    );

    return sortedEntries;
}
}