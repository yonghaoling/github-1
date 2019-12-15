package bao;
/*
* 有一个命令解析程序，该程序提供三个功能选型供用户选择，
* 用户选择某功能后，程序在界面上输出用户所选择的的功能名称。
*/
import java.util.Scanner;

public class LX5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请选择功能：1.显示全部记录 2.查询登录记录 0.退出");
		int command = scanner.nextInt();
		scanner.close();
		switch (command) {
		case 0:
		System.out.println("欢迎使用");
		break;
		case 1:
		System.out.println("显示全部记录……");
		break;
		case 2:
		System.out.println("查询登录记录……");
		break;
		default:
		System.out.println("输入错误！");
		}
	}
}
