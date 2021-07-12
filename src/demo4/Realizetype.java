package demo4;

public class Realizetype implements Cloneable {

    Integer a;
    String b;

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        return (Realizetype) super.clone();
    }
}