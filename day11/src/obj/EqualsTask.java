package obj;

public class EqualsTask {
   public static void main(String[] args) {
      Student std = new Student(1, "한동석");
      //학생의 번호가 같다면 true가 나올수 있도록 equals() 재정의하기
      System.out.println(std.equals(new Student(1, "한동석")));
   }
}
