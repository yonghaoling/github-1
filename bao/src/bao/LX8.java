package bao;

import java.util.Scanner;

/*
* ���������ĸ�������˰���㹫ʽ��
Ӧ��˰�� = ������н������ - �۳�����*����˰�� - ����۳���
���У��۳���Ϊ3500
*/
public class LX8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������˰ǰ���ʣ�");
		int salaryBeforeTax = scanner.nextInt();
		scanner.close();
		int taxSalary = salaryBeforeTax - 3500;
		double tax;
		/*����һ*/
		tax = taxSalary<0?0.0:
		taxSalary<=1500?taxSalary*0.03:
		taxSalary<=4500?taxSalary*0.1-105:
		taxSalary<=9000?taxSalary*0.2-555:
		taxSalary<=35000?taxSalary*0.25-1005:
		taxSalary<=55000?taxSalary*0.3-2755:
		taxSalary<=80000?taxSalary*0.35-5505:
		taxSalary*0.45-13505;
		System.out.println("����Ӧ����˰��Ϊ��"+tax);
		/*������*/
		if( taxSalary < 0 ){
		tax = 0;
		}else if( taxSalary <= 1500){
		tax = taxSalary*0.03;
		}else if( taxSalary <= 4500){
		tax = taxSalary*0.1-105;
		}else if( taxSalary <= 9000){
		tax = taxSalary*0.2-555;
		}else if( taxSalary <= 35000){
		tax = taxSalary*0.25-1005;
		}else if( taxSalary <= 55000){
		tax = taxSalary*0.3-2755;
		}else if( taxSalary <= 80000){
		tax = taxSalary*0.35-5505;
		}else{
		tax = taxSalary*0.45-13505;
		}
		System.out.println("����Ӧ����˰��Ϊ��"+tax);
		}
}
