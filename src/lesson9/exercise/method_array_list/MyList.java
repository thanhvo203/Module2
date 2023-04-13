package lesson9.exercise.method_array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, int element) {
        for (int i = size; i >= index; i--) {
            elements[i] = elements[i + 1];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        E element = (E) elements[index];
        for (int i = index; i <= size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    public int size() {
        return this.size;
    }

    public E clone() {
        MyList<E> clone = new MyList<>(elements.length);
        for (Object x : elements) {
            clone.add((E) x);
        }
        return (E) clone;
    }

    public boolean contains(E o) {
        for (Object x : elements) {
            if (o.equals(x)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
      for(Object a : elements){
          if (o == a){
              return 1;
          }
      }
      return -1;
    }
    public boolean add(E o) {
        ensureCapacity(size+1);
        elements[size++] = o;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
       int oldCapacity = elements.length;
       int newCapacity = oldCapacity *2;
       if(newCapacity - minCapacity < 0){
           newCapacity = minCapacity;
       }
       elements = Arrays.copyOf(elements,newCapacity);

    }

    public E get(int i) {
        return (E) elements[i];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];

    }


}
