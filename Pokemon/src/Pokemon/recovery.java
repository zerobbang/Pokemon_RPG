package Pokemon;


public class recovery extends Player{
	
	public recovery(String name, String kind, String belong, int hp, int offense, int defense, int mana) {
		super(name, kind, belong, hp, offense, defense, mana);
		// TODO Auto-generated constructor stub
	}

	public void recover(monster mon) {
		// ���� �� �Ķ���ͷ� �ޱ�..?
		System.out.println("�ȳ��ϼ���! ����� ȸ�������Դϴ�.");
		System.out.println("�Ϸ絿�� ȸ���� �մϴ�.");
		// ȸ�� ���� ���� ���� ..?
		mon.hp += 10;
		
		dateTime.hour = 3;
		
		choiceMove();
		
	}

}
