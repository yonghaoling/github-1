package bao;

import java.util.Arrays;
import java.util.Random;
/*
* 问题：随机产生10个从0-100之间的整数，并查找最小值；
* 将该数组扩容成新数组，把最小值存在新数组的第一个位置。
* 步骤：
* 1.构造一个长度为10的数组，利用Random随机产生10个0-100之间的整数；
* 2.寻找最小值，利用for循环
* 3.扩容 利用Arrays.coprOf()构造新数组，将其长度设置为11
* 4.遍历新数组，从后往前遍历，以此赋值，然后将2中找到的最小值存在数组的第一个
*  */
public class LX12 {
	public static void main(String[] args) {
		int [] arr = new int[10];
		//随机产生10个 0-100之间的整数
		Random random = new Random();
		for(int i = 0; i < 10; i ++) {
		arr[i] = random.nextInt(100);
		}
		//打印数组的内容
		System.out.println("随机产生的数组为：" + Arrays.toString(arr));
		//查找最小的值
		int min = arr[0];
		for(int j = 1; j < 10; j ++) {
		if(min > arr[j]) {
		min = arr[j];
		}
		}
		System.out.println("该数组最小的值为：" + min);
		//扩容，将最小值存在扩容之后的第一个
		int [] newArr = Arrays.copyOf(arr, 11);
		//从后往前遍历，将前面的值赋给后面的值，然后将第一个的值赋为最小值min
		for(int k = newArr.length-1; k >=1; k --) {
		newArr[k] = newArr[k-1];
		}
		//将第一个的值赋为最小值min
		newArr[0] = min;
		//打印数组的内容
		System.out.println("扩容之后的数组为："+ Arrays.toString(newArr));
		}
}
