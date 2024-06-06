package day2;

import java.util.Scanner;

public class Solution8 {
	public static void main(String[] args) {
		/* 문제 설명
		문자열 str이 주어집니다.
		문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
		 */
		/* 제한사항
		1 ≤ str의 길이 ≤ 10
		*/
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();

		for (int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}

		// // 다른 사람 풀이: 향상 for문
		// for(String str : a.split("")) {
		// 	System.out.println(str);
		// }
	}
}