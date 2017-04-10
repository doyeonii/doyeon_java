package codeground1;
import java.util.*;


class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int TC;
		int test_case;

		int num;// 처음 받는 숫자 몇개할건지
		int temp=0;

		int result = 0;
			TC = sc.nextInt();

		for (test_case = 1; test_case <= TC; test_case++) {
			result=0;
			// 이 부분에서 알고리즘 프로그램을 작성하십시오.
			num = sc.nextInt();// 주어진 숫자갯수
			for (int i = 0; i < num; i++) {
				temp = sc.nextInt();
				result = temp^result;
				}
	
			System.out.println("Case #" + test_case);
			System.out.println(result);

		}
	}
}