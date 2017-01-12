package com.company.iterator;

import java.util.LinkedList;

/**
 * Created by volodyko on 09.05.16.
 */
public class Science implements Subject {
    private LinkedList<String> subjects;

    public Science() {
        subjects = new LinkedList<>();
        subjects.addLast("Math");
        subjects.addLast("Comp. Sci.");
        subjects.addLast("Physics");

    }

    @Override
    public Iterator createIterator() {
        return new ScienceIterator(subjects);
    }

    private class ScienceIterator implements Iterator {
        private final LinkedList<String> subjects;
        private int position;

        public ScienceIterator(LinkedList<String> subjects) {
            this.subjects = subjects;

            position = 0;
        }

        @Override
        public void first() {
            position = 0;
        }

        @Override
        public String next() {
            return subjects.get(position++);
        }

        @Override
        public boolean isDone() {
            return position >= subjects.size();
        }

        @Override
        public String currentItem() {
            return subjects.get(position);
        }
    }
}
