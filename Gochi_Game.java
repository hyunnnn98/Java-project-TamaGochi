package Gochi;

/*
 * Gochi_Choice���� ������ ������ ���, random���� ������ �����ϰ�, ���� ����� ���
*/

public class Gochi_Game extends Main_Gochi {
	
	//������ �̱� ���� ���� ���, status ��ȭ�� �ٸ��� �ϱ� ���� ����
	static int result_Game = 1;
	
	void Game() {
		int random_Game = (int)((Math.random())*2)+1;
		
		switch(random_Game) {
		//���������� ����
		case 1:
			int user, com;
			for(;;) {
				System.out.printf("����(1) ����(2) ��(3) ������ �����մϴ�");

				user = scan.nextInt();

				com = (int)(Math.random()*3)+1;

				System.out.println(Gochi_Name.name + ": "+ user + "�Դϴ�");
				System.out.println("��ǻ�� : "+ com + "�Դϴ�");

				switch(user-com){
				case -2: 
				case 1:
					System.out.println("user Win");
					result_Game = 1;		//gaem_Win �� result_Game �� '1' �Է�
					break;
				case -1:
				case 2:
					System.out.println("user Lose");
					result_Game = 0;		//gaem_Lose �� result_Game �� '0' �Է�
					break;
				case 0:
					System.out.println("user Draw try again");
					continue;

				}
				break;
			}
			break;
		
		//���ڸ��߱� ����
		case 2:
			System.out.print("���ڸ��߱� ���ӿ� ���Ű��� ȯ���մϴ�. \n"
							+"�� ��ȸ�� 3�� �־����ϴ�. \n"
							+"1����10������ ���� �� �ϳ��� ���ڸ� �����Ͽ� \n"
							+"��ǻ�Ͱ� �����ϰ� �ִ� ���ڸ� ���߸� �˴ϴ�. \n\n");
			int G_Computer = (int)(Math.random()*10)+1;
			int count = 1;
			System.out.print("���ڸ� �Է����ּ��� >");
			int G_User = scan.nextInt();
			System.out.println();
			for (;;) {
				if (G_User != G_Computer) {
					if (G_User > G_Computer) {
						System.out.print("�� ���� ��û�Ͻó׿� down �ٽ� �ѹ� �� �����غ�����.\n"
								+"���ڸ� �Է����ּ��� >");
						G_User = scan.nextInt();
						System.out.println();
					}else {
						System.out.print("�� ���� ��û�Ͻó׿� up �ٽ� �ѹ� �� �����غ�����.\n"
								+"���ڸ� �Է����ּ��� >");
						G_User = scan.nextInt();
						System.out.println();
					}
				}else {
					System.out.println(Gochi_Name.name + ":" + G_User + " ��ǻ��:" + G_Computer);
					System.out.println("�����մϴ�~~ ������ϴ�.");
					result_Game = 1;		//gaem_Win �� result_Game �� '1' �Է�
					break;
				}
				count++;
				if (count > 2) {
					System.out.println("��ȸ�� �������ϴ٤Ф� ���� ��û�Ͻó׿�.");
					result_Game = 0;		//gaem_Lose �� result_Game �� '0' �Է�
					break;
				}
				
			}
			break;
		}
	}
}