package test.example.com.test;

//测试类
public class Client {
    public static void main(String[] args) {
        //点一份炒饭
        FastFood food = new FriedRice();
        //花费的价格
        System.out.println(food.getDesc() + " " + food.cost() + "元");

         food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost() + "元");

        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost() + "元");
    }
}