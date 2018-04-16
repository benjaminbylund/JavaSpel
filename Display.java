import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Display extends Canvas implements KeyListener{

    JFrame frame;
    int width = 1920;
    int height = 1080;
    int playerY = 540;
    int playerX = 960;


    public Display() {
        super();
        this.frame = new JFrame("Rikkitikki");
        this.frame.setSize(new Dimension(width, height));
        this.frame.add(this);
        this.frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.frame.setVisible(true);
        this.addKeyListener(this);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_LEFT){
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
        }
        if(e.getKeyCode() == KeyEvent.VK_UP){
        }
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}


