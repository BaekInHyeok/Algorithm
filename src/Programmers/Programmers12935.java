package Programmers;

public class Programmers12935 {
	public int[] solution(int[] arr) {

		if (arr.length == 1) {
			int[] answer = { -1 };
			return answer;
		}

		int min = arr[0];
		int[] answer = new int[arr.length - 1];

		for (int i = 1; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}

		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				continue;
			} else {
				answer[index++] = arr[i];
			}
		}

		return answer;
	}
}