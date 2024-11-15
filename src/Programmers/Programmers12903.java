package Programmers;

public class Programmers12903 {
	public String solution(String s) {
        int length = s.length();
        String answer = "";
        
        if(length%2==0){
            answer=s.substring(length/2-1,length/2+1);
        }else{
            answer=s.substring(length/2,length/2+1);
        }
        return answer;
    }
}
