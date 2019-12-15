package bao;
/*随机产生一个从0-100之间的整数，判断是否是质数*/
import java.util.Random;

public class LX11 {
	public static void main(String[] args) {
		int num;
		Random random = new Random();
		num = random.nextInt(100);
		System.out.println("随机产生的数为：" + num);
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
