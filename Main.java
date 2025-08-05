import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 10 values");
        int arr[] = new int[10];
        for(int i = 0; i<10; i++){
            arr[i] = sc.nextInt();
        }
        //selection sort
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    int min = arr[i];
                    arr[i] = arr[j];
                    arr[j] = min;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}