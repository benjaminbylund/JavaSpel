import java.awt.*;

public class Platform extends CollisionObject {

    int h;
    int w;

    public Platform(int x, int y, int w, int h){
        super(x, y);
        this.h = h;
        this.w = w;
    }

    static Platform[] defaultPlatforms = {new Platform(300, 600,200,50),
            new Platform(800,500,200,50),
            new Platform(1300, 650,200,50),
             new Platform(1, 800, 10000, 200)};

    @Override
    public void draw(Graphics g) {
        g.fillRect(this.x, this.y, this.w, this.h);

    }

    public void update(){
        return;

    }
}


