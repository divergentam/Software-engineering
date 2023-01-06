package uusi.vezbe_02.zad_05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Zad_05 {
    public static void main(String[] args) throws FileNotFoundException {
        String s = "Ana voli Milovana             ";

        if( isPalindrome(s))
            System.out.println("Sentence is palindrome");
        else
            System.out.println("Sentence is not palindrome");
        }


    private static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length() - 1;

        while (l <= r) {
            char getAtL = s.charAt(l);
            char getAtR = s.charAt(r);

            //ako je drugi simbol na levoj strani ignosrisi ga
            if (getAtL == ' ')
                l++;
                // ako je drugi simbol na desnoj strani ignostisi ga
            else if (getAtR == ' ')
                r--;
                // ako su kar jednaki
            else if (getAtL == getAtR) {
                l++;
                r--;
            } else
                return false;
        }
        return true;
    }
}


