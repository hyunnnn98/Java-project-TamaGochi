package Gochi;

public class Gochi_Choice extends Main_Gochi{

	Gochi_Function Function = new Gochi_Function();	// Gochi_Function�� ���� �ҷ����� �ν��Ͻ� ����
	Gochi_Status Status		= new Gochi_Status();	// Gochi_Status�� ���� �ҷ����� �ν��Ͻ� ����
	Gochi_Limit Limit		= new Gochi_Limit();	// Gochi_Limit�� ���� �ҷ����� �ν��Ͻ� ����
	Gochi_Game Game			= new Gochi_Game();

	static int s_Day = 1;	// ���� �� day�� '1' �� �ʱ�ȭ
	static int Choice;		// Gochi_Weather Ŭ������ �ʿ��� Choice�� �������� ����

	void Flow() {
		Function.Function();
		Limit.Limit();
		Status.Status();
	}
	
	void Choice() {
		
		// �޴�����(Choice) ����
		for(;;) {	

			System.out.println("\n\n(1 : ����) (2 : �Ļ�) (3 : ����)\n"
							+ "(4 : ����) (5 : ����) (6 : �)\n"
							+ "(7 : �����) (8 : ����)\n");
			System.out.print("Ȱ���� ���� > ");
			
			Choice = scan.nextInt();		// Choice ���� ���� �Է�
			
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
			case 7:							// ������� �� ��� ĳ���� �ɷ�ġ �ʱ�ȭ
				Gochi_Status.s_Clean	= 50;
				Gochi_Status.s_Tired	= 50;
				Gochi_Status.s_Full		= 50;
				Gochi_Status.s_Health	= 50;
				Gochi_Status.s_Dung		= 50;
				break;
			case 8:
				break;
			default:						// 1~8 ������ ���� ������� �������� ����
				System.out.println("1 ~ 8 ������ ���� �Է�");
				break;
			}			// switch�� ����
			
			if(Choice == 7) {
				System.out.println("\n����� �մϴ�. \n");
				break;
			}
			if(Choice == 8) {				// 8�Է½� for�� ����
				System.out.println("\n������ ���� �մϴ�. \n");
				break;
			}
			if(Gochi_Status.c_Level == 10 || Gochi_Status.s_Health <= 0) {
				break;
			}// if�� ����
		} // for�� ����
	} // choice() �޼ҵ� ����
}