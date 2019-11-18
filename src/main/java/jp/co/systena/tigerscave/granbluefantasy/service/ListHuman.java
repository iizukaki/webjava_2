package jp.co.systena.tigerscave.granbluefantasy.service;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import jp.co.systena.tigerscave.granbluefantasy.model.Human;

@Service
public class ListHuman {
  
  public Map<String, Human> getHumanList(){
    
    Human human1 = new Human("戦士");
    Human human2 = new Human("武闘家");
    
    
    Map<String, Human> humanListMap = new LinkedHashMap<String, Human>();
    
      humanListMap.put(human1.getName(), human1);
      humanListMap.put(human2.getName(), human2);
      
      return humanListMap;
  }

}
