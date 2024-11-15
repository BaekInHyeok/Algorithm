package Programmers;

public class Programmers12948 {
	public String solution(String phone_number) {

		char[] arr = phone_number.toCharArray();

		for (int i = 0; i < arr.length - 4; i++) {
			arr[i] = '*';
		}
		String answer = String.valueOf(arr);
		return answer;
	}
}
