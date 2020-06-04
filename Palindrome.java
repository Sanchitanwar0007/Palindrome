import java.util.Scanner;



public class Palinndrome {

    
    public static boolean isPalindrome(int number){
        int x=number;
        if(number<0){  // if number is -ve then its never make palindrome
            return false;
            
        }
        int pal=0;
        while(number>0){
            pal=pal*10+number%10;
            number=number/10;
            
        }
        if(x==pal){
            return true;
        }
        return false;
    }
        
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int number= scan.nextInt();
      System.out.println(isPalindrome(number));
    
    }
    
}
// Taking O(logn) time
//Sanchit Kumar 