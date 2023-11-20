package test.programmers;

/*
	두 수의 나눗셈
	
	문제 설명
	- 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
	
	제한사항
	- 0 < num1 ≤ 100
	- 0 < num2 ≤ 100
*/

public class Quiz120806 {
	public int solution(int num1, int num2) {
        int answer = 0;
        double dnum = num1 / (double)num2;
		dnum *= 1000;
		answer = (int)dnum;
        return answer;
    }
}
