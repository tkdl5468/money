import java.util.Random;

public class MyClass {
	
	public MyClass() {
		
	}
	
	// ���� ������ 1000�� �����ִ� �޼ҵ�
	public void coin(int money) {
		System.out.println("1000���� �� �߾��!");
		}
		public void coin2() {
			System.out.println("2000���� �� �߾��!");
		  	}	
		public void coin3() {
			System.out.println("3000���� �� �߾��!");
			}
	
		public int coin1(int money) {
			money = money +1000;
			System.out.println("����� ����?");
			return money;
			}
		public int coinRandom(int money) {
			Random rnd = new Random();
			//System.out.println("���� ���ڴ�?" + rnd.nextInt(3));
			int num = rnd.nextInt(3);
			//���࿡ ���� ���ڰ� 0�̸� 1000��
			if (num == 0) {
				money = money + 1000;
			}
			//�������ڰ� 1 �̸� 2000��
			else if (num == 1) {
				money = money + 2000;
				}
			//�������ڰ� 2 �̸� 3000��
			else if (num == 2) {
				money = money + 3000;
				}
			
			return money;
			
		}
}
