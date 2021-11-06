import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ArrayDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> stringHashMap=new HashMap<>();
        stringHashMap.put(1001,"amara");
        stringHashMap.put(1002,"anil");
        stringHashMap.put(1003,"akbar");
        stringHashMap.put(1001,"amar");
        Iterator<String> stringIterator=stringHashMap.values().iterator();
        while (stringIterator.hasNext())
        {

            System.out.println(stringIterator.next());
        }


    }

}
