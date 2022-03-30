package Activity_1;
import java.util.Scanner;
    class Binarytodecimal{
    public static void main(String [] args){
          Scanner input = new Scanner(System.in);
           System.out.println("Enter Binary num:");
          String BinaryNumber=input.nextLine();
          
          int DecimalNumber= Integer.parseInt(BinaryNumber,2); 
          System.out.println("Decimal num is:"+DecimalNumber);
    }
    }
