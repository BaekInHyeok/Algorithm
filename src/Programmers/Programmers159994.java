package Programmers;

public class Programmers159994 {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		int index1 = 0;
		int index2 = 0;

		for (String current : goal) {
			if (index1 < cards1.length && current.equals(cards1[index1])) {
				index1++;
			} else if (index2 < cards2.length && current.equals(cards2[index2])) {
				index2++;
			} else {
				return "No";
			}

		}
		return "Yes";

	}
}
