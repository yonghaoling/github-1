package bao;

import java.util.Scanner;

public class LX7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����������������Կո������");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		System.out.println("�����ֵΪ��a = " + a + ", b = " + b + ", c = " + c);
		if(a > b){
			if ( b > c) {
				System.out.println("������ֵΪ��" + c + "," + b + "," + a);
				}else if( c > a){
					System.out.println("������ֵΪ��" + b + "," + a + "," + c);
					}else{
						System.out.println("������ֵΪ��" + b + "," + a + "," + c);
						}
			}else{
				if(c < a){
					System.out.println("������ֵΪ��" + c + "," + a + "," + b);
					}else if(c > b){
						System.out.println("������ֵΪ��" + a + "," + b + "," + c);
						}else{
							System.out.println("������ֵΪ��"+ a + "," + c + "," + b);
							}
				}
		}
	}
