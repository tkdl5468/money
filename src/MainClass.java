
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����Լ� �̿��Ͽ� 1000,2000,3000�� �������� �ݴ°� �ڵ��غ���!
		
		// ���� ���� ���Ѿ� �� �� ���� ����
		int money = 0;
		
		//�� ����� Ŭ������ �޼ҵ�� ���� �Ҹ�

		MyClass mc = new MyClass();
		money =mc.coinRandom(money);
	//	money = mc.coin1(money);
	//	mc.coin2();
	//	mc.coin3();
		System.out.println("�� ����?" + money);
		
	
		
		
	}
}
