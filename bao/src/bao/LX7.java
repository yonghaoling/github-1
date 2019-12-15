package bao;

import java.util.Scanner;

public class LX7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入三个整数，以空格隔开：");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		System.out.println("输入的值为：a = " + a + ", b = " + b + ", c = " + c);
		if(a > b){
			if ( b > c) {
				System.out.println("排序后的值为：" + c + "," + b + "," + a);
				}else if( c > a){
					System.out.println("排序后的值为：" + b + "," + a + "," + c);
					}else{
						System.out.println("排序后的值为：" + b + "," + a + "," + c);
						}
			}else{
				if(c < a){
					System.out.println("排序后的值为：" + c + "," + a + "," + b);
					}else if(c > b){
						System.out.println("排序后的值为：" + a + "," + b + "," + c);
						}else{
							System.out.println("排序后的值为："+ a + "," + c + "," + b);
							}
				}
		}
	}
