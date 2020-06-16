import java.util.Scanner;

public class ValidatesCreditCard {
    
    public static void main(String[] args) {
        
        String cardNo = "";
        int sum1 = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 8-digit Card number :");
        cardNo = scan.nextLine();
        
        for(int i=7; i>0; i-=2 ){
           int temp =  cardNo.charAt(i) - '0';
           sum1 += temp;
  
        }
        System.out.print("\n sum :" + sum1);
    }
}
