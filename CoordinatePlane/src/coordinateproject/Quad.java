
package coordinateproject;


public class Quad {
    private Point p1 ;
    private Point p2 ;
    private Point p3 ;
    private Point p4 ;
    private Line l1 ;
    private Line l2 ;
    private Line l3 ;
    private Line l4 ;
    
    public Quad(){
    this.p1 = new Point(0,0);
    this.p2 = new Point(0 ,1);
    this.p3 = new Point(1,1);
    this.p4 = new Point(1,0);
    this.l1 = new Line (this.p1,this.p2);
    this.l2 = new Line (this.p2,this.p3);
    this.l3 = new Line (this.p3,this.p4);
    this.l4 = new Line (this.p4,this.p1);
            }
    
    public Point getP1(){
    return this.p1;
    }
    
    
}
