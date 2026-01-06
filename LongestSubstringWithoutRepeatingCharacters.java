import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

  public static int lengthOfLongestSubstring(String s) {
    int left = 0;
    int maxLength = 0;

    Set<Character> window = new HashSet<>();

    for (int right=0; right<s.length(); right++) {
      char charAtual = s.charAt(right);

      while(window.contains(charAtual)) {
        window.remove(s.charAt(left));
        left++;
      }

      window.add(charAtual);

      maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
  }

  public static void main(String[] args) {
    String s = "dvdf";

    System.out.println(lengthOfLongestSubstring(s));
  }
}