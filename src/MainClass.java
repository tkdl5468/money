
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//랜덤함수 이용하여 1000,2000,3000원 랜덤으로 줍는거 코딩해보자!
		
		// 돈을 저장 시켜야 할 돈 변수 설정
		int money = 0;
		
		//위 기능을 클래스에 메소드로 만들어서 불리

		MyClass mc = new MyClass();
		money =mc.coinRandom(money);
	//	money = mc.coin1(money);
	//	mc.coin2();
	//	mc.coin3();
		System.out.println("내 돈은?" + money);
		
	
		
		
	}
}
