package lesson9.exercise.method_array_list;


import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> arrayList = new MyList<Integer>();
        System.out.println("--------ADD");
        arrayList.add(0,1);
        arrayList.add(1,2);
        arrayList.add(2,4);
        arrayList.add(3,3);

        System.out.println("--------GET");
        System.out.print(arrayList.get(0) + " ");
        System.out.print(arrayList.get(1)+ " ");
        System.out.print(arrayList.get(2)+ " ");
        System.out.println(arrayList.get(3));

        System.out.println("-------- INDEX:");
        System.out.println(arrayList.indexOf(7));

        System.out.println("--------REMOVE");
        arrayList.remove(2);
        System.out.print(arrayList.get(0) + " ");
        System.out.print(arrayList.get(1)+ " ");
        System.out.print(arrayList.get(2)+ " ");
        System.out.println(arrayList.get(3));

        System.out.println("--------CONTAINS");
        if(arrayList.contains(3)== true){
            System.out.println("A");
        }else {
            System.out.println("B");
        }
        System.out.println("---------SIZE:");
        System.out.println(arrayList.size());

        System.out.println("----------CLEAR");
        arrayList.clear();
        System.out.print(arrayList.get(0) + " ");
        System.out.print(arrayList.get(1)+ " ");
        System.out.print(arrayList.get(2)+ " ");
        System.out.println(arrayList.get(3));

        System.out.println("--------ClONE");
        Integer arrNew = arrayList.clone();
        System.out.println(Arrays.toString(new Integer[]{arrNew}));

    }

}