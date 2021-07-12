package demo4;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype r1 = new Realizetype();
        Realizetype r2 = r1.clone();
        System.out.println(r1.a == r2.a);
        System.out.println(r1.b == r2.b);
        System.out.println("对象r1和r2是同一个对象？" + (r1 == r2));
    }
}
