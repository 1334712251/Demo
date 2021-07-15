package test.example.com.demo1;

public class D extends C {

    private C c;

    public D() {
    }

    public D(C c, int aa, int bb) {
        super(aa, bb);
        this.c = c;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    @Override
    public int cost() {
        return 0;
    }
}
