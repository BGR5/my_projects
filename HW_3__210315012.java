//Buğra Kafa 210315012
package hw_2__210315012;


public class HW_3__210315012 {

    
    public static void main(String[] args) {
        int[][] workHours = createWorkersArray();
        System.out.println("The workers' weekly hours are");
        displayArray(workHours);
        
        double[][] averageHours = calculateAverageHours(workHours);
         System.out.println("\n\nThe workers' weekly average hours are");
        displayAvg(averageHours);
        
        int[][] salary =createSalary(workHours);
        System.out.println("\n\nSalary of workers");
        displaySalary(salary);
                
       
      
    }
    
    static int[][] createWorkersArray(){
       
        int[][] workersArray = new int[10][7] ;
        
        for (int row=0; row<workersArray.length; row++){
          
        for(int col=0; col<workersArray[row].length; col++){
        workersArray[row][col] = (int)(Math.random()* 9 + 1); 
        }
         }
        
        return workersArray;
         }
    
    static void displayArray (int[][] workersArray){
    
   System.out.print("Days           Su  M  T  W  Th  F  S\n");
    
    
    
        for(int row=0; row< workersArray.length   ; row++){
            System.out.print("Employee" + (row+1) + "\t");
        for(int col=0; col< workersArray[row].length  ; col++){
        System.out.print(workersArray[row][col] + "  ");
        }
        System.out.println();
        }
        
        
        
      }
    
    static double[][] calculateAverageHours(int[][] workHours){
        double[][] weeklyAvgWorking = new double [10][1];
        
        
      for(int row=0; row< workHours.length   ; row++){
          double total=0;
          double avg;
           for(int col=0; col< workHours[row].length  ; col++){
         total += workHours[row][col];
        }
           avg = total / 7;
         weeklyAvgWorking[row][0]= avg;
          
      
} 
      return weeklyAvgWorking;
    }

    
    static void displayAvg(double[][] averageHours ){
    
        
        
         for(int row=0; row< averageHours.length   ; row++){
            System.out.print("Employee" + (row+1) + "\t");
        for(int col=0; col< averageHours[row].length  ; col++){
        System.out.print(averageHours[row][col] + "  ");
        }
        System.out.println();
        }
         
         
         }
    
    static int[][] createSalary(int[][] workHours){
     int[][] salaryOfWorkers = new int[10][1];
       for (int row=0; row<workHours.length; row++){
          int total=0;
        for(int col=0; col<workHours[row].length; col++){
        total += workHours[row][col] ;
        
        }
        if(total > 35){
        salaryOfWorkers[row][0]= 2500 + ((total - 35) * 100) ;}
         
       else{ salaryOfWorkers[row][0]= 2500;}
        
       }
        
    return salaryOfWorkers;
    }
    
    static void displaySalary(int[][] salaryOfWorkers){
    
        for(int row=0; row<salaryOfWorkers.length ;row++){
            System.out.print("Employee" + (row+1) + "\t");
        for(int col=0; col<salaryOfWorkers[row].length ; col++){
        System.out.print(salaryOfWorkers[row][col] + " TL");
        }
        System.out.println();
        }
    
    }
    
}
