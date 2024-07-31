package day2;

public class Solution10 {
	/* 문제 설명
	문자열 my_string, overwrite_string과 정수 s가 주어집니다.
	문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열
	overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
	*/
	/* 제한사항
	my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
	1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
	0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이
	*/
	public static void main(String[] args) {
		System.out.println((new Solution10()).solution("He11oWor1d", "lloWorl", 2));
		System.out.println((new Solution10()).solution("Program29b8UYP", "merS123", 7));
	}

	public String solution(String my_string, String overwrite_string, int s) {
		String answer = "";

		String text = my_string.substring(s, overwrite_string.length() + s); // 바꿀 문자열
		System.out.println(text);
		answer = my_string.replace(text, overwrite_string); // 바꿀 문자열을 overwrite_string으로 변환

		return answer;
	}

	/* --------------- 다른 사람 풀이 --------------- */
	/*public String solution(String my_string, String overwrite_string, int s) {
		String before = my_string.substring(0, s);
		String after = my_string.substring(s + overwrite_string.length());
		return before + overwrite_string + after;
	}*/

	/*public String solution(String my_string, String overwrite_string, int s) {
		char[] my_chars = my_string.toCharArray();
		char[] overwrite_chars = overwrite_string.toCharArray();
		for (int i=0; i<overwrite_chars.length; i++) {
			my_chars[s + i] = overwrite_chars[i];
		}
		return String.valueOf(my_chars);
	}*/
}