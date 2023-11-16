package test.programmers;

public class Quiz12916 {
	boolean solution(String s) {
        boolean answer = true;
        char[] arr = new char[s.length()];
		int count_p = 0;
		int count_y = 0;
		
        for(int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);			 
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(arr[i] == 'P' || arr[i] == 'p') {
				count_p++;
			}
			if(arr[i] == 'Y' || arr[i] == 'y') {
				count_y++;
			}
		}
		
		if(count_p != count_y) {
			answer = false;
		}

        return answer;
    }
}
