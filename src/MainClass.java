
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���ٰ� ���� ������ �ֿ��ߵǴ� �������� ���α׷� �ۼ�
		// ���� ���� ���Ѿ� �� �� ���� ����
		int money = 0;
		// 3�� �ݼ�
		for (int i = 1; i <= 5; ++i) {
			// ���� ���ٶ�� ȭ�鿡 ���
			System.out.println("���� ����");
			// ���� �ֿ�� �� ���� ���� ������ �ǰ�
			System.out.println("1000���� �־���");
			money = money + 1000;
			// �󸶰� �Ǿ��� ���
			System.out.println("�� ����?" + money);
		}
		if(money >= 5000) {
			System.out.println("���� ������ �ִ�");
			
		}else {
			System.out.println("�� �� �����");
		}
		
		int a=0;
		MyClass mc = new MyClass();
		money = mc.coin(money);
		mc.coin2();
		mc.coin3();
		System.out.println("�� ����?" + money);
	
		
		
	}
}
