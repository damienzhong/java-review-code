/**
	我要堆数组进行操作
	
	在同一个文件夹下，类定义在两个文件中和定义在一个文件中其实一样的。
	
	如何制作说明书？
		A：写一个工具类
		B：对这个类加入文档注释
		C：用工具解析文档注释
			javadoc工具
		D：格式
			javadoc -d 目录 -author -version ArrayTool.java
			目录：就可以写一个文件夹的路径
*/
public class ArrayDemo{
	public static void main(String[] args){
		//定义一个数组
		int[] arr = {18,23,6,55,21};
		
		//遍历数组
		/*for(int x=0;x<arr.length;x++){
			if(x==arr.length){
				System.out.println(arr[x]);
			}else{
				System.out.print(arr[x]+",");
			}
		}*/
		//如果我有多个数组都要进行遍历，那么，代码的重复都就很高
		//如何改进？用方法改进
		//printArray(arr);
		
		//测试类的作用：创建其他类的对象，调用其他类的功能
		//而我们现在的操作是跟数组相关的，所有，应该把这些操作定义到数组操作类中。
		//定义一个数组的操作类
		//ArrayTool t = new ArrayTool();
		//t.printArray(arr);
		
		//方法改进为静态后，就可以直接通过类名调用
		ArrayTool.printArray(arr);
		System.out.println();
		
		//获取55的索引值
		int index = ArrayTool.getIndex(arr,55);
		System.out.println(index);
		
		//获取数组的最值
		int max = ArrayTool.getMax(arr);
		System.out.println(max);
	}
	
	/*public static void printArray(int[] arr){
		for(int x=0;x<arr.length;x++){
			if(x==arr.length){
				System.out.println(arr[x]);
			}else{
				System.out.print(arr[x]+",");
			}
		}
	}*/
}