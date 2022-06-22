package Pokemon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player ch1 = new Player("선후박","트레이너","None",100,10,10,0);
		
		System.out.println(ch1.name);
		
		System.out.printf("안녕하세요 %s 트레이너님! \n",ch1.name);
		ch1.choiceMove();

	}

}
