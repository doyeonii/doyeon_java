package codeground1;
import java.util.*;


class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int TC;
		int test_case;

		int num;// ó�� �޴� ���� ��Ұ���
		int temp=0;

		int result = 0;
			TC = sc.nextInt();

		for (test_case = 1; test_case <= TC; test_case++) {
			result=0;
			// �� �κп��� �˰��� ���α׷��� �ۼ��Ͻʽÿ�.
			num = sc.nextInt();// �־��� ���ڰ���
			for (int i = 0; i < num; i++) {
				temp = sc.nextInt();
				result = temp^result;
				}
	
			System.out.println("Case #" + test_case);
			System.out.println(result);

		}
	}
}