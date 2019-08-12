package Gochi;

/*
 * Status�� ���� ���� �ʰ��ϰų� �̸��� �� ���, �ǰ��� �г�Ƽ�� �ο��ϴ� class
*/

public class Gochi_Limit{
	
	//Clean ���� �� �ʰ� ��, �Ǻκ� ī��Ʈ(count_Clean), Ż��(exit_Clean) ���ڰ�
	int count_Clean		= 1;	
	int exit_Clean		= 1;
	
	//Clean ���� �� �̸� ��, �������� ī��Ʈ(count_Dirty), Ż��(exit_Dirty) ���ڰ�
	int count_Dirty		= 1;
	int exit_Dirty		= 1;
	
	//Tired ���� �� �ʰ� ��, �����Ƿ� ī��Ʈ(count_Tired), Ż��(exit_Tired) ���ڰ�
	int count_Tired		= 1;
	int exit_Tired		= 1;
	
	//Full ���� �� �ʰ� ��, ���� ī��Ʈ(count_Full), Ż��(exit_Full) ���ڰ�
	int count_Full		= 1;
	int exit_Full		= 1;
	
	//Full ���� �� �̸� ��, ������� ī��Ʈ(count_Less), Ż��(exit_Less) ���ڰ�
	int count_Less		= 1;
	int exit_Less		= 1;
	
	//Dung ���� �� �ʰ� ��, �뺯 ī��Ʈ(count_Dung), Ż��(exit_Dung) ���ڰ�
	int count_Dung		= 1;
	int exit_Dung		= 1;

	void Limit() {

		//if, û�� �� 80 �̻��� ��� �Ǻκ� / 100�̻��� ��, ������ �ϸ� �ǰ� -10, -20, -30
		if(Gochi_Status.s_Clean >= 80 && Gochi_Status.s_Tired < 100 && exit_Clean == 1) {
			System.out.println("ĳ���Ͱ� �Ǻκ��� �ɷȽ��ϴ�.");
			exit_Clean ++;

		}
		else if(Gochi_Status.s_Clean >= 100) {
			if(Gochi_Choice.Choice == 1) {
				System.out.printf("ĳ���Ͱ� ������ �����Ͽ� �ǰ��� \"%d\" �߰������Ͽ����ϴ�.\n", count_Clean*10);
				Gochi_Status.s_Health -= count_Clean*10;

				count_Clean++;

				if(count_Clean > 3) 		count_Clean = 3;		// count_Clean�� �ִ밪�� 3
			}
		}else if(Gochi_Status.s_Clean < 100) {
			if(Gochi_Status.s_Clean <= 80 && exit_Clean > 1) {
				System.out.println("�Ǻκ��� Ż���߽��ϴ�.");
				exit_Clean = 1;	// �Ǻκ� Ż�� (�ʱ�ȭ)
			}
			count_Clean = 1;	// s_Clean�� 100 �̸����� �������� count�� 1�� �ʱ�ȭ

		}//�Ǻκ� if�� ����
		
		//if, û�� �� 20 ������ ��� �������� / 0������ ��, �ǰ� -10, -20, -30
		if(Gochi_Status.s_Clean <=20 && Gochi_Status.s_Clean > 0 && exit_Dirty == 1) {
			System.out.println("ĳ���Ͱ� �����������ϴ�.");
			exit_Dirty ++;

		}else if(Gochi_Status.s_Clean <= 0) {	//������ �� 0�����϶�, �ǰ� -10, -20, -30

			System.out.printf("ĳ���Ͱ� �������� �ǰ��� \"%d\" �߰������Ͽ����ϴ�.\n", count_Dirty*10);
			Gochi_Status.s_Health -= count_Dirty*10;
			count_Dirty ++;

			if(count_Dirty > 3) 		count_Dirty = 3;		// count_Dirty�� �ִ밪�� 3

		}else if(Gochi_Status.s_Clean >= 20 && exit_Dirty > 1) {	//û���� 20 �̻����� ȸ�� �� ��������(�ʱ�ȭ)
			count_Dirty = 1; 	// s_Clean�� 20 �ʰ��ϸ� count�� 1�� �ʱ�ȭ
			exit_Dirty = 1;	// �������� Ż�� (�ʱ�ȭ)
			System.out.println("ĳ���Ͱ� �����������ϴ�.");
		} //�������� if�� ���� 

		//if, �Ƿ� �� 80 �̻��� ��� �����Ƿ� / 100�̻��� ��, �ǰ� -10, -20, -30
		if(Gochi_Status.s_Tired >= 80 && Gochi_Status.s_Tired < 100 && exit_Tired == 1) {
			System.out.println("ĳ���Ͱ� �����Ƿο� �ɷȽ��ϴ�.");
			exit_Tired ++;

		}
		else if(Gochi_Status.s_Tired <= 0)		Gochi_Status.s_Tired = 0;		// �Ƿΰ� 0 ���Ϸ� ���� 0 ���� ����
		else if(Gochi_Status.s_Tired >= 100) {

			System.out.printf("ĳ���Ͱ� �Ƿ��Ͽ� �ǰ��� \"%d\" �߰������Ͽ����ϴ�.\n", count_Tired*10);
			Gochi_Status.s_Health -= count_Tired*10;

			count_Tired++;

			if(count_Tired > 3) 		count_Tired = 3;		// count_Tired�� �ִ밪�� 3

		}else if(Gochi_Status.s_Tired < 100) {
			if(Gochi_Status.s_Tired <= 80 && exit_Tired > 1) {
				System.out.println("�����Ƿθ� Ż���߽��ϴ�.");
				exit_Tired = 1;	// �����Ƿ� Ż�� (�ʱ�ȭ)
			}
			count_Tired = 1;	// s_Tired�� 100 �̸����� �������� count�� 1�� �ʱ�ȭ

		} //�����Ƿ� if�� ����

		//if, ������ �� 80 �̻��� ��� ���� / 100�̻��� ��, �ǰ� -10, -20, -30
		if(Gochi_Status.s_Full >= 80 && Gochi_Status.s_Full < 100 && exit_Full == 1) {
			System.out.println("ĳ���Ͱ� ���񸸿� �ɷȽ��ϴ�. ��� �ʿ��մϴ�.");
			exit_Full ++;

		}else if(Gochi_Status.s_Full >= 100) {

			System.out.printf("ĳ���Ͱ� ���񸸿� �ɷ� �ǰ��� \"%d\" �߰������Ͽ����ϴ�.\n", count_Full*10);
			Gochi_Status.s_Health -= count_Full*10;

			count_Full++;

			if(count_Full > 3)			count_Full = 3;			// count_Full�� �ִ밪�� 3

		}else if(Gochi_Status.s_Full < 100) {

			if(Gochi_Status.s_Full <= 80 && exit_Full > 1) {
				System.out.println("������ Ż���߽��ϴ�.");
				exit_Full = 1;	// ���� Ż�� (�ʱ�ȭ)
			}
			count_Full = 1; 	// s_Full�� 100 �̸����� �������� count�� 1�� �ʱ�ȭ
		} //���� if�� ����

		//if, ������ �� 20 ������ ��� ������� / 0������ ��, �ǰ� -10, -20, -30
		if(Gochi_Status.s_Full <=20 && Gochi_Status.s_Full > 0 && exit_Less == 1) {
			System.out.println("ĳ���Ͱ� ��������� �ɷȽ��ϴ�.");
			exit_Less ++;

		}else if(Gochi_Status.s_Full <= 0) {	//������ �� 0�����϶�, �ǰ� -10, -20, -30

			System.out.printf("ĳ���Ͱ� ��������� �ɷ� �ǰ��� \"%d\" �߰������Ͽ����ϴ�.\n", count_Less*10);
			Gochi_Status.s_Health -= count_Less*10;
			count_Less ++;

			if(count_Less > 3) 		count_Less = 3;		// count_less�� �ִ밪�� 3

		}else if(Gochi_Status.s_Full >= 20 && exit_Less > 1) {	//�������� 20 �̻����� ȸ�� �� ������� Ż��(�ʱ�ȭ)
			count_Less = 1; 	// s_less�� 20 �ʰ��ϸ� count�� 1�� �ʱ�ȭ
			exit_Less = 1;	// ������� Ż�� (�ʱ�ȭ)
			System.out.println("��������� Ż���߽��ϴ�.");
		} //������� if�� ���� 

		//if, �뺯 �� 80 �̻��� ��� �忰 / 100�̻��� ��, �ǰ� -10, -20, -30
		if (Gochi_Status.s_Dung >= 80 && Gochi_Status.s_Dung < 100 && exit_Dung ==1) {
			System.out.println("ĳ���Ͱ� �忰�� �ɷȽ��ϴ�. ȭ����� ���� �մϴ�.");
			exit_Dung++;

		}
		else if(Gochi_Status.s_Dung <= 0)		Gochi_Status.s_Dung = 0;
		else if (Gochi_Status.s_Dung >=100) {
			System.out.printf("ĳ���Ͱ� �忰�� �ɷ� �ǰ��� \"%d\" �߰������Ͽ����ϴ�.\n", count_Dung*10);
			Gochi_Status.s_Health -= 10*count_Dung;

			count_Dung++;
			if (count_Dung > 3) count_Dung = 3;				// count_Dung�� �ִ��� 3

		}else if (Gochi_Status.s_Dung < 100) {
			if (Gochi_Status.s_Dung <= 80 && exit_Dung > 1) {
				System.out.println("�忰�� Ż���߽��ϴ�.");
				exit_Dung = 1;	//�忰 Ż��
			}
			count_Dung 	= 1;	//s_Dung�� 100 �̸����� �������� count�� 1�� �ʱ�ȭ

		} //�忰 if�� ����

		//if, �ǰ� �� 20 ������ ��� �ǰ��� ��ȭ / 0�� �Ǹ� ���
		if(Gochi_Status.s_Health <= 20 && Gochi_Status.s_Health > 0) {
			System.out.println("�ǰ��� ��ȭ�Ǿ����ϴ�. ġ�ᰡ �ʿ��մϴ�.");
		}
		else if(Gochi_Status.s_Health <= 0) {
			System.out.println("ĳ���Ͱ� ����Ͽ����ϴ�.");
		} //�ǰ���ȭ if�� ����

	}
}