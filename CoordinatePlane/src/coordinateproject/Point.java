package coordinateproject;

public class Point {

    private double x ;
    private double y ;
    
    public Point(double x,double y){
    this.x = x ;
    this.y = y ;
    
   }
    
    Point(){
   this.x = 0.0 ;
   this.y = 0.0 ;
    }
    
    double getX(){
    return this.x ;
    }
    double getY(){
     return this.y ;
    }
    
    void setX(double x){
    this.x = x;
    }
    void  setY(double y){
    this.y = y ;
    }
    
   double calculateDistance(Point p){
      double dif_x = this.x - p.getX();
      double dif_y = this.y - p.getY();
      double distance=  Math.sqrt(Math.pow(dif_x, 2) + Math.pow(dif_y, 2)) ;
      return distance ;
    }
}
