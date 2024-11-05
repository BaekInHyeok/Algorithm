package Programmers;
import java.util.*;
class Programmers42889 {
	 public int[] solution(int N, int[] stages) {
	        //각 스테이지별 도달한 사용자 수 저장 배열
	        int[] currentStages = new int[N+1];
	        
	        //각 스테이지별 붙잡혀있는 사용자 수 저장 배열
	        int[] clearStages = new int[N+1];
	        
	        //각 스테이지별 도달한 사용자의 수 구하기
	        for(int i = 0;i<stages.length;i++){
	            for(int j=0;j<stages[i];j++){
	                clearStages[j]+=1;
	            }
	            currentStages[stages[i]-1]+=1;
	        }
	        
	        //각 스테이지 번호 + 스테이지별 실패율을 묶어서 저장하기 위한 HashMap
	        Map<Integer, Double> map = new HashMap<>();
	        for(int i=0;i<N;i++){
	            if(currentStages[i] == 0 || clearStages[i]==0){
	                map.put(i+1, 0.0);
	            }else{
	                map.put(i+1, (double)currentStages[i]/(double)clearStages[i]);
	            }
	        }
	        
	        List<Integer> list = new ArrayList<>(map.keySet());
	        
	        list.sort((o1,o2)-> Double.compare(map.get(o2), map.get(o1)));
	        
	        return list.stream().mapToInt(i->i).toArray();
	    }
}
