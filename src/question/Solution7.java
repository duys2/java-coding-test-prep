package question;

import java.util.Scanner;

public class Solution7 {
	public static void main(String[] args) {
		/* 문제 설명
		두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
		입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
		 */
		/* 제한사항
		1 ≤ str1, str2의 길이 ≤ 10
		*/
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		System.out.println(a + b);

		/* 다른 사람 풀이 */
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.out.print(br.readLine().replaceAll(" ", ""));
	}
}