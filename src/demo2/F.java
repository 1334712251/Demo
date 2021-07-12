package demo2;

public class F implements D{
    @Override
    public C createC() {
        return new B();
    }
}
