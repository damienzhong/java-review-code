package damien.demo01;

/**
 * StringBuffer的删除功能：
 * public StringBuffer deleteCharAt(int index)：删除指定位置的字符，并返回本身。
 * public StringBuffer delete(int start,int end):删除从指定位置开始到指定位置结束的内容，并返回本身
 */
public class StringBufferDemo3 {
    public static void main(String[] args) {
        //创建对象
        StringBuffer sb = new StringBuffer();

        //添加内容
        sb.append("hello").append("world").append("java");
        System.out.println("sb:"+sb);

        //public StringBuffer deleteCharAt(int index)：删除指定位置的字符，并返回本身。
        //删除e这个字符
//        sb.deleteCharAt(1);
        //删除第一个l字符
//        sb.deleteCharAt(1);
//        System.out.println("sb:"+sb);

        //public StringBuffer delete(int start,int end):删除从指定位置开始到指定位置结束的内容，并返回本身
        //删除world这个字符串
        sb.delete(5,10);//包头不包尾
        //删除所有的数据
        sb.delete(0,sb.length());
        System.out.println("sb:"+sb);
    }
}
