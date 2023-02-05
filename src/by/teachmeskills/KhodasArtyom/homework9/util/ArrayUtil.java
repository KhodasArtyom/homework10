package by.teachmeskills.KhodasArtyom.homework9.util;

import java.util.Scanner;

public class ArrayUtil {
    public static char[] getCharArray() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] array = str.toCharArray();

        return array;
    }
}


