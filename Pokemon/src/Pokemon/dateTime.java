package Pokemon;

import java.util.Random;

public class dateTime extends Player{
	
	//monster mon = new monster(belong, belong, belong, defense, defense, defense, defense);
	
	public dateTime(String name, String kind, String belong, int hp, int offense, int defense, int mana) {
		super(name, kind, belong, hp, offense, defense, mana);
		// TODO Auto-generated constructor stub
	}

	// 시간 흐름 및 날짜 class
	// date class 사용하면 현실 시간 필요
	
	static int day = 1;
	static int hour = 0;
	
	public void timeFlow(int flow) {
		if(hour >= 3) {
			day += 1;
			hour = 0;
			
			Runnable runnable = new timeThread();
			Thread th = new Thread(runnable);
			th.start();
			
			System.out.println("\n밤이 되었습니다.");
			System.out.println("잠자는 중\n");
			
			Random rd = new Random();
			int monsterHpUp = rd.nextInt(5);
			
			//40은 임의의 값
			// 몬스터의 hp 받아오기
			
			if(mon.hp >= 40) {
				System.out.println("포켓몬의 체력이 100%입니다.");
			}else {
				if(monsterHpUp==0) {
					System.out.println("포켓몬이 잠을 잘 자지 못했습니다.");
				}else {
					mon.hp+=monsterHpUp;
					if(mon.hp>=40) mon.hp = 40;
				}
			}
			
			
			// run 추가
			for(int i = 0;i<5;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.printf("아침이 밝았습니다 :)\n포켓몬의 체력이 %d로 회복이 되었습니다.\n오늘은 탐험을 시작한지 %d일입니다.\n",mon.hp,dateTime.day);
			super.choiceMove();
		}else {
			hour += flow;
		}
	}

}
