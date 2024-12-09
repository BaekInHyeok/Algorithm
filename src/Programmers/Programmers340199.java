package Programmers;

public class Programmers340199 {
	public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while(true){
            int wallet_min=Math.min(wallet[0],wallet[1]);
            int wallet_max=Math.max(wallet[0],wallet[1]);
            int bill_min=Math.min(bill[0],bill[1]);
            int bill_max=Math.max(bill[0],bill[1]);
            
            if(bill_min>wallet_min || bill_max>wallet_max){
                if(bill[0]>bill[1]){
                    bill[0]=bill[0]/2;
                }else{
                    bill[1]=bill[1]/2;
                }
                
                answer++;
            }else{
                break;
            }
        }
        return answer;
    }
}
