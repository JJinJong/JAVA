package obj;

public class Student {
   int num;
   String name;

   public Student() {;}

   public Student(int num, String name) {
      super();
      this.num = num;
      this.name = name;
   }

   public Student(String name) {
      super();
      this.name = name;
   }
   
//   @Override
   public String toString() {
      return "이름 : " + name;
   }
   //주소 비교  타입 비교  다운캐스팅  번호 비교  같으면 true
   public boolean equals(Object obj) {
	   //주소비교
	   if(this == obj) {return true;}
	   //타입비교
	   if(obj instanceof Student) {
		   //다운캐스팅
		   Student std = (Student)obj;
		   //원하는 필드 비교
		   if(this.num == std.num) {
			   return true;
		   }
	   }
	   return false;
	}
}