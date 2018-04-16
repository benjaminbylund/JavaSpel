import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GameMain implements Runnable {
    int width = 1920;
    int height = 1080;
    int x = 10;
    int y = 10;


    Player player;
    Thread t;

    private boolean isRunning = false;
    private BufferStrategy bs;
    private Graphics g;
    private Display display;
    private final long fps = 1000000000/60;
    private long dt = 0;


    public GameMain(){
        this.display = new Display();
        player = new Player(100, 100, 25, 100, 3);
    }

    public static void main(String[] args) {
        GameMain gm = new GameMain();
        gm.start();

    }

    public synchronized void start(){ // startar spelet
        isRunning = true;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() { // kollar tiden
        long now, start;
        now = System.nanoTime();
        while (isRunning){
            start = System.nanoTime();
            update();
            draw();
            now = System.nanoTime();
            dt +=  start - now; //skillnaden i tid
        }
    }

    private void update() {
        while(dt > fps ){
            dt -= fps;
        }

    }

    private void draw(){
        bs = display.getBufferStrategy();
        if(bs == null){
            display.createBufferStrategy(2);
            return;
        }

        g = bs.getDrawGraphics();

        player.draw(g);
        drawPlatform(g);

        bs.show();
        g.dispose();
    }

    private void drawPlatform(Graphics g) {
        g.setColor(Color.MAGENTA);
        for(Platform p : Platform.defaultPlatforms){
            g.fillRect(p.x, p.y, p.w, p.h);
        }
    }
}

