package Programmers;

public class Programmers12940 {
	public int[] solution(int n, int m) {

		int max = Math.max(n, m);
		int min = Math.min(n, m);

		// 최대공약수
		while (min != 0) {
			int x = max % min;
			max = min;
			min = x;
		}

		// 최소공배수 = 두 수의 곱 나누기 최대공약수
		int y = n * m / max;
		int[] answer = { max, y };
		return answer;
	}
}
