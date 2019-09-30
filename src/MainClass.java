
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 길을 가다가 돈을 세번을 주워야되는 설정으로 프로그램 작성
		// 돈을 저장 시켜야 할 돈 변수 설정
		int money = 0;
		// 3번 반속
		for (int i = 1; i <= 5; ++i) {
			// 길을 간다라고 화면에 출력
			System.out.println("길을 간다");
			// 돈을 주우면 돈 변수 값이 변경이 되고
			System.out.println("1000원을 주었다");
			money = money + 1000;
			// 얼마가 되었다 출력
			System.out.println("내 돈은?" + money);
		}
		if(money >= 5000) {
			System.out.println("밥을 먹을수 있다");
			
		}else {
			System.out.println("돈 더 벌어라");
		}
		
		int a=0;
		MyClass mc = new MyClass();
		money = mc.coin(money);
		mc.coin2();
		mc.coin3();
		System.out.println("내 돈은?" + money);
	
		
		
	}
}
