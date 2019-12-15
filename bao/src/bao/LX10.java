package bao;

public class LX10 {
	public static void main(String[] args) {
		//i变量用于控制行数
		for(int i = 0; i <= 9; i++) {
		//j变量用于控制每行中参与计算的数值
			for(int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
				}
			//每行输出之后需要换行
			System.out.println();
			}
		}
}
