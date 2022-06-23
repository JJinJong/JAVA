package lambda;

import java.util.ArrayList;
import java.util.List;

import anonymous.FormAdapter;

public class StreamTest {
	
	public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			User user = new User();
			user.age = 10;
			users.add(user);
		}
		
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).age);
		}
		
		//users.stream().map()
		
		
	}
	
	
}
