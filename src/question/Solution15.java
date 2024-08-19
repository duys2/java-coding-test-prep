package question;

public class Solution15 {
	/* 문제 설명
	연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

	12 ⊕ 3 = 123
	3 ⊕ 12 = 312
	양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.

	단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
	*/

	/* 제한사항
	1 ≤ a, b < 10,000
	*/

	public static void main(String[] args) {
		System.out.println(new Solution15().solution(4, 81));
	}

	public int solution(int a, int b) {
		int answer = 0;

		String ab = String.valueOf(a) + String.valueOf(b);
		String ba = String.valueOf(b) + String.valueOf(a);

		answer = Integer.parseInt(ab) < Integer.parseInt(ba) ? Integer.parseInt(ba) : Integer.parseInt(ab);
		// answer = Math.max(Integer.parseInt(ab), Integer.parseInt(ba));

		return answer;

		/* --------------- 다른 사람 풀이 --------------- */
		// return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
	}
}