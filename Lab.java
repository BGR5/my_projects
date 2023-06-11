//Buğra Kafa 210315012   Q7
package labquiz_210315012;


public class Labquiz_210315012 {

    
    public static void main(String[] args) {
        
        int [][] matrix = generateMatrix();
        printMatrix(matrix);
        even_and_odd(matrix);
        
    }
    
    static void printMatrix(int[][] matrix){
    
        for(int row=0; row<matrix.length ; row++){
          for(int col=0; col<matrix[row].length; col++){
          System.out.print(matrix[row][col] + " ");
          }
          System.out.println();
        }
    }
    
    static int[][] generateMatrix(){
        
        int[][] matrix = new int[10][10];
    for(int row=0; row<matrix.length; row++){
        for(int col=0; col<matrix[row].length; col++){
        matrix[row][col]=(int) (Math.random()*100 + 1);
        }
    
    }
     return matrix;   
    }
    
    static void even_and_odd(int[][] matrix){
    int numberOfEven =0 ,numberOfOdd =0;
       for(int row=0; row<matrix.length ; row++){
        for(int col=0; col<matrix[row].length ; col++ ){
        if(matrix[row][col] % 2 == 0){
        numberOfEven++;
        }
        else{
        numberOfOdd++;
        }
        }
        }
       
       System.out.println("Even = " + numberOfEven);
       System.out.println("odd  = " + numberOfOdd);
       
       
       
        
    
    }
    
}
