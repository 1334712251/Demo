package test.example.com.demo;

//测试类
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));

        System.out.println("------------");

        SDAdapterTF adapter = new SDAdapterTF();
        System.out.println(computer.readSD(adapter));

        System.out.println("ppppppppppppppppp");
        computer.writeSD(adapter,"Ss");
//        System.out.println(computer.writeSD());
    }
}