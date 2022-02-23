import java.util.Scanner;
public class Calculator {
    public static void main(String args[])
    {
        int a,b,c,ch;
        System.out.println("Enter any two number :");
        Scanner s1=new Scanner(System.in);
        a=s1.nextInt();
        b=s1.nextInt();
        System.out.println("Enetr your choice");
        ch=s1.nextInt();
        switch (ch) {
            case 1:c=a+b;
              System.out.println("Addition"+c);
              break;
             case 2:c=a-b;
              System.out.println("Subtraction"+c);
              break;
             case 3:c=a*b;
              System.out.println("Multiplication"+c);
              break;
             case 4: c=a/b;
              System.out.println("Division"+c);
              break;
             default:
             System.out.println("Invalid choice");
        }
    }
    
}
