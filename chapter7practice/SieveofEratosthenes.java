import java.util.Scanner;

/**
 * Write a description of class SieveofEratosthenes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SieveofEratosthenes
{
    /** description of instance variable x (add comment for each instance variable) */
    private int length;
    private int[] x;
    /**
     * Default constructor for objects of class SieveofEratosthenes
     */
    public SieveofEratosthenes(int length)
    {
        // initialise instance variables
        this.length = length;
        x = new int[length];    

    }
        

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void assignNumbers()
    {
        for (int i = 0; i < x.length; i++)
        {
            x[i] = i + 2;
        }
    }

    public void determinePrimes()
    {
        for (int i = 2; i < x.length; i+=2)
        {
            x[i] = 0;
        }
        for (int i = 4; i < x.length; i+=3)
        {
            x[i] = 0;
        }
        for (int i = 8; i < x.length; i+=5)
        {
            x[i] = 0;
        }
        for (int i = 12; i < x.length; i+=7)
        {
            x[i] = 0;
        }
    }
    
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of terms.");
        int num = s.nextInt();
        SieveofEratosthenes a = new SieveofEratosthenes(num);
        a.assignNumbers();
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a.x[i]);
        }
        a.determinePrimes();
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a.x[i]);
        }
    }
}