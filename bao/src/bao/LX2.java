package bao;

import java.util.Scanner;

public class LX2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请依次输入三个整数：a,b,c（以空格隔开）");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		/*方法一*/
		int d=(a>b)?a:b;
		int e=(d>c)?d:c;
		System.out.println("最大值为"+e);
		/*方法二*/
		if(a>b && a>c){
		System.out.println("最大值为"+a);
		}else if(b>c && b>a){
		System.out.println("最大值为"+b);
		}else if(c>b && c>a){
		System.out.println("最大值为"+c);
		}else{
		System.out.println("出现异常");
		}
	}
}