package collection;

public class Student {
	int num;
	String name;

	public Student() {
		;
	}

	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// 주소 비교
		if (this == obj) {
			return true;
		}
		// 타입비교
		if (obj instanceof Student) {
			//다운캐스팅
			Student std = (Student) obj;
			//값비교
			if (std.num == this.num) {
				return true;
			}
		}
		return false;
	}

	// eqauls를 재정의 했다면, 반드시 hashCode도 재정의 해야한다.
	@Override
	public int hashCode() {
		return this.num;
	}

}
