package test.programmers;

/*
	모음 제거
	
	문제 설명
	- 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
	- 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	- my_string은 소문자와 공백으로 이루어져 있습니다.
	- 1 ≤ my_string의 길이 ≤ 1,000
*/

public class Quiz120849 {
	public String solution(String my_string) {
        String answer = "";
        String[] str = { "i","o","e","u","a" };
		
		for(int i = 0; i < str.length; i++) {
			if(my_string.contains(str[i])) {
				my_string = my_string.replace(str[i], "");
			}
		}
        answer = my_string;
        return answer;
    }
}
