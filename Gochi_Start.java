package Gochi;

public class Gochi_Start extends Main_Gochi {
	void Start() {
		System.out.println("*********************************\n"
						 + "*  BOKVENGERS : DamaGochi, 2019 *\n"
						 + "*    �����, ������, �����, ������	*\n"
						 + "* @Copyright all right reserved *\n"
						 + "*********************************\n");
		
		System.out.print("���� ����(1) > ");
	
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