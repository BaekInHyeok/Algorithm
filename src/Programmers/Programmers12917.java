package Programmers;

import java.util.*;

public class Programmers12917 {
	public String solution(String s) {
		String answer = "";

		String[] arr = s.split("");
		Arrays.sort(arr, Collections.reverseOrder());

		for (String string : arr) {
			answer += string;
		}

		return answer;
	}
}
