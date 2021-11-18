package trienkhai_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        Object[] newArr = new Object[newSize];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        elements = newArr;
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size] = e;
        size++;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

    public void get(int i) {
        if (i >= 0 && i < size){
            System.out.println(elements[i]);
        }
    }
}
