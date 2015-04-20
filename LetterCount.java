import java.util.Map;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class LetterCount
{
 private Map<Character,Integer> map;
 private Set<Character> keySet;
 private int lengthOfString = 0;
 private int frequencyOfLetter = 1;

 LetterCount()
 {
 map = new HashMap<Character,Integer>();
 keySet = new TreeSet<Character>();
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
 keySet = map.keySet();
 Iterator<Character> treeSetIterator = keySet.iterator();
 List<Character> keyList = new ArrayList<Character>();
 while(treeSetIterator.hasNext())
  {
  keyList.add(treeSetIterator.next());
  }
 Collections.sort(keyList);
 System.out.println("\nCharacter \tFrequency");
 System.out.println("---------------------------------------");
 for(int index = keyList.size()-1; index >= 0 ; index--)
  {
  Character ch1 = keyList.get(index);
  System.out.println(ch1 + " \t\t" + map.get(ch1));
  }
 }
}