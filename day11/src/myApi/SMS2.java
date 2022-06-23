package myApi;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SMS2 {
	static final String KEY = "NCSMAWHHCCJOO0HH";
	static final String SECRET = "IJTZ71CAX68ZRIBYKYY9R5YKPS1FOLE9";
    
	public static JSONObject getMessage(String pw) {
		Message coolsms = new Message(KEY, SECRET);

	    // 4 params(to, from, type, text) are mandatory. must be filled
	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", "01052912978");
	    params.put("from", "01052912978");
	    params.put("type", "SMS");
	    params.put("text", "귀하의 비밀번호는 " + pw + "입니다.");
	    params.put("app_version", "test app 1.2"); // application name and version
	    
	    JSONObject obj = null;
	    try {
	    	obj = (JSONObject) coolsms.send(params);
	      System.out.println(obj.toString());
	    } catch (CoolsmsException e) {
	      System.out.println(e.getMessage());
	      System.out.println(e.getCode());
	    }
	    
	    return obj;
	}
	
}
