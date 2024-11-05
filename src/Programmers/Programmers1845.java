package Programmers;
import java.util.*;
class Programmers1845 {
	public int solution(int[] nums) {
        //해시셋
        HashSet<Integer> list = new HashSet<>();
        
        //해시셋으로 중복 폰켓몬을 제외할 수 있음
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        
        //해시셋의 크기가 N/2보다 크면 전체 중 절반이 가장 많은 종류 번호임
        if(list.size()>=nums.length/2){
            return nums.length/2;
        }
        //해시셋의 크기가 N/2보다 작으면 해시셋의 크기가 고를 수 있는 가장 많은 종류 번호임
        else{
            return list.size();
        }
    }
}
