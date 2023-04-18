package lesson12.practise;

public class BinarySearch {
    static int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] arr, int value){
        int low = 0;
        int high = arr.length -1;
        while (high >= low){
            int mid = (low + high)/2;
            if(value < arr[mid]){
                high = mid -1;
            }else if(value > arr[mid]){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(array,10));
        System.out.println(binarySearch(array, 2));
        System.out.println(binarySearch(array, 11));
        System.out.println(binarySearch(array, 79));
        System.out.println(binarySearch(array, 1));
        System.out.println(binarySearch(array, 5));
        System.out.println(binarySearch(array, 80));
    }
}
