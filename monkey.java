package comp;

import java.util.Arrays;
import java.util.Scanner;

public class monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int succedent[] = new int [8];//����������ڱ���һ�����Ӻ�һλ��˭�����硰next[5]��ֵ��7������˵5�ź��ӵ���һλ��7�ź��ӣ�6�ź����Ѿ���֮ǰ�˳��ˡ�
		int precedent[] = new int [8]; //����������ڱ���һ������ǰһλ��˭���÷�����������ơ�

		int n, m;

		while (true) {
			Scanner keyin = new Scanner(System.in);		
			System.out.println("Please input 2 intergers");
			n = keyin.nextInt();// n monkeys
			m = keyin.nextInt();//who count m will quit
			//  System.out.println(n);
			// System.out.println(m);
			//cin >> n >> m;

			if (n == 0 && m == 0)
				break;
			for (int i = 0; i < n - 1; i++) {
				succedent[i] = i + 1;
				precedent[i + 1] = i;
			}
			succedent[n - 1] = 0;
			precedent[0] = n - 1;

			int current = 0;
			while (true)
			{
				//���һ��Ҫ��m�κţ���ôȡm-1��succedent֮�������Ҫ�˳�����ֻ����
				for (int count = 1; count < m; count++)
				{
					System.out.println("count "+count);
					System.out.println("current "+ current+ "\t"+ "succedent[current] " + succedent[current]+"\n");

					current = succedent[current];////

					System.out.println("current "+ current+ "\t"+ "succedent[current] " + succedent[current]+"\n");
					System.out.println(Arrays.toString(succedent));
					System.out.println(Arrays.toString(precedent));
				}

				int pre = precedent[current];
				int suc = succedent[current];
				//��current�ź����˳��ܼ򵥣����ǰ�ǰһλ�ġ���һλ��ָ��current����һλ��
				//��һλ�ġ�ǰһλ��ָ��current��ǰһλ�ͺ���
				succedent[pre] = suc;
				precedent[suc] = pre;
				if (pre == suc) {
					//���ֻʣ�������ˣ���ôÿ���˵�ǰλ�ͺ�λ����ͬһ���ˡ�
					//current���˳��ģ���ô��һ������ʣ�µġ�
					//���ǵ�����Ǵ�0��ŵģ����ʱҪ��һ
					System.out.println(pre+1);
					//cout << pre+1 << endl;
					break;
				}
				current = suc;
			}
		}



	}
}

