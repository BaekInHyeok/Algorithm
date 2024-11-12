package Programmers;

public class Programmers12932 {
	public int[] solution(long n) {
        String s = String.valueOf(n);
        
        int[] answer = new int[s.length()];
        
        for(int i=0;i<answer.length;i++){
            String keyword = s.substring(answer.length-1-i,answer.length-i);
            answer[i] = Integer.parseInt(keyword);
        }
        return answer;
    }
}
