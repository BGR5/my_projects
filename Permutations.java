package permutations;

public class Permutations {

   
    public static void main(String[] args) {
String str= "ABCDEF" ;
String str1 = "" ;




for( int i=0 ; i<6 ; i++){
    str1 += str.charAt((int)(Math.random() * 6)) ;

}
System.out.println(str1);
      
    
}
}