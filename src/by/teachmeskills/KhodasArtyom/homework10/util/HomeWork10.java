package by.teachmeskills.KhodasArtyom.homework10.util;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбер задачу из списка, чтобы посомтреть ее реализацю или нажмите 0, чтобы выйти");
        System.out.print("Task1\n" +
                "Task2\n" +
                "Task3\n" +
                "Task4\n" +
                "Task5\n" + "\n");
        while (scanner.hasNextInt()) {
            int chooseButton = scanner.nextInt();
            switch (chooseButton) {
                case 1 -> {
                    System.out.println("Введите фразу:");
                    String formatString = StringEdit.editTHeString(StringEdit.getPhrase());
                }

                case 2 -> {
                    System.out.println("Введите номер кредитной карты");
                    String formatCardNumber = StringEdit.getFormatNumberOfCreditCard(StringEdit.getPhrase());
                }
                case 3 -> {
                    System.out.println("Введите свои инициалы");
                    StringEdit.getInitials(StringEdit.getPhrase(), StringEdit.getPhrase(), StringEdit.getPhrase());
                }
                case 4 -> {
                    System.out.println("Введите номер паспорта: ");
                    boolean result = StringEdit.сheckPassportData(StringEdit.getPhrase());
                    System.out.println(result);
                }
                case 5 -> {
                    System.out.println("Введите пароль: ");
                    boolean result2 = StringEdit.isReliablePassword(StringEdit.getPhrase());
                    System.out.println(result2);

                }
                case 6 -> {
                    System.out.println("Введите электронный адрес для проверки");
                    boolean result = StringEdit.isEmailCorrect(StringEdit.getPhrase());
                }
                case 0 -> {
                    System.out.println("Спасибо, что воспользовалсь программой. До свидания");
                    return;
                }
            }
        }
    }
}