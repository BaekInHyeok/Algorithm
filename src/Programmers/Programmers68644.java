package Programmers;

import java.util.*;

class Programmers68644 {
	public int[] solution(int[] numbers) {

		ArrayList<Integer> arrList = new ArrayList<>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int k = numbers[i] + numbers[j];
				arrList.add(k);
			}
		}

		int[] array = new int[arrList.size()];
		int size = 0;
		for (Integer temp : arrList) {
			array[size++] = temp;
		}

		array = Arrays.stream(array).distinct().toArray();

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		return array;
	}
}
