package bao;

import java.util.Scanner;

public class LX3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = scanner.nextInt();
		scanner.close();
		/*����һ*/
		if((year % 4 ==0 && year % 100 !=0) || year%400 ==0){
		System.out.println("������������");
		}else{
		System.out.println("�����ݲ�������");
		}
		/*������*/
		boolean isLeapYear = (year % 4 ==0 && year % 100 !=0) || year%400 ==0;
		String string = isLeapYear?year+"������":year+"��������";
		System.out.println(string);
		}
}
