package Programmers;

class Programmers12944 {
	public double solution(int[] arr) {

		double sum = 0;
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			sum = sum + arr[i];
		}
		double answer = sum / len;
		return answer;
	}

}
