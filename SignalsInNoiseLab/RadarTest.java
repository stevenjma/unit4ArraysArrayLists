
import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void testRadar()
    {
        Scanner s = new Scanner(System.in);
        
        Radar radar = new Radar(100, 100);
        
        radar.setMonsterLocation(50, 50);
        
        for (int i = 0; i < 100; i++)
        {
            radar.scan();
        }
        radar.isDetected(50, 50);
        
        int total = 0;
        for(int i = 0; i < radar.getNumRows(); i++)
        {
            for (int j = 0; j < radar.getNumCols(); j++)
            {
                if (radar.isDetected(i, j))
                {
                    total+= 1;
                }
            }
        }
        boolean isWorking = false;
        if (total > 4)
        {
            isWorking = true;
        }
        
        assertEquals(100, radar.getNumRows());
        assertEquals(100, radar.getNumCols());
        assertEquals(true, radar.isDetected(50, 50));
        assertEquals(true, isWorking);
    }

}
