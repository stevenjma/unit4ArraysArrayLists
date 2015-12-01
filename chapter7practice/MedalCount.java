
public class MedalCount
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;
    
    int [] [] counts = 
    {
        {1, 0, 1},
        {1, 1, 0},
        {1, 0, 0},
        {0, 0, 1},
        {0, 1, 1},
        {1, 1, 1},
        {0, 1, 0}
    };
    public MedalCount()
    {
        //alternative way to initialize 2D array
        // counts = new int[COUNTRIES][MEDALS];
            
    }
    
    public String toString()
    {
        String str = "";
        
        for (int i = 0; i < counts.length; i++)
        {
            for (int j = 0; j < counts[0].length; j++)
            {
                str += counts[i][j] + "\t";
            }
            System.out.println();
        }
        return str;
    }

    public int medalCount(int countryIndex)
    {
        int total = 0;
        for (int j = 0; j < counts[countryIndex].length; j++)
        {
            total += counts[countryIndex][j];
        }
        
        return total;
    }
   
    public int countPerMedal(int MedalIndex)
    {
        int total = 0;
        for (int i = 0; i < counts.length; i++)
        {
            total+= counts[i][MedalIndex];
        }
        return total;
    }
}
