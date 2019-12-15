package bao;
import java.util.Scanner;
public class LX1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请依次输入两个整数：a,b（以空格隔开）");
		/*比较两个数的大小*/
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		int d=(a>b)?a:b;
		System.out.println("最大值为"+d);
		int max;
		if(a >= b){
		max = a;
		}else {
		max = b;
		}
		System.out.println("最大值为"+max);
		}
}
