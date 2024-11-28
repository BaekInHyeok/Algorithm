package Programmers;

public class Programmers12926 {
	public String solution(String s, int n) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			// 공백
			if (ch == ' ') {
				answer += ch;
				continue;
			}

			// 소문자
			if (ch >= 'a' && ch <= 'z') {
				answer += (char) ((ch - 'a' + n) % 26 + 'a');
			}
			// 대문자
			else {
				answer += (char) ((ch - 'A' + n) % 26 + 'A');
			}
		}

		return answer;
	}
}
