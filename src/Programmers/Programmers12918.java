package Programmers;

public class Programmers12918 {
	public boolean solution(String s) {
		boolean answer = true;

		if (s.length() == 4 || s.length() == 6) {
			try {
				int x = Integer.parseInt(s);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		} else {
			return false;
		}
	}
}