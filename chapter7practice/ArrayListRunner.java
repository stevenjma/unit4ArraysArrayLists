import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("David");
       names.add("Edward");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       System.out.println(names);
       System.out.println(names.get(0));
       System.out.println(names.get(names.size() - 1));
       System.out.println(names.size());
       names.set(0, "Alice B. Douklas");
       System.out.println(names.get(0));
       names.add(4, "Doug");
       System.out.println(names.get(4));
       
       for (String element : names){
           System.out.println(element);
        }
        
       ArrayList<String> names2 = new ArrayList<String>(names);
       System.out.println(names2);
       
       names.remove(0);
       
       System.out.println(names.get(0));
       System.out.println(names2.get(0));
   }
} 