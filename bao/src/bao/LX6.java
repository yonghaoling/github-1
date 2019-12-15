package bao;

import java.util.Scanner;

/*
* 需求：
* 编写一个收银柜台收款程序。根据单价、购买数量以及收款进行计算并输出应收金额和找零；
* 当总价大于或者等于500，享受8折优惠。
*
*/
public class LX6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入单价（￥）:");
		double price = scanner.nextDouble();
		System.out.println("请输入数量：");
		double amount = scanner.nextDouble();
		System.out.println("请输入收款金额：");
		double count = scanner.nextDouble();
		scanner.close();
		double totalMoney = price*amount;
		if(totalMoney > 500){
		totalMoney = totalMoney*0.8;
		}
		double change = count - totalMoney;
		System.out.println("应收金额为："+totalMoney + "找零为："+change);
		}
}
