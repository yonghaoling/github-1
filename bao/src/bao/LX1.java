package bao;
import java.util.Scanner;
public class LX1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������������������a,b���Կո������");
		/*�Ƚ��������Ĵ�С*/
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		int d=(a>b)?a:b;
		System.out.println("���ֵΪ"+d);
		int max;
		if(a >= b){
		max = a;
		}else {
		max = b;
		}
		System.out.println("���ֵΪ"+max);
		}
}
