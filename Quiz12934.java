package test.programmers;

public class Quiz12934 {
	
	static public long solution(long n) {
        long answer = -1;
        long sum = 0;
		for(long i = 1; i <= n; i += 2) {
			sum += i;
			if(sum == n) {
				answer = sum + i + 2;
				break;
			}
		}
        return answer;
    }	
}
