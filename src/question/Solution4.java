package question;

import java.util.Scanner;

public class Solution4 {
	public static void main(String[] args) {
		/* 문제 설명
		영어 알파벳으로 이루어진 문자열 str이 주어집니다.
		각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
		*/
		/* 제한사항
		1 ≤ str의 길이 ≤ 20
			str은 알파벳으로 이루어진 문자열입니다.
		*/
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = "";

		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (c < 97) {
				c += 32;
			} else
				c -= 32;
			b += c;
		}

		System.out.println(b);

		sc.close();

		/* 다른 사람 풀이 */
		// String answer = "";
		//
		// //Stack <Character> stack = new Stack <> ();
		//
		// for(Character c : a.toCharArray()){
		// 	if(Character.isUpperCase(c)){
		// 		//stack.push(Character.toLowerCase(c));
		// 		answer += Character.toLowerCase(c);
		// 	}
		// 	else if(Character.isLowerCase(c)){
		// 		//stack.push(Character.toUpperCase(c));
		// 		answer += Character.toUpperCase(c);
		// 	}
		// }
		// System.out.println(answer);
	}
}