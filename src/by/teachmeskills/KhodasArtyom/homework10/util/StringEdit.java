package by.teachmeskills.KhodasArtyom.homework10.util;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringEdit {


    public static String editTHeString(String string) {
        String newPhrase = string.trim();
        while (newPhrase.contains("  ")) {
            String newPhrase2 = string.replace("  ", " ");
            newPhrase = newPhrase2;
        }
        System.out.println(newPhrase);
        return newPhrase;
    }

    public static String getFormatNumberOfCreditCard(String cardNumber) {
        System.out.println("Номер карты: " + cardNumber);
        char[] elementsOfCardNumber = cardNumber.toCharArray();
        if (elementsOfCardNumber.length != 16) {
            throw new IllegalArgumentException("Неверный формат номера кредитной карты. Введте 16 цифр");
        }
        int i = 0;
        while (i < elementsOfCardNumber.length - 4) {
            elementsOfCardNumber[i] = '*';
            i++;

        }
        String formatString = String.valueOf(elementsOfCardNumber);
        System.out.println(formatString);
        String sub1 = formatString.substring(0, 4);
        String sub2 = formatString.substring(4, 8);
        String sub3 = formatString.substring(8, 12);
        String sub4 = formatString.substring(13, 16);
        String resultString = sub1 + sub2 + sub3 + sub4 + " ";
        System.out.println(sub1 + " " + sub2 + " " + sub3 + " " + sub4);


        return resultString;
    }

    public static void getInitials(String surName, String name, String surname2) {
        if (surName.length() == 0 || name.length() == 0) {
            throw new IllegalArgumentException("Инициалы не могут быть пустыми");
        }
        if (surname2.length() != 0) {
            System.out.println(surName + " " + name.charAt(0) + "." + surname2.charAt(0) + ".");
        } else {
            System.out.println(surName + " " + name.charAt(0) + ".");
        }
    }

    public static String getPhrase() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }

    public static boolean сheckPassportData(String passNumber) {
        boolean result = false;
        if (passNumber.length() == 9 && passNumber.charAt(0) >= 'A' && passNumber.charAt(0) <= 'Z' && passNumber.charAt(1) >= 'A' && passNumber.charAt(1) <= 'Z') {
            result = true;
        }
        char[] numbers = passNumber.toCharArray();
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] < '0' && numbers[i] > '9') {
                result = false;
            }
        }
        return result;

    }

    public static boolean isReliablePassword(String string) {
        int passwordLength = 8;
        int upCaseChars = 0;
        int lowCaseChars = 0;
        int digit = 0;

        int total = string.length();
        if (total < passwordLength) {
            throw new IllegalArgumentException("Пароль слишком короткий");
        } else {
            for (int i = 0; i < total; i++) {
                char ch = string.charAt(i);
                if (Character.isUpperCase(ch)) {
                    upCaseChars = 1;
                } else if (Character.isLowerCase(ch)) {
                    lowCaseChars = 1;
                } else if (Character.isDigit(ch)) {
                    digit = 1;

                }
            }
            if (upCaseChars == 1 & lowCaseChars == 1 && digit == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean isEmailCorrect(String string) {
        int countSpaceSymbol = 0;
        int countDogSymbol = 0;
        String stringWithoutSpace = string.trim();
        for (int i = 0; i < stringWithoutSpace.length(); i++) {
            boolean isSpaceSymbol = Character.isSpaceChar(stringWithoutSpace.charAt(i));
            if (isSpaceSymbol) {
                countSpaceSymbol++;
                if (countSpaceSymbol == 1) {
                    throw new IllegalArgumentException("Ошибка. Пробелы не должны фигуриовать в email адресе");
                }
                if (stringWithoutSpace.contains("@")) {
                    countDogSymbol++;
                    if (countDogSymbol > 1 || countDogSymbol == 0) {
                        throw new IllegalArgumentException("Ошибка.");
                    }
                }
            }
        }
        char[] emailSymbols = stringWithoutSpace.toCharArray();
        for (int i = 0; i < emailSymbols.length; i++) {

        }


        return true;
    }

}