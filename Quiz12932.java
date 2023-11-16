package test.programmers;

import java.util.ArrayList;


public class Quiz12932 {
	static public int[] solution(long n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(n > 0) {
			long tmp = n % 10; 
			list.add((int)tmp);
			n = n / 10;
		}
		int[] answer = new int[list.size()];

		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
    }	
}
