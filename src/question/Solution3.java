package question;

import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {
		/* 문제 설명
		문자열 str과 정수 n이 주어집니다.
		str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
		 */
		/* 제한사항
		1 ≤ str의 길이 ≤ 10
		1 ≤ n ≤ 5
		*/
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();

		/* 다른 사람 풀이 */
		// System.out.println(str.repeat(n));

		// StringBuilder sb = new StringBuilder();
		// for(int i=0; i<n; i++){
		// 	sb.append(str);
		// }
		// String s = sb.toString();
		// System.out.println(s);

		String result = "";

		for (int i = 0; i < n; i++) {
			result = result.concat(str);
		}

		System.out.println(result);
	}
}