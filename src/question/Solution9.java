package question;

import java.util.Scanner;

public class Solution9 {
	public static void main(String[] args) {
		/* 문제 설명
		자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
		 */
		/* 제한사항
		1 ≤ n ≤ 1,000
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println((n % 2 == 0) ? n + " is even" : n + " is odd");
	}
}