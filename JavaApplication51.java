
package javaapplication51;


public class JavaApplication51 {

  
    public static void main(String[] args) {
       char[][] studentAnswers = answers();
       printMatrix(studentAnswers);
       int [] checkedAnswers = checkingAnswers(studentAnswers);
       displayAll(checkedAnswers,letterGrade(checkedAnswers));
    }
    
    
    static char[][] answers(){
    char [][] studentAnswers = new char[10][5];
         
    for(int row=0 ; row<studentAnswers.length ; row++){
    for(int col=0 ; col<studentAnswers[row].length ; col++){
    studentAnswers[row][col] = (char) (Math.random()*4 + 65);
    }
    }
    return studentAnswers;
    }
    static void printMatrix(char[][] studentAnswers){
    for(int row=0;row<studentAnswers.length; row++){
        System.out.print(row+1 + ".student \t");
    for(int col=0;col<studentAnswers[row].length; col++){
    System.out.print(studentAnswers[row][col] + " ");
    }
    System.out.println();
    }
    }
    
    static int[] checkingAnswers(char[][] studentAnswers){
    int[] grade = new int[studentAnswers.length];
    char[] answerKey={'A','B','C','D','B'};
    
    for(int row=0;row<studentAnswers.length;row++){
        int totalCorrect=0;
        for(int col=0;col<studentAnswers[row].length;col++){
          if(studentAnswers[row][col] == answerKey[col]){
          totalCorrect++;
          }
                 

    }
     grade[row]=totalCorrect *20 ;
  }
    
    return grade;
}

static char[] letterGrade(int[] checkingAnswers){
   char [] letterGrade = new char [checkingAnswers.length];
   
   for(int i=0; i<letterGrade.length ; i++){
   
       if(checkingAnswers[i] > 90 ){
       letterGrade[i] = 'A';
       }
       else if(checkingAnswers[i] > 80){
       letterGrade[i] = 'B' ;
       }
        else if(checkingAnswers[i] > 70){
       letterGrade[i] = 'C' ;
       }
        else if(checkingAnswers[i] >= 60){
       letterGrade[i] = 'D' ;
       }
        else {
       letterGrade[i] = 'F';
       
       }
       
       
   }
    
    
return letterGrade;

}

static void displayAll(int[] checkingAnswers,char[] letterGrade){
    
    for(int i=0; i<checkingAnswers.length ; i++){
    System.out.println(i+1 + ".student   " + checkingAnswers[i] + " puan" + " " + letterGrade[i]);
    }
    

}


}
