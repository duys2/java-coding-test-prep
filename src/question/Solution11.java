package question;

public class Solution11 {
	/* 문제 설명
	길이가 같은 두 문자열 str1과 str2가 주어집니다.
	두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서
	한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
	*/

	/* 제한사항
	1 ≤ str1의 길이 = str2의 길이 ≤ 10
	str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.
	*/

	public static void main(String[] args) {
		String string = new Solution11().solution("abcd", "efgh");

		System.out.println(string);
	}

	public String solution(String str1, String str2) {
		String answer = "";

		for (int i = 0; i < str1.length(); i++) {
			answer += str1.substring(i, i + 1) + str2.substring(i, i + 1);
		}

		/* --------------- 다른 사람 풀이 --------------- */
		for (int i = 0; i < str1.length(); i++) {
			// 숫자 연산이 되므로 각각 더하거나 아래처럼 문자열을 앞에 붙여줌
			answer += str1.charAt(i);
			answer += str2.charAt(i);
		}

		for (int i = 0; i < str1.length(); i++) {
			/*char 가 정수형이라 char 계산이 먼저 실행되면 숫자계산이 됩니다.
			따라서 각각 더하거나 ""을 더하여 숫자를 문자열로 바꿔주면 문자열로 변환되어 계산*/
			answer += "" + str1.charAt(i) + str2.charAt(i); // 숫자 + 숫자가 되므로 앞에 문자열 ""를 붙여줌
		}

		return answer;
	}
}