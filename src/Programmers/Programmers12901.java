package Programmers;
import java.time.*;
public class Programmers12901 {
	public String solution(int a, int b) {
        String answer = LocalDate.of(2016,a,b).getDayOfWeek().toString().substring(0,3);
        return answer;
    }
}
