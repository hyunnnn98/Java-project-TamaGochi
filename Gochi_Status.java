package Gochi;

public class Gochi_Status extends Main_Gochi{

	Gochi_Weather Weather		= new Gochi_Weather();
	Gochi_LvEvent LvEvent 		= new Gochi_LvEvent();
	
	static int s_Clean	= 50;
	static int s_Tired	= 50;
	static int s_Full	= 50;
	static int s_Health	= 50;
	static int s_Dung	= 50;
	static int Lv_Case	= 0;
	//status�� �ʱ�ȭ �� 50 ����
	//ĳ������ status ����(û��, �Ƿ�, ������, �ǰ�, �뺯)

	static int c_Level = 1;

	void Status() {

		if(s_Health / 100 > 0 ) {
			Lv_Case = s_Health;
			c_Level++;
			s_Clean		= 40;
			s_Tired		= 40;
			s_Full		= 40;
			s_Health	= 40;
			s_Dung		= 40;
		}

		//������ 3, 6, 9�� �޼����� �� ���� ���� Ȯ�� �� �̺�Ʈ �߻� �޼��� ȣ��
		LvEvent.LvEvent(); 	
		
		System.out.println("\n***********************************************");
		System.out.print("* �̸� : �Ϳ�� " + Gochi_Name.name + "\tlevel : " + c_Level
						+ "\n*" + Gochi_Choice.s_Day + "����\t");
		Weather.Weather();
		//�̸�, ����, ���� ���
		char o = '��', x = '��';	//status ĭ ǥ��
		
		//s_Clean(û�� status) ǥ��
		System.out.print("\n* û��    : ");
		for(int i = 1 ; i <= 10 ; i++) {
			if(s_Clean / 10 >= i)
				System.out.print(o);
			else
				System.out.print(x);
		}
		System.out.print(s_Clean);
		
		//s_Tired(�Ƿ� status) ǥ��
		System.out.print("\n* �Ƿ�    : ");
		for(int i = 1 ; i <= 10 ; i++) {
			if(s_Tired / 10 >= i)
				System.out.print(o);
			else
				System.out.print(x);
		}
		System.out.print(s_Tired);
		
		//s_Full(������ status) ǥ��
		System.out.print("\n* ������ : ");
		for(int i = 1 ; i <= 10 ; i++) {
			if(s_Full / 10 >= i)
				System.out.print(o);
			else
				System.out.print(x);
		}
		System.out.print(s_Full);
		
		//s_Health(�ǰ� status) ǥ��
		System.out.print("\n* �ǰ�    : ");
		for(int i = 1 ; i <= 10 ; i++) {
			if(s_Health / 10 >= i)
				System.out.print(o);
			else
				System.out.print(x);
		}
		System.out.print(s_Health);
		
		//s_Dung(�뺯 status) ǥ��
		System.out.print("\n* �뺯    : ");
		for(int i = 1 ; i <= 10 ; i++) {
			if(s_Dung / 10 >= i)
				System.out.print(o);
			else
				System.out.print(x);
		}
		System.out.print(s_Dung);
		System.out.println("\n***********************************************");

	}
}