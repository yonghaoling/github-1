package bao;

import java.util.Scanner;

public class LX9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = scanner.nextInt();
		System.out.println("�������·ݣ�");
		int month = scanner.nextInt();
		scanner.close();
		int dayNum = theDayNum(month); //�ȸ����·ݵó���������������꣬��2�·ݵ��������»�ȡ
		if(isLeapYear(year)){
		if(month == 2){
		dayNum ++; //��������꣬2�·�����һ��
		}
		System.out.print(year + "�����꣬");
		}else{
		System.out.print(year + "�������꣬");
		}
		System.out.println(year + "��" + month + "�·ݹ���" + dayNum + "��");
		}
		/*�ж��Ƿ�������
		* �ܱ�4���������ܱ�100�����������ܱ�400������������
		*/
		public static boolean isLeapYear(int year) {
		if((year % 4 ==0 && year % 100 !=0) || year%400 ==0){
		return true;
		}else{
		return false;
		}
		}
		/*�ж�����*/
		public static int theDayNum(int month) {
		switch (month) {
		case 1:
		return 31;
		case 2:
		return 28;
		case 3:
		return 31;
		case 4:
		return 30;
		case 5:
		return 31;
		case 6:
		return 30;
		case 7:
		return 31;
		case 8:
		return 31;
		case 9:
		return 30;
		case 10:
		return 31;
		case 11:
		return 30;
		case 12:
		return 31;
		default:
		System.out.println("�Բ�����������·�����");
		return 0;
		}
		}
}
