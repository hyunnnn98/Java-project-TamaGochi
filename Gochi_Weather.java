package Gochi;

public class Gochi_Weather{
	
//	static int w_Change = 0;
	
	void Weather() {
	
		int w_Change = 0;
		
		if(Gochi_Choice.Choice == 4)	w_Change = (int)(Math.random()*4);
		
		switch(w_Change) {
		case 0:
			System.out.print("������ ���� : ���� *");
			break;
		case 1:
			System.out.print("������ ���� : �帲 *");
			break;
		case 2:
			System.out.print("������ ���� : ��� *");
			break;
		case 3:
			System.out.print("������ ���� : ��   *");
			break;
		}
	}
}