public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    @Override
    public String toString() {
        return "MovableCircle ("+ center.x+", "+ center.y+"), with radius = "+radius;
    }
    @Override
    public void moveUp() {
        center.moveUp();
    }
    public void moveDown() {
        center.moveDown();
    }
    public void moveRight() {
        center.moveRight();
    }
    public void moveLeft() {
        center.moveLeft();
    }
}