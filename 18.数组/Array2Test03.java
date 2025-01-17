/**
	需求：打印杨辉三角形(行数可以键盘录入)
	
	1
	1 1	
	1 2 1
	1 3 3 1
	1 4 6 4 1 
	1 5 10 10 5 1
	
	分析：看图像的规律
		A：任何一行的第一列和最后一列都是1
		B：从第三行开始，每一个数据是它上一行的前一列和它上一行的本列之和

	步骤：
		A：首先定义一个二维数组。行数如果是n,我们把列数也定义为n。
			这个n的数据来自于键盘录入
		B：给这个二维数组任何一行的第一列和最后一列赋值为1
		C：按照规律给其他元素赋值
			从第三行开始，每一个数据是它上一行的前一列和它上一行的本列之和
		C：遍历这个二维数组
*/
import java.util.Scanner;
public class Array2Test03{
	public static void main(String[] args){
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//这个n的数据来自于键盘录入
		System.out.println("请输入一个数据：");
		int n = sc.nextInt();
		
		//定义一个二维数组
		int[][] arr = new int[n][n];
		
		//给这个二维数组任何一行的第一列和最后一列赋值为1
		for(int x = 0;x<arr.length;x++){
			arr[x][0] = 1;//任何一行的第一列
			arr[x][x] = 1;//任何一行的最后一列
		}

		//从第三行开始，每一个数据是它上一行的前一列和它上一行的本列之和
		for(int x=2;x<arr.length;x++){
			for(int y=1;y<=x-1;y++){
				arr[x][y] = arr[x-1][y-1]+arr[x-1][y];
			}
		}
		
		//遍历二维数组
		/*for(int x=0;x<arr.length;x++){
			for(int y=0;y<arr[x].length;y++){
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}*/
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<=x;y++){
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
	}
}