import java.util.ArrayList;
import java.util.Scanner;

public class TopSale
{
    public ArrayList<String> customer = new ArrayList<String>();
    
    public TopSale()
    {
        Scanner s = new Scanner(System.in);
        
        String a = "";
        
        while (a != "q")
        {
            System.out.println("Enter a name, or enter 'q' to quit.");
            customer.add(s.next());
        }
    }
    
    public void addSale(String customerName, double amount)
    {
        for (int i = 0; i <= customer.size(); i++)
        {
          customer.add(amount);
        }
    }
    public String nameofBestCustomer()
    {
        int greatnumber = 0;
        double total = 0;
        for (int i = 0; i < names.size() - 1; i++)
        {
            if (total < totals.get(i))
            {
                greatnumber = i;
                total = totals.get(i);
            }
        }
        
        return names.get(greatnumber);
    }
    
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Double> totals = new ArrayList<Double>();
        names.addSale("Bob", 2.50);
        starter.addSale("Bob", 2.50);
        starter.addSale("George", 8.00);
        starter.addSale("Andrew", 1.00);
        starter.addSale("Nick", 1.50);
        starter.addSale("Bob", 2.50);
        starter.nameofBestCustomer();
    }
}