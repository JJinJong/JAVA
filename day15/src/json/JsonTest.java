package json;

import java.util.HashMap;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

//JSON : 데이터 교환 방식
//언어랑 형식이 달라도 인터넷만 되면 데이터 교환 가능
//"{"로 시작해서 "}로 마친다.
public class JsonTest {
	public static void main(String[] args) {
		//HashMap으로 자료구조 선언
		HashMap<String, String> userMap = new HashMap<>();
		//HashMap에 고객의 정보 담기
		userMap.put("id", "has1234");
		userMap.put("pw", "1234");
		userMap.put("name", "한동석");
		
		//JSONObject타입의 jsonobj에 HashMap사용
		//1명의 고객의 정보가 담긴 json임
		JSONObject jsonObj = new JSONObject(userMap);
		
		//실제 출력해보면 잘 담긴것을 알 수 있음
//		System.out.println(jsonObj.toJSONString());
		
		//나이까지 추가한더
		jsonObj.put("age", 10);
		
		//고객들을 담기위해 Array를 사용하지만, 그냥 ArrayList에 담으면 ArrayList타입으로 바뀜
		//따라서 JSONArray로 만듬
		JSONArray jsonArr = new JSONArray();
		
		//2번 째 고객 정보 담기
		JSONObject jsonObj2 = new JSONObject(userMap);
		jsonObj2.put("id", "has1234");
		jsonObj2.put("pw", "1234");
		jsonObj2.put("name", "홍길동");
		jsonObj2.put("age", 20);
		
		//JSONArray에 2명의 고객 정보 담음
		jsonArr.add(jsonObj);
		jsonArr.add(jsonObj2);
		
		//출력해보면 잘 나옴
//		System.out.println(jsonArr.toJSONString());
		
		//json을 인덱스로 가져오면 빠르지만, 개발할 때 헷갈릴 수 있음
		//따라서 다시 json시켜서 개발자가 편하게 구조화시킴
		//but, 반드시 이렇게 하는게 아닌 기능에 맞게, 개발 목적에 맞게 사용하면 됨
		JSONObject jsons = new JSONObject();
		jsons.put("개발", jsonObj);
		jsons.put("보안", jsonObj2);

		//출력해보면 잘 담김
//		System.out.println(jsons.toJSONString());
		
		//json의 정보를 가져와 보자
		//jsonArr.get(1)까진 잘되지만 여기서 다시 .get사용하면 안됨 
		//Why? jsonArr.get(1)은 Object타입이므로  get메소드가 없음
		//따라서 다운캐스팅으로 JOSNObject로 캐스팅한후 다시 get사용
		System.out.println(((JSONObject)jsonArr.get(1)).get("name"));
		System.out.println(((JSONObject)jsonArr.get(0)).get("id"));
		
		
		//실습 위에 선언한 jsons를 사용하여 개발팀의 전체 정보를 출력한다.
		JSONObject developer = (JSONObject)jsons.get("개발");
		Iterator<Object> iter = developer.keySet().iterator();
		while(iter.hasNext()) {
			System.out.println(developer.get(iter.next()));
		}
		
		
	}
}
