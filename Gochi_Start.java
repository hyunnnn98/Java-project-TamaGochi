package Gochi;

/*
 * Gochi_Start ������ ���۹����� ���, ���ӽ����� ����
 * Scanner�� ����ϱ� ����, Main_Gochi �� ��ӹ���
*/
public class Gochi_Start extends Main_Gochi {
	
	void Start() {

		System.out.println("*********************************\n"
						 + "   BOKVENGERS : DamaGochi, 2019   \n"
						 + "   �����, ������, ��û��, �����, ������   \n"
						 + "  @Copyright all right reserved  \n"
						 + "*********************************\n");
		
		System.out.print("���� ����(1) > ");

		//������ �����Ϸ��� '1'�� �Է�, '1'���� ���ڸ� �Է¹����� ���� ���Է�(���ѹݺ���) 
		for(;;) {
			
			int start = scan.nextInt();
			
			switch(start) {
			case 1:
				System.out.println("������ �����մϴ�.\n");
				break;
			default:
				System.out.print("���� �ٽ� �Է��ϼ���. > ");
				continue;
			}
			if(start == 1)	break;
		}
		
	}
}