package solution;

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
		int N;

		TC = sc.nextInt();
		for (test_case = 1; test_case <= TC; test_case++) {
			int cnt =0;
			int max =0;
			N=sc.nextInt();
			
			int temp[]=new int[N];
			for(int i=0;i<N;i++)
			{
				temp[i]=sc.nextInt();
			}
			Arrays.sort(temp);
			for(int i=0;i<N;i++)
			{
				if((temp[i]+N-i)>max)
				{
					max = (temp[i]+N-i);
				}
			}
			//max�� ���� ����� �� �߿� ���� ���� 1�� �� �׼����� ��Ʈ������ ���� max���� Ŀ�� �׷��ϱ� ������ ���鿡 ���ؼ� �� �ּ��� max���� ũ�ų� ���ƾ��� 1���� �� �� �ִ�.   
			for(int i =0;i<N;i++)
			{
				if(temp[i]+N >= max)
				{
					cnt++;
				}
			}

			System.out.println("Case #" + test_case);
			System.out.println(cnt);
		}

	}
}