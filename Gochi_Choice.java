package Gochi;

/*
 * Gochi_Choice ���� ĳ������ ������ ���� ��,
 * Gochi_Function ���� Status ���� �����ϰ�,
 * Gochi_Limit ���� ���Ѱ��� �� ��,
 * Gochi_Status �� ���� ���� ����Ѵ�.
*/

public class Gochi_Choice extends Main_Gochi{

	Gochi_Function Function = new Gochi_Function();
	Gochi_Status Status		= new Gochi_Status();
	Gochi_Limit Limit		= new Gochi_Limit();
	Gochi_Game Game			= new Gochi_Game();

	static int s_Day = 1;	
	static int Choice;		

//	Choice���� �ݺ������� ����Ǵ� Function, Limit, Status����� ����
	void Flow() {
		Function.Function();
		Limit.Limit();
		Status.Status();
	}
	
//	Gochi�� ���� Ȱ���� �����Ҽ��ִ� �޼���
	void Choice() {
		
		// ����ڰ� ��������� Ȱ���� �����Ҽ��ְ� �ݺ��� for�� ��� 
		for(;;) {	

			System.out.println("\n\n(1 : ����) (2 : �Ļ�) (3 : ����)\n"
							+ "(4 : ����) (5 : ����) (6 : �)\n"
							+ "(7 : �����) (8 : ����)\n");
			System.out.print("Ȱ���� ���� > ");
			
			Choice = scan.nextInt();		
			
			//	1,2,5,6 ���� ���� Flow��� �޼��带 �ҷ��ͼ� ����			
//				3 ���� ���� Game�̶�� ���ο� �޼��带 �ҷ���
//				4 ���� ���� ������ �� �� ��¥�� �����ϴ� �޼��带 �ҷ���
//				7 ���� ���� ���ο� ������ ������ ���ִ� �ʱⰪ�� ������
//				8 ���� ���� ����
			switch(Choice) {
			case 1:	case 2:	case 5:	case 6:
				Flow();
				break;
			case 3:
				Game.Game();
				Flow();
				break;
			case 4:
				s_Day++;					// �������ϸ� ��¥ s_Day�� 1����
				Flow();
				break;
			case 7:
				Gochi_Status.s_Clean	= 50;
				Gochi_Status.s_Tired	= 50;
				Gochi_Status.s_Full		= 50;
				Gochi_Status.s_Health	= 50;
				Gochi_Status.s_Dung		= 50;
				break;
			case 8:
				break;
			default:						
				System.out.println("1 ~ 8 ������ ���� �Է�");
				break;
			}			// switch�� ����
			
			if(Choice == 7) {
				System.out.println("\n����� �մϴ�. \n");
				break;
			}
			if(Choice == 8) {				
				System.out.println("\n������ ���� �մϴ�. \n");
				break;
			}
			
//			������ 10�϶� Game Clear
//			�ǰ��� 0�����ϰ�� Game Over
			if(Gochi_Status.c_Level == 10 || Gochi_Status.s_Health <= 0) {
				break;
			}// if�� ����
		} // for�� ����
	} // choice() �޼ҵ� ����
}