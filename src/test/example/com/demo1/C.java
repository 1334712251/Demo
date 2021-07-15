package test.example.com.demo1;

public abstract class C {

    public C() {
    }

    public C(int aa, int bb) {
        this.aa = aa;
        this.bb = bb;
    }

    private int aa;

    private int bb;

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }

    public int getBb() {
        return bb;
    }

    public void setBb(int bb) {
        this.bb = bb;
    }

    public abstract int cost();
}
