// Implements a 2-D array of characters

public class CharMatrix
{
  // Instance variables:
  private char[] [] grid;

  // Constructor: creates a grid with dimensions rows, cols,
  // and fills it with spaces
  public CharMatrix(int rows, int cols)
  {
    this.grid = new char[rows][cols];
    
    for (int i = 0; i < grid.length; i++)
    {
        for (int j = 0; j < grid[i].length; j++)
        {
            grid[i][j] = ' ';
        }
    }
  }

  // Constructor: creates a grid with dimensions rows , cols ,
  // and fills it with the fill  character
  public CharMatrix(int rows, int cols, char fill)
  {
    this.grid = new char[rows][cols];
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            grid[i][j] = fill;
        }
    }
  }

  // Returns the number of rows in grid
  public int numRows()
  {
    return grid.length;
  }

  // Returns the number of columns in grid
  public int numCols()
  {
    return grid[0].length;
  }

  // Returns the character at row, col location
  public char charAt(int row, int col)
  {
    return grid[row][col];
  }

  // Sets the character at row, col location to ch
  public void setCharAt(int row, int col, char ch)
  {
    grid[row][col] = ch;
  }

  // Returns true if the character at row, col is a space,
  // false otherwise
  public boolean isEmpty(int row, int col)
  {
    boolean isEmpty = false;
    if (grid[row][col] == ' ')
    {
        isEmpty = true;
    }
    return isEmpty;
  }

  // Fills the given rectangle with fill  characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    for (int i = row0; i <= row1; i++)
    {
        for (int j = col0; j <= col1; j++)
        {
            grid[i][j] = fill;
        }
    }
  }

  // Fills the given rectangle with SPACE characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void clearRect(int row0, int col0, int row1, int col1)
  {
    for (int i = row0; i <= row1; i++)
    {
        for (int j = col0; j <= col1; j++)
        {
            grid[i][j] = ' ';
        }
    }
  }

  // Returns the count of all non-space characters in row 
  public int countInRow(int row)
  {
    int total = 0;
    for (int j = 0; j < row; j++)
    {
        if (grid[row][j] != ' ')
        {
            total++;
        }
    }
    return total;
  }

  // Returns the count of all non-space characters in col 
  public int countInCol(int col)
  {
    int total = 0;
    for (int i = 0; i < col; i++)
    {
        if (grid[i][col] != ' ')
        {
            total++;
        }
    }
    return total;
  }
}
