public class Point {
    public float x,y; 
    // public Point(float x, float y){
    //     this.x=x;
    //     this.y=y;
    // }
    public Point(){

    }
    
}
class Segment{
    public Point p1,p2;
    //  public Segment(Point p1,Point p2){
    //      this.p1=new Point();
    //      this.p2= new Point();
    //  }
    public Segment(){
        p1 = new Point();
        p2 = new Point();
    }
}
class Triangle{
     Segment AB,BC,CA;
     public Triangle(){
        this.AB = new Segment();
        this.BC= new Segment();
        this.CA = new Segment();
     }
    
     double getLength(Segment s){
       return Math.sqrt(Math.pow(s.p1.x-s.p2.x, 2)+Math.pow(s.p1.y-s.p2.y, 2));
     }
     double perimeter(){
         return getLength(this.AB) + getLength(this.BC) + getLength(this.CA);
     }
}
class Main {

    public static void main(String[] args) {
        Triangle tri = new Triangle();
        //coor of point A
        tri.AB.p1.x=0;
        tri.AB.p1.y=0;
        //coor of point B
        tri.AB.p2.x=4;
        tri.AB.p2.y=0;

        
        tri.BC.p1= tri.AB.p2;

        // coor of point C
        tri.BC.p2.x=2;
        tri.BC.p2.y=4;

        tri.CA.p1=tri.BC.p2;
        tri.CA.p2=tri.AB.p1;


        // tri.CD.p1 = tri.AB.p1;
        // tri.CD.p2= tri.BC.p1;

        System.out.println("perimeter: "+tri.perimeter());

    }
}
