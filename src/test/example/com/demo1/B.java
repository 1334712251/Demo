package test.example.com.demo1;

public class B extends C{

    public B() {

        super(5,6);
    }

    @Override
    public int cost() {
        return super.getAa()+super.getBb();
    }
}
