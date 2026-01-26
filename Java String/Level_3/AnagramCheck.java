package Java_String.Level_3;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    public static boolean isAnagram1(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static boolean isAnagram2(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] count = new int[256]; // ASCII chars
        for (char c : s1.toCharArray()) count[c]++;
        for (char c : s2.toCharArray()) count[c]--;
        for (int val : count) if (val != 0) return false;
        return true;
    }

    public static boolean isAnagram3(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] arr2 = s2.toCharArray();
        for (char c : s1.toCharArray()) {
            boolean found = false;
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] == c) {
                    arr2[i] = '\0';
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        System.out.println("Logic 1: " + isAnagram1(s1, s2));
        System.out.println("Logic 2: " + isAnagram2(s1, s2));
        System.out.println("Logic 3: " + isAnagram3(s1, s2));
    }
}
