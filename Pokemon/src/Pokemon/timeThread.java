package Pokemon;


public class timeThread implements Runnable {
	// 시간
	
	@Override
	public void run() {
		for (int i = 0; i<4; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
		// System.out.printf("아침이 밝았습니다 :)\n포켓몬의 체력이 %d로 회복이 되었습니다.\n오늘은 탐험을 시작한지 %d일입니다.\n",mon.hp,dateTime.day);
		
	 }
	
}
	
	