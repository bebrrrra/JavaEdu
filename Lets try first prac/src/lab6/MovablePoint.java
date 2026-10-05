package lab6;

public class MovablePoint {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public

    @Override
    public String toString(){
        return "MovablePoint[x = " + x + ", y = " +
                y + ", xSpeed = " + xSpeed + ", ySpeed = " + ySpeed +
                "]";
    }
}
