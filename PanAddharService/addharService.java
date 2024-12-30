import java.util.HashMap;
import java.util.Map;

public class addharService {
    public static Map<String,addhar> addharmap=new HashMap<>();
    static{
        addharmap.put("79345",new addhar("79345","Satyam","ravishankar","vadodra"));
        addharmap.put("123456",new addhar("123456","golu","ravishankar","vadodra"));
        addharmap.put("620390",new addhar("620390","rachit","-----","vadodra"));
        addharmap.put("828509",new addhar("825209","pawan","------","ara"));
        addharmap.put("969314",new addhar("969314","prem","-------","pune"));
    }
    public addhar getAddharByNumber(String addharNumber){
        return addharmap.get(addharNumber);
    }
    
}
