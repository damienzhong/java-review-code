/*
	键盘录入一个数据n(1<=n<=9)，输出对应的nn乘法表
*/
import java.util.Scanner;
public class FunctionTest3{
	public static void main(String[] args){
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入n的值（1~9）:");
		int n = sc.nextInt();
		while(n<1||n>9){
			System.out.print("您输入的数据不再有效范围内，请重新输入：");
			n = sc.nextInt();
		}
		//调用
		printNN(n);
	}
	
	/*
		两个明确：
			返回值类型：void
			参数列表：int n
	*/
	public static void printNN(int n){
		for(int x=1;x<=n;x++){
			for(int y=1;y<=x;y++){
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
}
/*
	键盘录入两个数据n与m，然后用方法输出n行m列的星星
*/