package BaekJoon;

import java.util.*;

public class BaekJoon2750 {

	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        int[] arr = new int[arraySize];

        for(int i=0;i<arraySize;i++){
            arr[i]=scanner.nextInt();
        }

        scanner.close();

        for(int i=0;i<arraySize-1;i++){
            for(int j=i+1;j<arraySize;j++){
                if(arr[i]>arr[j]){
                    int tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }

        }

        for(int i=0;i<arraySize;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
