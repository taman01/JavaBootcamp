package org.example.lesson11;

import java.util.Scanner;

public class ExampleMap {

    private static void printMenu() {
        System.out.println("""
							0 - add entry
							1 - find entry
							2 - print
							3 - exit
				""");
    }

    public static void main(String ... args) {
        Scanner scanner = new Scanner(System.in);

        // �������� ������, ���� � �������� - String

        while (true) {
            printMenu();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 0: {
                    System.out.println("Enter name");
                    var key = scanner.nextLine();

                    System.out.println("Enter value");
                    var value = scanner.nextLine();

                    // ��� ����� - �������� ��� ���� � ������
                    break;
                }
                case 1: {
                    System.out.println("Enter name");
                    var key = scanner.nextLine();
                    // ��� ����� - ���� ���� ����, �������� ��������. ���� ��� - �������� ��������� �� ����������
                    break;
                }
                case 2:
					/* ��� ����� - ������������ �������, ���������� "�������" - ����� � � ������ ������ �� ����� ����
					   ������������\t�������
					   Petr\t12-456-789
					   Vasya\t789-45-12
					 */
                    break;
                case 3:
                    return;
            }
        }
    }
}



