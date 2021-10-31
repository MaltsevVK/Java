public class Main {
    public static void main(String[] args) {
        MovablePoint a1 = new MovablePoint(0, 0, 1, 1);
        System.out.println(a1);
        a1.moveLeft();
        a1.moveUp();
        System.out.println(a1);

        MovableCircle a2 = new MovableCircle(0, 0, 1, 1, 2);
        System.out.println(a2);
        a2.moveDown();
        a2.moveRight();
        System.out.println(a2);

        MovableRectangle a3 = new MovableRectangle(0, 0, 1, 1, 1, 1);
        System.out.println(a3);
        a3.moveRight();
        a3.moveRight();
        a3.moveDown();
        a3.moveLeft();
        System.out.println(a3);
    }
}