package bao;

import java.util.Scanner;

/*
* 北京地区的个人所得税计算公式：
应纳税额 = （工资薪金所得 - 扣除数）*适用税率 - 速算扣除数
其中，扣除数为3500
*/
public class LX8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的税前工资：");
		int salaryBeforeTax = scanner.nextInt();
		scanner.close();
		int taxSalary = salaryBeforeTax - 3500;
		double tax;
		/*方法一*/
		tax = taxSalary<0?0.0:
		taxSalary<=1500?taxSalary*0.03:
		taxSalary<=4500?taxSalary*0.1-105:
		taxSalary<=9000?taxSalary*0.2-555:
		taxSalary<=35000?taxSalary*0.25-1005:
		taxSalary<=55000?taxSalary*0.3-2755:
		taxSalary<=80000?taxSalary*0.35-5505:
		taxSalary*0.45-13505;
		System.out.println("个人应缴纳税款为："+tax);
		/*方法二*/
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
		System.out.println("个人应缴纳税款为："+tax);
		}
}
