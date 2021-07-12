package demo6;

// 抽象 builder 类
public abstract class Builder {
    public String s;
    public Bike mBike = new Bike();
    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}