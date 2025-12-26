public class Point {
    public int x;
    public int y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public Point(){
        this(0,0);
    }
    public double distanceTo(Point other){
        return Math.sqrt(
                Math.pow(this.x - other.x,2) +
                Math.pow(this.y - other.y,2)
        );
    }
    public static double distanceTo(Point a,Point b){
        return Math.sqrt(
                Math.pow(a.x - b.x,2) +
                Math.pow(a.x - b.y,2)
        );
    }

    public void translate(int dx,int dy){
        this.x += dx;
        this.y += dy;
    }
    
    public static void main(String[] args){
        Point p1 = new Point(5,9);
        Point p2 = new Point(-3,3);
        System.out.println(p1.x + " " + p1.y);
        System.out.println(Point.distanceTo(p1,p2));
    }
}
