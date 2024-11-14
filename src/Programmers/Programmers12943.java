package Programmers;

public class Programmers12943 {
	public int solution(long num) {
		int answer = 0;
		int count = 0;
		while (num != 1) {
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = num * 3 + 1;
			}
			count++;
		}

		if (count <= 500) {
			answer = count;
		} else {
			answer = -1;
		}

		return answer;
	}
}
