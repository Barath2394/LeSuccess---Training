package Day6;

import java.util.Scanner;

public class isRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(checkRotation(str1,str2));
    }
    static boolean checkRotation(String str1,String str2) {
        str1 = str1 + str2;
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                if (str1.substring(i,i+str2.length()).equals(str2)) return true;
            }
        }
        return false;
    }
}
