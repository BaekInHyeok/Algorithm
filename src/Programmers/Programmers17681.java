package Programmers;

public class Programmers17681 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String tmp;
        
        for(int i=0;i<n;i++){
            tmp=String.format("%16s",Integer.toBinaryString(arr1[i]|arr2[i]));
            tmp=tmp.substring(tmp.length()-n);
            tmp=tmp.replaceAll("1","#");
            tmp=tmp.replaceAll("0"," ");
            answer[i]=tmp;
        }
        
        return answer;
    }
}
