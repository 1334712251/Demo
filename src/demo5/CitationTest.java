package demo5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CitationTest {
    public static void main(String[] args) throws Exception {
        Student stu = new Student();
        A a = new A();
        //Citation citation1 = new Citation(1,"s",1,a,stu);
        Citation citation1 = new Citation(1, "s", 1, a);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\13347\\Desktop\\b.txt"));
        //将c1对象写出到文件中
        oos.writeObject(citation1);
        oos.close();

        //创建对象出入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\13347\\Desktop\\b.txt"));
        //读取对象
        Citation citation2 = (Citation) ois.readObject();

        System.out.println(citation1==citation2);          //false
        System.out.println(citation1.i==citation2.i);     //true
        System.out.println(citation1.s==citation2.s);    //false
        System.out.println(citation1.integer==citation2.integer);   //false
        System.out.println(citation1.a==citation2.a);    //false
        System.out.println(citation1.getStu()==citation2.getStu());    //false
    }
}
