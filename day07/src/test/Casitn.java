package test;

import java.io.File;

//넷플릭스
//애니메이션, 영화, 드라마 클래스를 선언한다.
//사용자가 선택한 영상이 애니메이션이라면 "자막지원"기능을 사용하고
//영화라면 "4D"기능을 사용하고
//드라마라면 "굿즈"기능을 사용한다.

public class Casitn {
   //위 기능을 구현한 메소드 선언
   public void check(Video video) {
      if(video instanceof Animaion) {
    	 Animaion ani = (Animaion)video;
         ani.animate();
      }else if(video instanceof Flim) {
         Flim f = (Flim)video;
         f.playFilm();
      }else if(video instanceof Drama) {
         Drama d = (Drama)video;
         d.sellGoods();
      }else {
         System.out.println("없는 영화입니다.");
      }
   }
   
   public static void main(String[] args) {
      Casitn c = new Casitn();
      Animaion ani = new Animaion();
      Flim f = new Flim();
      Drama d = new Drama();
      
      c.check(ani);
      c.check(f);
      c.check(d);
      
   }
   
   
   
}