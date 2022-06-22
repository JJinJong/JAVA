package job_new;

public class Captain extends Job{
	
	public Captain(User user) {
		super(user);
		type = "captain";
		reward = 1000 * 10000;
	}

}
