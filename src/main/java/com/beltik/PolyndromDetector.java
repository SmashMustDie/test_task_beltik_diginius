package com.beltik;

public class PolyndromDetector {
    
    public static boolean isPalindrom(String input) {
        input.trim();
        String stringToCheck;
        stringToCheck = input.toLowerCase();
        stringToCheck = stringToCheck.replaceAll("\\s", "");
        int firstChar = 0;
        int lastChar = stringToCheck.length() - 1;
        while (lastChar >= firstChar) {
            if (stringToCheck.charAt(firstChar) != stringToCheck.charAt(lastChar)) {
                return false;
            }
            firstChar++;
            lastChar--;
        }
        return true;
    }
}
