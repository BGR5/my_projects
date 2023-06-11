
package coordinateproject;


public class Line {
    
    private Point p1 ;
    private Point p2;
    private double length ;
    
    
    public Line(){
    this.p1 = new Point(0,0) ;
    this.p2 = new Point(0,0);
    this.length = this.p1.calculateDistance(this.p2) ;
    }
    
    public Line(Point p1 , Point p2 ){
    this.p1 = p1;
    this.p2 = p2;
    this.length = p1.calculateDistance(p2);
    }
    
    public Point getP1(){
        return this.p1 ;
    }
    public Point getP2(){
         return this.p2;
    }
    
    public double getLength(){
    return this.length;
    }
    
    public void setP1(Point p1){
        this.p1 = p1 ;
        this.length = p1.calculateDistance(p2) ;
    }
    
    public void setP2(Point p2){
      this.p2 = p2 ;
      this.length = p2.calculateDistance(p1) ;
    }
}
