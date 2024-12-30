import java.util.HashMap;
import java.util.Map;
public class panService {
    private static Map<String ,Pan> panmap=new HashMap<>();
    static{
        panmap.put("rptps1261",new Pan("ewsd545",
        "79345", "SBi", "satyam", "Stock,FD"));
        panmap.put("rptps1262",new Pan("sdd646",
        "123456", "SBi", "Golu", "Stock,FD"));
        panmap.put("rptps1263",new Pan("dwd4566",
        "620390", "SBi", "Rachit", "Stock,FD"));
        panmap.put("rptps1264",new Pan("adss5d9956",
        "825209", "SBi", "pawan", "Stock,FD"));
        panmap.put("rptps1265",new Pan("xfss565",
        "969314", "SBi", "prem", "Stock,FD"));
    }
    public Pan getpanaddharNumber(String addherNumber){
        for(Pan pan:panmap.values()){
            if(pan.getaddharnumber().equals(addherNumber)){
                return pan;
            }
        }
        return null;
    }

    
}
