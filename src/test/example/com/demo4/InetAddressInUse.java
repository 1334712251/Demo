package test.example.com.demo4;


import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InetAddressInUse extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        super.keyPressed(e);
    }

    public static void main(String[] args) throws Exception {


        Robot robot = new Robot();
        Thread.sleep(10000);
        for (int i=0;i<100;i++){
            robot.keyPress(KeyEvent.VK_RIGHT);
        }
    }
}
