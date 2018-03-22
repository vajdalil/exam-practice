import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacter {

  public static void main(String[] args) {


    System.out.println(uniuqeCharacters("anagram"));
  }

  private static List<Character> uniuqeCharacters(String word) {
    Map <Character, Integer> charcterFrequencyMap = new HashMap<>();
    List <Character> uniqueChars = new ArrayList<>();
    for (int i = 0; i < word.length(); i++) {
      char x = word.charAt(i);
      uniqueChars.add(x);
      Integer frequency = charcterFrequencyMap.get(x);
      if (frequency != null) {
        charcterFrequencyMap.put(x, frequency +1);
      } else {
        charcterFrequencyMap.put(x,1);
      }
    }
    for (int i = 0; i < uniqueChars.size(); i++) {
      if (charcterFrequencyMap.get(uniqueChars.get(i)) != 1) {
        uniqueChars.remove(i);
      }
    }
    return uniqueChars;
  }
}
