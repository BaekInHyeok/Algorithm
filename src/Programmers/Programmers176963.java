package Programmers;
import java.util.*;
public class Programmers176963 {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String,Integer> point = new HashMap<>();
        
        for(int i=0;i<name.length;i++){
            point.put(name[i],yearning[i]);
        }
        
        for(int i=0;i<photo.length;i++){
            String[] person = photo[i];
            int score=0;
            
            for(int j=0;j<person.length;j++){
                String pName=person[j];
                if(point.containsKey(pName)){
                    score+=point.get(pName);
                }
            }
            answer[i]=score;
        }
        return answer;
    }
}
