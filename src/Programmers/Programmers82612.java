package Programmers;

public class Programmers82612 {
	public long solution(long price, long money, long count) {
		long answer = -1;

		long amount = 0;

		for (int i = 1; i <= count; i++) {
			amount = amount + price * i;
		}

		answer = amount - money;
		if (answer > 0) {
			return answer;
		} else {
			return 0;
		}
	}
}
