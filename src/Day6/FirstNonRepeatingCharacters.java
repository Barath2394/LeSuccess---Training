package Day6;

import java.util.*;
import java.util.Scanner;
public class FirstNonRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(indexOfFirstUniqueCharacter(str));
    }
    static int indexOfFirstUniqueCharacter(String str) {
        Map<Character , Integer> mpp = new HashMap<>();
        for (char c : str.toCharArray()) {
            mpp.put(c , mpp.getOrDefault(c,0)+1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (mpp.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
