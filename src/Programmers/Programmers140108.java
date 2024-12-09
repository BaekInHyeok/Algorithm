package Programmers;

public class Programmers140108 {
	public int solution(String s) {
        int answer = 1;
        char ch=s.charAt(0);
        int count=1;
        
        for(int i=1;i<s.length();i++){
            if(count==0){
                answer++;
                ch=s.charAt(i);
            }
            
            if(ch==s.charAt(i)){
                count++;
            }else{
                count--;
            }
        }
        return answer;
    }
}
