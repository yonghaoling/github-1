package bao;

import java.util.Scanner;

public class LX4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������(0~100)��");
		double score = scanner.nextDouble();
		scanner.close();
		if(score < 0 || score >100){
		System.out.println("����ķ�������0~100֮�䣬������Ҫ��");
		}else if(score >= 90){
		System.out.println("A");
		}else if(score >= 80){
		System.out.println("B");
		}else if(score >= 60){
		System.out.println("C");
		}else{
		System.out.println("D");
		}
	}
}
