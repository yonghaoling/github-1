package bao;

import java.util.Scanner;

public class LX2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������������������a,b,c���Կո������");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		/*����һ*/
		int d=(a>b)?a:b;
		int e=(d>c)?d:c;
		System.out.println("���ֵΪ"+e);
		/*������*/
		if(a>b && a>c){
		System.out.println("���ֵΪ"+a);
		}else if(b>c && b>a){
		System.out.println("���ֵΪ"+b);
		}else if(c>b && c>a){
		System.out.println("���ֵΪ"+c);
		}else{
		System.out.println("�����쳣");
		}
	}
}