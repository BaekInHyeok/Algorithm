package Programmers;

public class Programmers12954 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];

		long num = x;
		for (int i = 0; i < n; i++) {
			answer[i] = num;
			num = num + x;
		}

		return answer;
	}
}
