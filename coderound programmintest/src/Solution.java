
/* 아래 기본 제공된 코드를 수정 또는 삭제하고 본인이 코드를 사용하셔도 됩니다.
   단, 사용하는 클래스명이 Solution 이어야 하며, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해 볼 수 있습니다. */
import java.util.*;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		/*
		 * 아래 메소드 호출은 앞으로 표준입력(키보드) 대신 input.txt 파일로 부터 읽어오겠다는 의미의 코드입니다. 만약 본인의
		 * PC 에서 테스트 할 때는, 입력값을 input.txt에 저장한 후 이 코드를 첫 부분에 사용하면, 표준입력 대신
		 * input.txt 파일로 부터 입력값을 읽어 올 수 있습니다. 또한, 본인 PC에서 아래 메소드를 사용하지 않고 표준입력을
		 * 사용하여 테스트하셔도 무방합니다. 단, Codeground 시스템에서 "제출하기" 할 때에는 반드시 이 메소드를 지우거나
		 * 주석(//) 처리 하셔야 합니다.
		 */
		// Scanner sc = new Scanner(new FileInputStream("input.txt"));

		Scanner sc = new Scanner(System.in);

		int TC;
		int test_case;
		int num;// 처음 받는 숫자 몇개할건지
		int temp;
		int result = 0;
		int tempmax;
		int count = 0;

		Vector<Integer> v = new Vector<Integer>();
		Vector<Integer> plus = new Vector<Integer>();
		TC = sc.nextInt();
		for (test_case = 1; test_case <= TC; test_case++) {
			v.removeAllElements();
			plus.removeAllElements();
			// 이 부분에서 알고리즘 프로그램을 작성하십시오.
			num = sc.nextInt();// 주어진 숫자갯수
			for (int i = 0; i < num; i++) {
				temp = sc.nextInt();
				v.add(temp);
				plus.add(i + 1);
			}
			Collections.sort(v);
			for (int i = 0; i < num; i++) {

				tempmax = v.get(i) + plus.get(num - 1);
				count = 0;
				for (int j = 0; j < num; j++) {
					if (i != j) {
						if (tempmax >= v.get(j) + plus.get(num - 1 - j)) {
							count++;
						}
					}

				}

			

			if (count == num - 1) {

				result++;
			}
			}

			// 이 부분에서 정답을 출력하십시오.
			System.out.println("Case #" + test_case);
			System.out.println(result);
		}

	}
}