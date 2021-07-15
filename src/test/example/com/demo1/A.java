package test.example.com.demo1;

public class A extends C{

    public A() {
        super(1,8);
    }

    @Override
    public int cost() {
        return super.getAa()+super.getBb();
    }
}
