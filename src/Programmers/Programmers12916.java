package Programmers;

public class Programmers12916 {
	boolean solution(String s) {
		boolean answer = true;

		int p = 0;
		int y = 0;
		int length = s.length();

		s = s.toLowerCase();

		for (int i = 0; i < length; i++) {
			if (s.charAt(i) == 'p') {
				p++;
			} else if (s.charAt(i) == 'y') {
				y++;
			}
		}

		if (p != y)
			answer = false;

		return answer;
	}
}
