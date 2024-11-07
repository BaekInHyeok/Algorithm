package Programmers;

public class Programmers87389 {
	public int solution(int n) {
        int answer = 1;
        while(n%answer!=1){
            answer++;
        }
        
        return answer;
    }
}
