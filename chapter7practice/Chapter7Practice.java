import java.util.Arrays;

public class Chapter7Practice
{
    public static void createArray()
    {
        double[] arraything = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println(arraything.length);
        System.out.println(arraything[0]);
        System.out.println(arraything[arraything.length - 1]);
        System.out.println(arraything[arraything.length - 1]);
        for (int i = 0; i < arraything.length; i++)
        {
            System.out.println(arraything[i]);
        }
        for (int i = 0; i < arraything.length; i++)
        {
            System.out.println("Element #" + i + " is " + arraything[i]);
        }
        for (int i = arraything.length - 1; i >= 0; i--)
        {
            System.out.println(arraything[i]);
        }
        for (int i = arraything.length - 1; i >= 0; i--)
        {
            System.out.println("Element #" + i + " is " + arraything[i]);
        }
        for (double element : arraything)
        {
            System.out.println(element);
            
        }
    }
}