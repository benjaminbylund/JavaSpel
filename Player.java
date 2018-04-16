import java.awt.*;

public class Player extends CollisionObject {
    int x;
    int y;
    int width;
    int height;
    int hp;


    // Getters and Setters


    public Player(int x, int y, int width, int height, int hp){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.hp = hp;

        this.collider = new Rectangle(x, y, width, height);
    }

    @Override
    public void update() {
        collider.x = this.x;
        collider.y = this.y;
        y -= 9;
        y += 27;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }
}
