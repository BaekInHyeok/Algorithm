package Programmers;

public class Programmers12912 {
	public long solution(int a, int b) {
		long answer = 0;
		long start = a;
		long end = b;

		if (start <= end) {
			while (start <= end) {
				answer = answer + start;
				start++;
			}
		} else {
			while (start >= end) {
				answer = answer + start;
				start--;
			}
		}
		return answer;
	}
}
