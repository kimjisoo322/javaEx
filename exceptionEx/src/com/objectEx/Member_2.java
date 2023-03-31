package com.objectEx;
public class Member_2 {
   public static void main(String[] args) {
      Member mem1 = new Member("id");
      Member mem2 = new Member("id");
      //.equals: 두 객체를 비교합니다
      System.out.println(mem1.equals(mem2)); // true
   }
   
   private String id;
   
   public Member_2(String id) {
      this.id = id;
   
   }
   
   @Override
   /**
    * this(Member 객체)가 가지고 있는 id 값과 
    * 매개변수로 받은 Object의 id값이 일치 하는지 비교
    */
   public boolean equals(Object obj) {
      // Object가 Member가 될 수 있는지 형변환 가능 여부 확인
      if(obj instanceof Member) {
         Member member = (Member)obj;
         System.out.println("object.equals: "+super.equals(obj)); //false
         System.out.println("Member.equals() 결과: "+getId().equals(member.getId())); //true
         
         if(this.id.equals(member.getId())) {
            return true;
         } else {
            return false;
         }
      } // if 끝
      // 객체가 가지고 있는 id 값이 같다면 true, 아니면 false;
      System.out.println("obj.equals: "+super.equals(obj));
      System.out.println();
      return false;
   }    // 메소드 끝

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }
}