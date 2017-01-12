package com.company.iterator;

/**
 * Created by volodyko on 09.05.16.
 */
public class Arts implements Subject {
    String[] subjects;

    public Arts() {
        subjects = new String[2];
        subjects[0] = "Bengali";
        subjects[1] = "English";
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(subjects);
    }

    private class ArtsIterator implements Iterator {
        private final String[] subjects;
        private int position;

        public ArtsIterator(String[] subjects) {
            this.subjects = subjects;
            position = 0;
        }

        @Override
        public void first() {
            position = 0;
        }

        @Override
        public String next() {
            return subjects[position++];
        }

        @Override
        public boolean isDone() {
            return position >= subjects.length;
        }

        @Override
        public String currentItem() {
            return subjects[position];
        }
    }
}
