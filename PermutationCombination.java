import java.util.Scanner;
public class PermutationCombination {
    static long Factorial(int num)
    {
    int f =1;
    for(int i=1;i<=num;i++){
        f*=i;
    }
    return f;
   }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=in.nextInt();
        System.out.println("Enter the value of r :");
        int r = in.nextInt();
        int p =(int)(Factorial(n)/Factorial(n-r));
        int c=(int)(Factorial(n)/Factorial(n-r)*Factorial(r));
        System.out.println("permutation ="+p);
        System.out.println("Combination="+c);
    }    
}
