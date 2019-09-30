import java.util.Random;

public class MyClass {
	
	public MyClass() {
		
	}
	
	// 돈을 넣으면 1000원 더해주는 메소드
	public void coin(int money) {
		System.out.println("1000원을 더 했어요!");
		}
		public void coin2() {
			System.out.println("2000원을 더 했어요!");
		  	}	
		public void coin3() {
			System.out.println("3000원을 더 했어요!");
			}
	
		public int coin1(int money) {
			money = money +1000;
			System.out.println("당신의 돈은?");
			return money;
			}
		public int coinRandom(int money) {
			Random rnd = new Random();
			//System.out.println("랜덤 숫자는?" + rnd.nextInt(3));
			int num = rnd.nextInt(3);
			//만약에 랜덤 숫자가 0이면 1000원
			if (num == 0) {
				money = money + 1000;
			}
			//랜덤숫자가 1 이면 2000원
			else if (num == 1) {
				money = money + 2000;
				}
			//랜덤숫자가 2 이면 3000원
			else if (num == 2) {
				money = money + 3000;
				}
			
			return money;
			
		}
}
