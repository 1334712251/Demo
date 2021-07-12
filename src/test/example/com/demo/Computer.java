package test.example.com.demo;

//电脑类
public class Computer {

    public String readSD(SDCard sdCard) {
        if(sdCard == null) {
            throw new NullPointerException("sd card null");
        }
        return sdCard.readSD();
    }

    public void writeSD(SDCard sdCard,String msg) {
        sdCard.writeSD(msg);
    }
}