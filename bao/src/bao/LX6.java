package bao;

import java.util.Scanner;

/*
* ����
* ��дһ��������̨�տ���򡣸��ݵ��ۡ����������Լ��տ���м��㲢���Ӧ�ս������㣻
* ���ܼ۴��ڻ��ߵ���500������8���Żݡ�
*
*/
public class LX6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����뵥�ۣ�����:");
		double price = scanner.nextDouble();
		System.out.println("������������");
		double amount = scanner.nextDouble();
		System.out.println("�������տ��");
		double count = scanner.nextDouble();
		scanner.close();
		double totalMoney = price*amount;
		if(totalMoney > 500){
		totalMoney = totalMoney*0.8;
		}
		double change = count - totalMoney;
		System.out.println("Ӧ�ս��Ϊ��"+totalMoney + "����Ϊ��"+change);
		}
}
