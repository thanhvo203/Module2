package lesson9.practise.simple_list;

import java.util.Arrays;

public class MyList<E>{
   private static final int DEFAULT_CAPACITY = 10;
   private int size =0;
   private Object[] element;

   public MyList(){
       element = new Object[DEFAULT_CAPACITY];
   }
   public void ensureCapa(){
       int newSize = element.length *2;
       element = Arrays.copyOf(element,newSize);
   }
   public void add(E e){
       if(size == element.length){
           ensureCapa();
       }
       element[size++] = e;
   }
   public E get(int i){
       if(i >= size || i <0){
           throw new IndexOutOfBoundsException("Index: "+ i + ", Size: " + i);
       }
       return (E) element[i];
   }
}
