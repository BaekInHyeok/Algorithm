package BaekJoon;
import java.io.*;

public class BaekJoon11279 {

	static int[] heap = new int[100001];//힙 배열
    static int size = 0;

    //삽입 메서드
    public static void insert(int x){
        heap[++size] =x;
        int i=size;

        //부모와 비교해서 더 크면 교환
        while(i>1 && heap[i]>heap[i/2]){
            int temp= heap[i];
            heap[i]=heap[i/2];
            heap[i/2]=temp;
            i/=2;
        }

    }

    //삭제(최대값 반환) 메서드
    public static int delete(){
        if(size == 0) return 0;//힙이 비어있으면 0 반환

        int max= heap[1];//최대값 저장
        heap[1] = heap[size--];//마지막 값을 루트로 이동하고 크기 줄이기
        int i=1;

        // 자신보다 값이 크면 
        while(i*2<=size){
            int child = i*2;
            if(child+1<=size && heap[child+1]>heap[child]){
                child++;
            }

            if(heap[i]>=heap[child]) break;

            int temp= heap[i];
            heap[i]=heap[child];
            heap[child] = temp;
            i=child;
        }
        return max;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i<n;i++){
            int x = Integer.parseInt(br.readLine());
            if(x==0){
                System.out.println(delete());
            }else{
                insert(x);
            }
        }
    }
}
