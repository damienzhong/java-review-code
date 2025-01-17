/*
	方法:完成特定功能的代码
	
	注意:在很多语言里面有函数的定义，而在Java中函数被称为方法。
	
	方法格式：
		修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2，...){
			方法体语句;
			return 返回值;
		}
		
	详细解释：
		修饰符：目前就用public static 。后面我们再详细的讲其他修饰符
		返回值类型：就是功能结果的数据类型
		方法名：符合命名规则即可。方便我们调用
		参数：
			实际参数（实参）：就是实际参与运算的
			形式参数（形参）：就是方法定义上的，用于接收事件参数
		参数类型：就是参数的数据类型
		参数名：就是变量名
		方法体语句：就是完成功能的代码
		return：结束方法的
		返回值：就是功能的结果，由return带给调用者
		
	要写好一个方法，就必须明确两个东西：
		A：返回值类型
			结果的数据类型
		B：参数列表
			你要传递几个参数，以及每个参数的数据类型
			
	题目：求两个数据之和
	
	方法的执行特点：
		不调用，不执行
		
	如何调用？（有明确返回值的调用）
		A：单独调用， 一般来说没有意义，所以不推荐。
		B：输出调用，但是不够好。因为我们可能需要针对结果进行进一步的操作
		C：赋值调用,推荐方案
*/
public class FunctionDemo{
	public static void main(String[] args){
		int a=10;
		int b=20;
		
		int result = sum(10,20);
		System.out.println(result-10);
	}
	
	public static int sum(int a,int b){
		
		return a+b;
	}
}