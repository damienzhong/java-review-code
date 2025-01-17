package damien.generic;

import damien.array.Student;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 结合泛型遍历集合中的自定义对象
 */
public class GenericTest {
    public static void main(String[] args) {
        //创建集合对象
        //JDK7的新特性：泛型推断
        ArrayList<Student> arrayList = new ArrayList<Student>();

        Student student1 = new Student("呆萌钟", 25);
        Student student2 = new Student("老付", 24);
        Student student3 = new Student("小锐", 22);
        Student student4 = new Student("眨眼睛", 22);
        Student student5 = new Student("Zj", 29);
        Student student6 = new Student("努力", 20);

        //添加元素
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        arrayList.add(student6);

        //遍历
        Iterator<Student> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Student s = iterator.next();
            System.out.println(s);
        }
        System.out.println("-------------------");
        for (int i=0;i<arrayList.size();i++){
            Student student = arrayList.get(i);
            System.out.println(student);
        }
    }
}
