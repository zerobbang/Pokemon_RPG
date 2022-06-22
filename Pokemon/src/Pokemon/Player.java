package Pokemon;

import java.util.Random;
import java.util.Scanner;

public class Player extends Character {
	
	// 시간
	// dateTime time = new dateTime(name,kind,belong,hp,offense,defense,mana);
	
	monster mon = new monster("파이리","불","선후박",40,10,5,3);


	public Player(String name, String kind, String belong, int hp, int offense, int defense, int mana) {
		super();
		this.name = name;
		this.kind = kind;
		this.belong = belong;
		this.hp = hp;
		this.offense = offense;
		this.defense = defense;
		this.mana = mana;
	}


	// 확률 이동 함수
	public void move(String string) {
		dateTime time = new dateTime(name,kind,belong,hp,offense,defense,mana);
		System.out.println("앞으로 꾸물꾸물 이동!");
		
		Random rd = new Random();
		int ranMove = rd.nextInt(10);
		
		if(ranMove<=3) {
			System.out.println("아무 일도 일어나지 않았습니다");
			time.timeFlow(1);
			choiceMove();
		}else if(ranMove <= 7){
			System.out.println("야생의 포켓몬과 마주했다!");
			time.timeFlow(1);
			choiceMove();
		}else{
			System.out.println("관장님과 조우하였습니다!");
			time.timeFlow(2);
			choiceMove();
		}
		
	}
	
	
	// 이동 선택 함수
	public void choiceMove () {
		dateTime time = new dateTime(name,kind,belong,hp,offense,defense,mana);
		if(dateTime.hour >= 3) {
			time.timeFlow(0);
		}
		
		// 이동 선택
		System.out.println("\n어디로 이동하시겠습니까?");
		System.out.println("1. 이동   2. 회복센터  3. 상점");
		
		// 유저의 선택 받기
		Scanner sc = new Scanner(System.in);
		int userChoice = sc.nextInt();
		
		// 조건
		if(userChoice == 1) {
			move("이동");
		}else {
			recovery recover = new recovery(name,kind,belong,hp,offense,defense,mana);
			recover.recover(mon);
		}
	}



}
