package Programmers;

public class Programmers13240 {
	public String solution(int[] food) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < food.length; i++) {
			int share = food[i] / 2;

			for (int j = 0; j < share; j++) {
				sb.append(i);
			}
		}
		String answer = sb.toString() + "0" + sb.reverse().toString();
		return answer;
	}
}
