package halmaz;

import java.util.ArrayList;
import java.util.List;

public class Set<T> { //Halmaz
    private List<T> elements;

    public Set() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        if (!this.elements.contains(element)) {
            this.elements.add(element);
        }
    }

    public boolean remove(T element) {
        return this.elements.remove(element);
    }

    public int getSize() {
        return elements.size();
    }

    public void clear() {
        elements.clear();
    }

    public boolean isElement(T element) {
        int i = 0;
        while (i < elements.size() && elements.get(i) != element) {
            i++;
        }
        return i < this.elements.size();
    }

    public boolean isEmpty() {
        return elements.size() == 0;
    }

    public boolean isPartOf(Set<T> otherSet) {
        boolean isBigger = this.getSize() > otherSet.getSize();
        boolean isPartOf = false;

        if (!isBigger) {
            int i = 0;
            while (i < this.getSize() && otherSet.isElement(elements.get(i))) {
                i++;
            }
            isPartOf = i == getSize();
        }

        return isPartOf;
    }

    public boolean isEquals(Set<T> otherSet) {
        return getSize() == otherSet.getSize() && isPartOf(otherSet);
    }

    public Set<T> unio(Set<T> otherSet) {
        Set<T> unioSet = new Set<>();
        for (T element : otherSet.elements) {
            unioSet.add(element);
        }
        for (T element : elements) {
            unioSet.add(element);
        }
        return unioSet;
    }

    public Set<T> intersect(Set<T> otherSet) {
        Set<T> intersectSet = new Set<>();

        for (T element : elements) {
            if (otherSet.isElement(element)) {
                intersectSet.add(element);
            }
        }

        return intersectSet;
    }

    public Set<T> different(Set<T> otherSet) {
        Set<T> differentSet = new Set<>();
        for (T element : elements) {
            differentSet.add(element);
        }

        for (T element : otherSet.elements) {
            differentSet.remove(element);
        }

        return differentSet;
    }

    @Override
    public String toString() {
        String s = "";

        for (T element : elements) {
            s += element + "\n";
        }

        return s;
    }
}
