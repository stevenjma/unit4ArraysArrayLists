public class PartialArray
{
    private int[] values;
    private int currentSize;
    
    public PartialArray()
    {
        this.values = new int[100];
        for( this.currentSize = 0; this.currentSize < 20; this.currentSize++)
        {
            values[currentSize] = currentSize * currentSize;
        }
    }
    
    public void remove( int pos)
    {
        for( int i = pos; i < this.currentSize; i++)
        {
            this.values[i-1] = this.values[i];
        }
        currentSize--;
    }
    
    public void insert(int pos, int value)
    {
        if (this.currentSize == this.values.length)
        {
            this.growArray();
        }
        currentSize++;
        for (int i = currentSize - 1; i > pos; i--)
        {
            this.values[i] = this.values[i - 1];
        }
        this.values[pos] = value;
    }
    
    public void swap( int posA, int posB )
    {
        int temp = this.values[posA];
        this.values[posA] = this.values[posB];
        this.values[posB] = temp;
    }
    
    private void growArray()
    {

        int[] newArray = new int[this.currentSize * 2];
        for (int i = 0; i < this.currentSize; i++)
        {
            newArray[i] = this.values[i];
        }
        
        this.values = newArray;
    }
    
    public static void main(String [] args)
    {
        
    }
}