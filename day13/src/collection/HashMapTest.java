package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
   public static void main(String[] args) {
      //아이디, 비밀번호, 이름, 나이
	  //맵 주로 서버간 데이터 교환이 목적
	   				//Key		//Value
      HashMap<String, Object> userMap = new HashMap<>();
      //put을 이용해 key와 Value을 쌍으로 입력
      userMap.put("id", "hds1234");
      userMap.put("pw", "1234");
      userMap.put("name", "한동석");
      userMap.put("age", 20);
      //쌍으로 입력되기 때문에 넣은건 8개지만 크기는 4
      System.out.println(userMap.size());
      //넣은 키가 짝되는 Value이 출력됨
      System.out.println(userMap.get("id"));
      
      System.out.println(userMap.toString());
      
      Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator();
      
      while(iter.hasNext()) {
         Entry<String, Object> entry = iter.next();//iter.next()=쌍으로 된 값들
//         System.out.println(entry);
         System.out.println(entry.getKey() + ": " + entry.getValue());
      }
   }
}
