public class Factorial {
    public static void main(String[]args)
    {
        int num =10;
        long Factorial =1;
        for (int i=1; i<num; i++)
        {
            Factorial *=i;
        }
        System.out.printf("Factorial of %d =%d",num,Factorial);
    }
    
}
