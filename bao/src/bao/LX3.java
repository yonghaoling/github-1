package bao;

import java.util.Scanner;

public class LX3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scanner.nextInt();
		scanner.close();
		/*方法一*/
		if((year % 4 ==0 && year % 100 !=0) || year%400 ==0){
		System.out.println("这个年份是闰年");
		}else{
		System.out.println("这个年份不是闰年");
		}
		/*方法二*/
		boolean isLeapYear = (year % 4 ==0 && year % 100 !=0) || year%400 ==0;
		String string = isLeapYear?year+"是闰年":year+"不是闰年";
		System.out.println(string);
		}
}
