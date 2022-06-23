package lambdaTest2;

import java.util.Scanner;

public class Execution {
   //덧셈 뺄셈 메소드
   public static Calculate calculator(String oper) {
      
	   Calculate math = null;
      
      switch(oper) {
      case "+":
    	  //람다식, 메인메소드에서 
         math = (num1, num2) -> num1 + num2;
         break;
      case "-":
         math = (num1, num2) -> num1 - num2;
         break;
      }
      return math;
   }
   
   
   public static void main(String[] args) {
      GetOper operCheck = (expression) -> {
         String temp = "";
         for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(c == 43 || c == 45) {
               temp += c;
            }
         }
         return temp.split("");
      };
      
      String msg = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요";
      String exMsg = "예)7 + 65 - 8";
      String temp = null;
      String[] nums = null;
      String[] opers = null;
      int num1 = 0, num2 = 0;
      Scanner sc = new Scanner(System.in);
      
      System.out.println(msg);
      System.out.println(exMsg);
      temp = sc.next();
      
      nums = temp.split("\\+|\\-");
      opers = operCheck.getOpers(temp);
      for (int i = 0; i < nums.length; i++) {
    	  System.out.println(nums[0]);
	}
      for (int i = 0; i < opers.length; i++) {
    	  System.out.println(opers[0]);
	}
      num1 = Integer.parseInt(nums[0].equals("") ? opers[0] + nums[1] : nums[0]);
      
      for (int i = 0; i < opers.length; i++) {
         if(i == 0 && num1 < 0) {continue;}
         num2 = Integer.parseInt(nums[i + 1]);
         num1 = calculator(opers[i]).getnum(num1, num2);
      }
      System.out.println(num1);
   }
}

