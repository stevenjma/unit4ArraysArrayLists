import java.util.Arrays;

/**
 * Write a description of class ArrayMethods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayMethods
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[] values;

    /**
     * Default constructor for objects of class ArrayMethods
     */
    public ArrayMethods(int[] initialValues)
    {
        // initialise instance variables
        values = initialValues;
    }

    public void swapFirstandLast()
    {
        int temp = values[0];
        values[0] = values[values.length];
        values[values.length] = temp;
    }
    
    public void shiftRight()
    {
        int temp = values[values.length];
        for (int i = 1; i <= values.length; i++)
        {
            values[i] = values[i - 1];
        }
        values[0] = temp;
    }
    
    public void replaceZeroes()
    {
        for (int i = 0; i <= values.length; i++)
        {
            if( values[i] % 2 == 0)
            {
                values[i] = 0;
            }
        }
    }
    
    public void largest()
    {
        for (int i = 0; i <= values.length; i++)
        {
            if (i == 0)
            {
                values[i] = values[i + 1];
            }
            else if (i == values.length)
            {
                values[i] = values[i - 1];
            }
            else
            {
                if (values[i - 1] > values[i + 1])
                {
                    values[i] = values[i - 1];
                }
                else
                {
                    values[i] = values[i + 1];
                }
            }
        }
    }
    
    public void removeMiddle()
    {
        if (values.length % 2 == 0)
        {
            int num = (values.length / 2);
            for(int i = 0; i <= values.length; i++)
            {
                if (i != num && i != num + 1)
                {
                    values[i] = values[i];
                }
                else if (i == num)
                {
                    values[i] = values[num - 1];
                }
                else
                {
                    values[i] = values[num];
                }
            }
        }
        else
        {
            int num = (values.length / 2);
            for(int i = 0; i <= values.length; i++)
            {
                if (i != num && i != num + 1)
                {
                    values[i] = values[i];
                }
                else
                {
                    values[i] = values[num];
                }
            }
        }
    }

    public void moveEven()
    {
        for (int i = 0; i <= values.length; i++)
        {
            if (values[i] % 2 == 0)
            {
                for( int num = 0; num <= i; num++)
                {
                    int temp = values[num + 1];
                    values[num + 1] = values[num];
                    
                }
                values[i] = values[0];
            }
        }
    }
    
    public int secondLargest()
    {
        int greatest = 0;
        for (int i = 0; i <= values.length; i++)
            if (values[i] > greatest)
            {
                for( int num = 0; num <= i; num++)
                {
                    int temp = values[num + 1];
                    values[num + 1] = values[num];
                    
                }
                values[i] = values[0];
            }
        return values[1];
    }
    
    public boolean increasingOrder()
    {
        boolean isTrue = true;
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] > values[i + 1])
            {
               isTrue = false;
            }
        }
        return isTrue;
    }
    
    public boolean adjacentEquivalents()
    {
        boolean isTrue = false;
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] == values[i + 1])
            {
               isTrue = true;
            }
        }
        return isTrue;
    }
    
    public boolean equivalents()
    {
        boolean isTrue = false;
        for (int i = 0; i <= values.length; i++)
        {
            for (int num = 0; num <= values.length; num++)
            {
                if (values[i] == values[num])
                {
                    isTrue = true;
                }
            }
        }
        return isTrue;
    }
}
