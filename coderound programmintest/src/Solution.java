
/* �Ʒ� �⺻ ������ �ڵ带 ���� �Ǵ� �����ϰ� ������ �ڵ带 ����ϼŵ� �˴ϴ�.
   ��, ����ϴ� Ŭ�������� Solution �̾�� �ϸ�, ������ Solution.java �� ����� ���� �����մϴ�.
   �̷��� ��Ȳ������ �����ϰ� java Solution ������� ���α׷��� ������ �� �� �ֽ��ϴ�. */
import java.util.*;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		/*
		 * �Ʒ� �޼ҵ� ȣ���� ������ ǥ���Է�(Ű����) ��� input.txt ���Ϸ� ���� �о���ڴٴ� �ǹ��� �ڵ��Դϴ�. ���� ������
		 * PC ���� �׽�Ʈ �� ����, �Է°��� input.txt�� ������ �� �� �ڵ带 ù �κп� ����ϸ�, ǥ���Է� ���
		 * input.txt ���Ϸ� ���� �Է°��� �о� �� �� �ֽ��ϴ�. ����, ���� PC���� �Ʒ� �޼ҵ带 ������� �ʰ� ǥ���Է���
		 * ����Ͽ� �׽�Ʈ�ϼŵ� �����մϴ�. ��, Codeground �ý��ۿ��� "�����ϱ�" �� ������ �ݵ�� �� �޼ҵ带 ����ų�
		 * �ּ�(//) ó�� �ϼž� �մϴ�.
		 */
		// Scanner sc = new Scanner(new FileInputStream("input.txt"));

		Scanner sc = new Scanner(System.in);

		int TC;
		int test_case;
		int num;// ó�� �޴� ���� ��Ұ���
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
			// �� �κп��� �˰��� ���α׷��� �ۼ��Ͻʽÿ�.
			num = sc.nextInt();// �־��� ���ڰ���
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

			// �� �κп��� ������ ����Ͻʽÿ�.
			System.out.println("Case #" + test_case);
			System.out.println(result);
		}

	}
}