package bao;

import java.util.Arrays;
import java.util.Random;
/*
* ���⣺�������10����0-100֮�����������������Сֵ��
* �����������ݳ������飬����Сֵ����������ĵ�һ��λ�á�
* ���裺
* 1.����һ������Ϊ10�����飬����Random�������10��0-100֮���������
* 2.Ѱ����Сֵ������forѭ��
* 3.���� ����Arrays.coprOf()���������飬���䳤������Ϊ11
* 4.���������飬�Ӻ���ǰ�������Դ˸�ֵ��Ȼ��2���ҵ�����Сֵ��������ĵ�һ��
*  */
public class LX12 {
	public static void main(String[] args) {
		int [] arr = new int[10];
		//�������10�� 0-100֮�������
		Random random = new Random();
		for(int i = 0; i < 10; i ++) {
		arr[i] = random.nextInt(100);
		}
		//��ӡ���������
		System.out.println("�������������Ϊ��" + Arrays.toString(arr));
		//������С��ֵ
		int min = arr[0];
		for(int j = 1; j < 10; j ++) {
		if(min > arr[j]) {
		min = arr[j];
		}
		}
		System.out.println("��������С��ֵΪ��" + min);
		//���ݣ�����Сֵ��������֮��ĵ�һ��
		int [] newArr = Arrays.copyOf(arr, 11);
		//�Ӻ���ǰ��������ǰ���ֵ���������ֵ��Ȼ�󽫵�һ����ֵ��Ϊ��Сֵmin
		for(int k = newArr.length-1; k >=1; k --) {
		newArr[k] = newArr[k-1];
		}
		//����һ����ֵ��Ϊ��Сֵmin
		newArr[0] = min;
		//��ӡ���������
		System.out.println("����֮�������Ϊ��"+ Arrays.toString(newArr));
		}
}
