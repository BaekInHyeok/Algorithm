package Programmers;

public class Programmers12930 {
	public String solution(String s) {
		String answer = "";
		int count = 0;

		String[] arr = s.split("");

		for (String alphabet : arr) {
			count = alphabet.contains(" ") ? 0 : count + 1;
			answer += count % 2 == 0 ? alphabet.toLowerCase() : alphabet.toUpperCase();
		}
		return answer;
	}
}
