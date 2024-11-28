package Programmers;

public class Programmers86491 {
	public int solution(int[][] sizes) {
		int answer = 0;

		int max_vertical = 0;
		int max_horizontal = 0;

		for (int i = 0; i < sizes.length; i++) {
			int vertical = Math.max(sizes[i][0], sizes[i][1]);
			int horizontal = Math.min(sizes[i][0], sizes[i][1]);

			max_vertical = Math.max(max_vertical, vertical);
			max_horizontal = Math.max(max_horizontal, horizontal);
		}
		answer = max_vertical * max_horizontal;
		return answer;
	}
}
