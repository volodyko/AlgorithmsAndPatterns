package com.company.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by volodyko on 06.01.17.
 */
public class ADTStack {

    private int maxSize;
    private char[] array;
    private int top;

    public ADTStack(int maxSize) {
        this.maxSize = maxSize;
        array = new char[maxSize];
        top = -1;
    }

    public void push(char s) {
        array[++top] = s;
    }

    public char pop() {
        return array[top--];
    }

    public char peek() {
        return array[top];
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static class Launcher {


        public static void main(String[] args) throws IOException {
            String input, output;
            while (true) {
                System.out.println("Enter:");
                System.out.flush();
                input = getString();
                if (input.isEmpty()) {
                    break;
                }

                Revercer revercer = new Revercer(input);
                revercer.doRev();

            }
        }

        public static String getString() throws IOException {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            return s;
        }
    }

    public static class Revercer {
        private String input;
        private String output;

        public Revercer(String input) {
            this.input = input;
        }

        public void doRev() {
            int stakSize = input.length();
            ADTStack stack = new ADTStack(stakSize);
            for (int i = 0; i < stakSize; i++) {
                char ch = input.charAt(i);
                switch (ch) {
                    case '{':
                    case '[':
                    case '(':
                        stack.push(ch);
                        break;

                    case '}':
                    case ']':
                    case ')':
                        if (!stack.isEmpty()) {
                            char chx = stack.pop();
                            if ((ch == '}' && chx != '{') ||
                                    (ch == ']' && chx != '[') ||
                                    (ch == ')' && chx != '(')) {
                                System.out.println("Error: " + ch + " at " + i);
                            }
                        } else {
                            System.out.println("Error: " + ch + " at " + i);
                        }
                        break;
                }
            }
            if (!stack.isEmpty())
                System.out.println("Error: missing right delimiter");

        }
    }
}
