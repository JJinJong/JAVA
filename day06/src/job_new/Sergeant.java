package job_new;

public class Sergeant extends Job{
	
	public Sergeant(User user) {
		super(user);
		type = "sergeant";
		reward = 100 * 10000;
	}
}
