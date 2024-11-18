package Programmers;

import java.util.*;

public class Programmers12933 {
	public long solution(long n) {
		long answer = 0;

		String[] arr = Long.toString(n).split("");
		Arrays.sort(arr, Collections.reverseOrder());

		String reversedArr = "";

		for (String string : arr) {
			reversedArr += string;
		}
		answer = Long.parseLong(reversedArr);

		return answer;
	}
}
