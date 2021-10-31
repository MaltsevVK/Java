public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString() {
        return "MovablePoint ("+x+", "+y+")";
    }
    @Override
    public void moveUp() {
        x++;
    }
    public void moveDown() {
        x--;
    }
    public void moveRight() {
        y++;
    }
    public void moveLeft() {
        y--;
    }
}