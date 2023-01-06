import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Hello {
    static void myMethod(String name , int age)
    {
        System.out.println("My name is: " + name+ ",My Age is :" +age);
    }

    static void myMethod(String name, int age, String gender)
    {
        System.out.println("My name is: " + name+ ",My Age is :" +age +"My gender is :" +gender);
    }
    public static void main (String[] args){

        String name;
        int age;
        String gender;

        int[][] myNumber={{1,2,3,4},{5,6,7,8}};
         for(int i=0;i< myNumber.length;i++)
             for(int j=0;j<myNumber[i].length;j++)
                 System.out.println(myNumber[i][j]);

        String[] cars={"Volvo","BMW","Toyota"};
        for (int i=0;i<cars.length;i++) {
            System.out.println(cars[i]);
        }

        myMethod("Debarchan",33);
        myMethod("Debarchan",33,"male");

        ArrayList<String> car=new ArrayList<String>();
        car.add("volvo");
        car.add("volvo1");
        car.add("volvo2");
        System.out.println(car);
        LinkedList<String> bus=new LinkedList<String>();
        bus.add("Mercedes");
        bus.add("Mercedes1");
        System.out.println(bus);

        HashMap<String,String>     capitalCities = new HashMap<String , String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities.get("England"));

        Iterator<String> it= car.iterator();
        while(it.hasNext())
        System.out.println(it.next());





    }
}
