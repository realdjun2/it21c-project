import java.util.Arrays;

public class ArraySort{
    public static void main(String[]args){
        int[] array = {9,7,8,15,3,2};
        
        Arrays.sort(array);
        System.out.println("Sorted Array");
        for(int value: array){
            System.out.println(value+"");
        }
      }
 }
