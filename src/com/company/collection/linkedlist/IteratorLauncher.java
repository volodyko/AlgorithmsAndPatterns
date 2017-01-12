package com.company.collection.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by volodyko on 10.01.17.
 */
public class IteratorLauncher {
    public static void main(String[] args) throws IOException {
        LinkList<Long> longLinkList = new LinkList<>();
        ListIterator<Long> iterator = longLinkList.getIterator();
        long value;

        iterator.insertAfter(20L);
        iterator.insertAfter(40L);
        iterator.insertAfter(60L);
        iterator.insertAfter(80L);

        while (true) {
            System.out.print("Enter first letter of show, reset, ");
            System.out.print("next, get, before, after, delete: ");
            System.out.flush();
            int choise = getChar();
            switch (choise) {
                // Вывод списка
                case 's':
                    if (!longLinkList.isEmpty())
                        longLinkList.display();
                    else
                        System.out.println("List is empty");
                    break;
                case 'r':
                    // Возврат к первому элементу
                    iterator.reset();
                    break;
                case 'n':
                    // Переход к следующему элементу
                    if (!longLinkList.isEmpty() && !iterator.atEnd())
                        iterator.nextLink();
                    else
                        System.out.println("Can’t go to next link");
                    break;
                case 'g':// Получение текущего элемента
                    if (!longLinkList.isEmpty()) {
                        value = iterator.getCurrent().data;
                        System.out.println("Returned " + value);
                    } else
                        System.out.println("List is empty");
                    break;
                case 'b':
                    // Вставка перед текущим элементом
                    System.out.print("Enter value to insert: ");
                    System.out.flush();
                    value = getInt();
                    iterator.insertBefore(value);
                    break;
                case 'a':
                    // Вставка после текущего элемента
                    System.out.print("Enter value to insert: ");
                    System.out.flush();
                    value = getInt();
                    iterator.insertAfter(value);
                    break;
                case 'd':
                    // Удаление текущего элемента
                    if (!longLinkList.isEmpty()) {
                        value = iterator.deleteCurrent();
                        System.out.println("Deleted " + value);
                    } else
                        System.out.println("Can’t delete");
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }


    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
