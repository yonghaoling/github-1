package bao;
/*
* ��һ������������򣬸ó����ṩ��������ѡ�͹��û�ѡ��
* �û�ѡ��ĳ���ܺ󣬳����ڽ���������û���ѡ��ĵĹ������ơ�
*/
import java.util.Scanner;

public class LX5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ѡ���ܣ�1.��ʾȫ����¼ 2.��ѯ��¼��¼ 0.�˳�");
		int command = scanner.nextInt();
		scanner.close();
		switch (command) {
		case 0:
		System.out.println("��ӭʹ��");
		break;
		case 1:
		System.out.println("��ʾȫ����¼����");
		break;
		case 2:
		System.out.println("��ѯ��¼��¼����");
		break;
		default:
		System.out.println("�������");
		}
	}
}
