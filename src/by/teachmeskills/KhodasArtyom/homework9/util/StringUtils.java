package by.teachmeskills.KhodasArtyom.homework9.util;

import java.util.Arrays;

import static java.lang.Character.isWhitespace;

public class StringUtils {
    public static void main(String[] args) {
        char[] array = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] array2 = new char[]{'h', 'e', 'p'};
        char[] array3 = new char[]{'1', '4', '6'};
//        boolean isEmpty = isBlank(array);
//        System.out.println(isEmpty);
        boolean isSubArray = contains(array, array2);
        System.out.println(isSubArray);
        int number = parsInt(array3);
        System.out.println(number);


    }

    public static void print(char[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void println(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("\\n");
        System.out.println();
    }

    public static boolean isBlank(char[] array) {

        for (int i = 0; i < array.length; i++) {
            if (!Character.isWhitespace(array[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRussian(char[] chars) {

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < 'А' || chars[i] > 'я' && chars[i] != 'Ё' && chars[i] != 'ё') {
                return false;
            }
        }
        return true;
    }

    public static boolean contains(char[] array, char[] subArray) {
        if (array.length == 0 || subArray.length == 0 || subArray.length > array.length) {
            throw new IllegalArgumentException("Неверно заданные параметры");
        }

        int arrayLength, subArrayLength, counterOfElements = 0;

        arrayLength = array.length;
        subArrayLength = subArray.length;

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == subArray[counterOfElements]) {
                counterOfElements++;
            } else {
                counterOfElements = 0;
            }
            if (counterOfElements == subArrayLength) {
                return true;
            }
        }
        return false;
    }

    public static int parsInt(char[] number) {
        int sum = 0;

        int zeroASCII = (int) '0';//48
        for (int i = 0; i < number.length; i++) {
            if (number[i] < (int) '0' || number[i] > (int) '9') {
                throw new IllegalArgumentException("Неверно введенные символы");
            }
            int tmpAscii = (int) number[i];
            sum = (sum * 10) + (tmpAscii - zeroASCII);
        }
        return sum;
    }


}





