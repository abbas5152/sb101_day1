import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Capital {

    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();

        map.put("Gujarat","Gandhinagar");
        map.put("Maharashtra","Mumbai");
        map.put("Bengal","Kolkata");
        map.put("Rajasthan","Jaipur");
        map.put("Goa","Panji");

      Set<Map.Entry<String,String>> li=map.entrySet();

      for (Map.Entry<String,String> lis:li){
          System.out.println(lis.getKey());
//          System.out.println("===========");
          System.out.println(lis.getValue());
          System.out.println("===========");
      }
    }


}
