package collection;

import java.util.HashSet;

public class SetTask {
   public static void main(String[] args) {
	  
      HashSet<Student> set = new HashSet<>();
      Student std = new Student(1, "한동석");
      //재정의를 안한다면 std와 equls안의 new Student(1, "한동석")은 다른 객체임
      //따라서 주소가 다름 false가 뜸
      System.out.println(std.equals(new Student(1, "한동석")));
      //equals를 재정의 했더라도 equals만 재정의 했으므로 주소가 다름
      //따라서 다른 객체로 보고 값이 같더라도 2개가 쌓임
      //따라서 hashCode()도 재정의해야함
      set.add(std);
      set.add(new Student(1, "한동석"));
      
      System.out.println(set.size());
      
   }
}