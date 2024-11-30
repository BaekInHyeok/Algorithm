package Programmers;

public class Programmers132267 {
	public int solution(int a, int b, int n) {
		int answer = 0;

		while (n >= a) {// 빈 병이 a개 이상인 동안
			answer += (n / a) * b;// 새 콜라병 받기
			n = (n / a) * b + (n % a);// 절차를 1회 수행했을 때 남는 콜라병
		}
		return answer;
	}
}
