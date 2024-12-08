package Programmers;

public class Programmers161989 {
	public int solution(int n, int m, int[] section) {
        int roller = section[0];
        int count = 1;
        for(int i=1;i<section.length;i++){
            if(roller+m-1<section[i]){
                count++;
                roller=section[i];
            }
        }
        
        return count;
    }
}
