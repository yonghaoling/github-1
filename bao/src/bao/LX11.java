package bao;
/*�������һ����0-100֮����������ж��Ƿ�������*/
import java.util.Random;

public class LX11 {
	public static void main(String[] args) {
		int num;
		Random random = new Random();
		num = random.nextInt(100);
		System.out.println("�����������Ϊ��" + num);
		System.out.println(isPrime(num));
		}
		public static boolean isPrime(int num) {
		if(num < 2) {
		return false;
		}
		if(num == 2) {
		return true;
		}
		if(num % 2 == 0) {
		return false;
		}
		for(int i = 3; i <= Math.sqrt(num); i += 2) {
		if(num % i == 0) {
		return false;
		}
		}
		return true;
		}
}
