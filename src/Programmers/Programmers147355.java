package Programmers;

public class Programmers147355 {
	public int solution(String t, String p) {
		int answer = 0;
		int length = p.length();
		long num = Long.parseLong(p);

		for (int i = 0; i < t.length() - length + 1; i++) {
			long difference = Long.parseLong(t.substring(i, i + length));

			if (difference <= num)
				answer++;
		}
		return answer;
	}
}
