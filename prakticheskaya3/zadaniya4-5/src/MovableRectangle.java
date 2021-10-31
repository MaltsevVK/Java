public class MovableRectangle implements Movable {
    private MovablePoint topleft;
    private MovablePoint bottomright;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topleft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomright = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    @Override
    public String toString() {
        return "MovableRectangle ("+ bottomright.x+", "+ bottomright.y+"), ("+ topleft.x+", "+ topleft.y+")";
    }
    @Override
    public void moveUp() {
        topleft.moveUp();
        bottomright.moveUp();
    }
    public void moveDown() {
        topleft.moveDown();
        bottomright.moveDown();
    }
    public void moveRight() {
        topleft.moveRight();
        bottomright.moveRight();
    }
    public void moveLeft() {
        topleft.moveLeft();
        bottomright.moveLeft();
    }
}