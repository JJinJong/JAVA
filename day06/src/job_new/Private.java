package job_new;

public class Private extends Job{
	
	public Private(User user) {
		super(user);
		type =  "private";
		reward = 10 * 10000;
	}

}
