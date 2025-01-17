/*
	成员内部类
		如何直接访问内部类的成员？
		外部类名.内部类名 对象名 = 外部类对象.内部类对象;
*/
class Outer{
	private int num = 10;
	
	class Inner{
		public void show(){
			System.out.println(num);
		}
	}
}

public class InnerClassDemo2{
	public static void main(String[] args){
		//Inner i = new Inner();
		//i.show();
		//Outer o = new Outer();
		//o.new Inner().show();
		//外部类名.内部类名 对象名 = 外部类对象.内部类对象;
		Outer.Inner i = new Outer().new Inner();
		i.show();
	}
}