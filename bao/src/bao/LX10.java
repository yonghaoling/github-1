package bao;

public class LX10 {
	public static void main(String[] args) {
		//i�������ڿ�������
		for(int i = 0; i <= 9; i++) {
		//j�������ڿ���ÿ���в���������ֵ
			for(int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
				}
			//ÿ�����֮����Ҫ����
			System.out.println();
			}
		}
}
