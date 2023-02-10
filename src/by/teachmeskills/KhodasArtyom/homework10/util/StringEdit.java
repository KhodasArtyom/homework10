package by.teachmeskills.KhodasArtyom.homework10.util;

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
        final int CARD_LENGTH = 4 * 4;
        final int LAST4NUMBERS = 4;
        System.out.println("Номер карты: " + cardNumber);

        if (cardNumber.length() != CARD_LENGTH) {
            throw new IllegalArgumentException("Неверный формат номера кредитной карты. Введте 16 цифр");
        } else {
            return "**** **** **** " + cardNumber.substring(CARD_LENGTH - LAST4NUMBERS);


        }

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
        final int PASSPORT_DIGIT_LENGTH = 7;
        final int PASSPORT_SERIES_LENGTH = 2;
        final int PASSPORT_FULL_NUMBER = PASSPORT_SERIES_LENGTH + PASSPORT_DIGIT_LENGTH;

        if (passNumber.length() != PASSPORT_FULL_NUMBER) {
            return false;
        }
        for (int i = 0; i < PASSPORT_SERIES_LENGTH; i++) {
            if (!StringEdit.isUpperCaseChar(passNumber.charAt(i))) {
                return false;
            }
        }
        for (int i = PASSPORT_SERIES_LENGTH; i < PASSPORT_FULL_NUMBER; i++) {
            if (!StringEdit.isDigit(passNumber.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public static boolean isReliablePassword(String string) {
        final int PASSWORD_LENGTH = 8;
        boolean upCaseChars = false;
        boolean lowCaseChars = false;
        boolean digit = false;

        int total = string.length();
        if (total < PASSWORD_LENGTH) {
            System.out.println("Пароль слишком короткий");
            return false;
        } else {
            for (int i = 0; i < total; i++) {
                char ch = string.charAt(i);
                if (!upCaseChars && Character.isUpperCase(ch)) {
                    upCaseChars = true;
                } else if (!lowCaseChars && Character.isLowerCase(ch)) {
                    lowCaseChars = true;
                } else if (!digit && Character.isDigit(ch)) {
                    digit = true;

                }
            }
            if (upCaseChars & lowCaseChars && digit) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean isEmailCorrect(String string) {
        if (string.contains(" ")) {
            return false;
        }
        int indexAtString= string.indexOf("@");
        boolean isSingle = indexAtString != -1 && indexAtString==string.lastIndexOf("@");
        if(!isSingle) {
            return false;
        }
        boolean isCharsAround = indexAtString !=0 && indexAtString!=string.length()-1;
        return isCharsAround;

    }

    public static boolean isUpperCaseChar(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    public static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

}