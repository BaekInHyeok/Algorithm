package Programmers;

public class Programmers12919 {
	public String solution(String[] seoul) {
		String answer = "";

		int count = seoul.length;
		for (int i = 0; i < count; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
			}
		}
		return answer;
	}
}
