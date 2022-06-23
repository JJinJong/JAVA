package obj;

import com.sun.jdi.Value;

public class Student {
	int num;
	String name;
	
	public Student() {;}
	public Student(String name) {
		super();
		this.name = name;
	}
	
	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	public String toString() {
		return "이름 : "+ name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(this instanceof Student) {
			Student anotherStudent = (Student)obj;
			if(num == anotherStudent.num) {
				return true;
			}else {
				return false;
			}
			
		}
		return super.equals(obj);
	
	}

}
