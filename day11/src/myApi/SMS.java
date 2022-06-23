package myApi;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

//ctrl + shift + o 자동 import
public class SMS {
	public static void main(String[] args) {
		String api_key = "NCSMAWHHCCJOO0HH";
	    String api_secret = "IJTZ71CAX68ZRIBYKYY9R5YKPS1FOLE9";
	    Message coolsms = new Message(api_key, api_secret);

	    // 4 params(to, from, type, text) are mandatory. must be filled
	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", "01052912978");
	    params.put("from", "01052912978");
	    params.put("type", "SMS");
	    params.put("text", "이클립스 이용 메세지 보내기\n"
	    		+ "오늘도 파이팅");
	    params.put("app_version", "test app 1.2"); // application name and version

	    try {
	      JSONObject obj = (JSONObject) coolsms.send(params);
	      System.out.println(obj.toString());
	    } catch (CoolsmsException e) {
	      System.out.println(e.getMessage());
	      System.out.println(e.getCode());
	    }
	}
} 
