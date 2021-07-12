package demo2;

public class E implements D{
    @Override
    public C createC() {
        return new A();
    }
}
