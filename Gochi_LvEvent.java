package Gochi;
//quiz�� lvevent �޼��� �����ؾ���
public class Gochi_LvEvent extends Main_Gochi {

	static int c_LvHealth	= 0;
	static int answer		= 0;

	void LvEvent() {

		switch(Gochi_Status.c_Level) {
		case 3:		c_LvHealth = 1;		break;
		case 6:		c_LvHealth = 2;		break;
		case 9:		c_LvHealth = 3;		break;
		default:						break;						
		}

		if(Gochi_Status.c_Level == 3 || Gochi_Status.c_Level == 6 || Gochi_Status.c_Level == 9) {
			if(Gochi_Status.Lv_Case / 100 > 0) {
				
				Gochi_Status.Lv_Case = 0;
				System.out.println("\n�ڡڡڡڡ��� Lv. " + Gochi_Status.c_Level + " �޼��ڡڡڡڡ�");
				System.out.print("Event�� �߻��߽��ϴ�. Quiz�� �����ϰڽ��ϱ�? ��(1) �ƴϿ�(2) ");
				int choice = scan.nextInt();

				if(choice == 1)		Quiz();
			}
		}

	}

	void Quiz() {
		switch(Gochi_Status.c_Level) {
		case 3:
			System.out.println("�ͼ��� ���� : �ݼ����� ����� �ϸ�?");
			System.out.println("(1) global\t(2) Half Castle Door\t(3) Actor Sorry.Moon");

			input_Answer();

			if (answer == 1)	answer_True();
			else				answer_False();

			break;
		case 6:
			System.out.println("JAVA ���� : �����ڸ� �ҷ����� ������?");
			System.out.println("(1) void\t(2) new\t(3) scanner");

			input_Answer();

			if (answer == 2)	answer_True();
			else				answer_False();

			break;
		case 9:
			System.out.println("�ͼ��� ���� : �ݼ����� ����� �ϸ� ?");
			System.out.println("(1) global\t(2) Half Castle Door\t(3) Actor Sorry.Moon");

			input_Answer();

			if (answer == 3)	answer_True();
			else				answer_False();

			break;
		}
	}

	void input_Answer() {
		System.out.println(Gochi_Name.name + " �� ������??? > ");
		answer = scan.nextInt();
	}

	void answer_True() {
		System.out.println("�����Դϴ�!!!");
		System.out.println("�⺻ �ɷ�ġ�� �����˴ϴ�.");

		Gochi_Status.s_Clean	= 50;
		Gochi_Status.s_Tired	= 50;
		Gochi_Status.s_Full		= 50;
		Gochi_Status.s_Health	= 50;
		Gochi_Status.s_Dung		= 50;
	}
	void answer_False() {
		System.out.println("Ʋ�Ƚ��ϴ�!!!");
		System.out.println("�⺻ �ɷ�ġ�� ���ҵ˴ϴ�.");

		Gochi_Status.s_Clean	= 30;
		Gochi_Status.s_Tired	= 30;
		Gochi_Status.s_Full		= 30;
		Gochi_Status.s_Health	= 30;
		Gochi_Status.s_Dung		= 30;
	}

}