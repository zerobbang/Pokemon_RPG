package Pokemon;

import java.util.Random;

public class dateTime extends Player{
	
	//monster mon = new monster(belong, belong, belong, defense, defense, defense, defense);
	
	public dateTime(String name, String kind, String belong, int hp, int offense, int defense, int mana) {
		super(name, kind, belong, hp, offense, defense, mana);
		// TODO Auto-generated constructor stub
	}

	// �ð� �帧 �� ��¥ class
	// date class ����ϸ� ���� �ð� �ʿ�
	
	static int day = 1;
	static int hour = 0;
	
	public void timeFlow(int flow) {
		if(hour >= 3) {
			day += 1;
			hour = 0;
			
			Runnable runnable = new timeThread();
			Thread th = new Thread(runnable);
			th.start();
			
			System.out.println("\n���� �Ǿ����ϴ�.");
			System.out.println("���ڴ� ��\n");
			
			Random rd = new Random();
			int monsterHpUp = rd.nextInt(5);
			
			//40�� ������ ��
			// ������ hp �޾ƿ���
			
			if(mon.hp >= 40) {
				System.out.println("���ϸ��� ü���� 100%�Դϴ�.");
			}else {
				if(monsterHpUp==0) {
					System.out.println("���ϸ��� ���� �� ���� ���߽��ϴ�.");
				}else {
					mon.hp+=monsterHpUp;
					if(mon.hp>=40) mon.hp = 40;
				}
			}
			
			
			// run �߰�
			for(int i = 0;i<5;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.printf("��ħ�� ��ҽ��ϴ� :)\n���ϸ��� ü���� %d�� ȸ���� �Ǿ����ϴ�.\n������ Ž���� �������� %d���Դϴ�.\n",mon.hp,dateTime.day);
			super.choiceMove();
		}else {
			hour += flow;
		}
	}

}
