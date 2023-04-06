package lesson3.practise;


public class FindMin {
    public static int finMind(int []array){
        int index = array[0];
        for (int i = 0; i < array.length; i++) {
            if(index > array[i]){
                index = array[i];
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 2, 6, 9};

        int index = finMind(arr);
        System.out.println("The smallest element in array : " +  index);
    }
}
