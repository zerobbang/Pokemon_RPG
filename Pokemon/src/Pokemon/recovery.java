package Pokemon;


public class recovery extends Player{
	
	public recovery(String name, String kind, String belong, int hp, int offense, int defense, int mana) {
		super(name, kind, belong, hp, offense, defense, mana);
		// TODO Auto-generated constructor stub
	}

	public void recover(monster mon) {
		// 몬스터 값 파라미터로 받기..?
		System.out.println("안녕하세요! 여기는 회복센터입니다.");
		System.out.println("하루동안 회복을 합니다.");
		// 회복 센터 가면 완충 ..?
		mon.hp += 10;
		
		dateTime.hour = 3;
		
		choiceMove();
		
	}

}
