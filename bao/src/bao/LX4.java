package bao;

import java.util.Scanner;

public class LX4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入分数(0~100)：");
		double score = scanner.nextDouble();
		scanner.close();
		if(score < 0 || score >100){
		System.out.println("输入的分数不在0~100之间，不符合要求");
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
