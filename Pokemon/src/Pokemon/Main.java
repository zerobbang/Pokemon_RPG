package Pokemon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player ch1 = new Player("���Ĺ�","Ʈ���̳�","None",100,10,10,0);
		
		System.out.println(ch1.name);
		
		System.out.printf("�ȳ��ϼ��� %s Ʈ���̳ʴ�! \n",ch1.name);
		ch1.choiceMove();

	}

}
