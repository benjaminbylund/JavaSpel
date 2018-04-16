import java.awt.*;

public class CollisionObject extends GameObject{
    int x = 0, y = 0;

    public Rectangle collider;

    public CollisionObject(){

    }


    public CollisionObject(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        new CollisionObject(5, 3);
        new CollisionObject();
    }
}
