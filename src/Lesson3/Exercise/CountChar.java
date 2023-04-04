package Lesson3.Exercise;

public class CountChar {
    public static void main(String[] args) {
        String s = "ASLAVQBVIQBIJQSVJBK";
        char c = 'A';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c){
                count++;
            }
        }
        System.out.println("The total number of times the character appears in the string is:"+ count);
    }
}
