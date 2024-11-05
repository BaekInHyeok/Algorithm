package BaekJoon;
import java.util.*;

public class BaekJoon11650 {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int arraySize =scanner.nextInt();

        int[][] arr = new int[arraySize][2];

        for(int i=0;i<arraySize;i++){
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        scanner.close();


        //1st : y sort
        for(int i=0;i<arraySize-1;i++){
            for(int j=i+1;j<arraySize;j++){
                if(arr[i][1]>arr[j][1]){
                    int tmp1 = arr[i][0];
                    int tmp2 = arr[i][1];

                    arr[i][0]=arr[j][0];
                    arr[i][1]=arr[j][1];

                    arr[j][0]=tmp1;
                    arr[j][1]=tmp2;
                }
            }
        }

        //2nd : x sort
        for(int i=0;i<arraySize-1;i++){
            for(int j=i+1;j<arraySize;j++){
                if(arr[i][0]>arr[j][0]){
                    int tmp1 = arr[i][0];
                    int tmp2 = arr[i][1];

                    arr[i][0]=arr[j][0];
                    arr[i][1]=arr[j][1];

                    arr[j][0]=tmp1;
                    arr[j][1]=tmp2;
                }
            }
        }

        for(int i=0;i<arraySize;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }

    }
}
