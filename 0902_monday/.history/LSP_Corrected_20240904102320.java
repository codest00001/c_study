public class LSP_Corrected {

    public static void main(String[] args) {
        
    //   Lecturer lect04 = new Lecturer(); // 추상클래스를 new로 붕어빵을 만들면 오류가 난다.
    //   abstract class Lecturer라고 아래에서 선언하니까. 
    //   상속이 목적이니까. Lecturer가 abstract class이므로!!

      Lecturer lect = new GeneralLecturer(); // 일반 강사
      lect.displayInfo();
  
      Lecturer lect01 = new LecturerAtGS(); // 대학원 강사
      lect01.displayInfo(); // LSP 준수: 상위 클래스 객체 위치에 하위 클래스 객체로 교체해도 동작함
  
      Lecturer lect02 = new LecturerNight(); // 야간 강사
      lect02.displayInfo(); // LSP 준수: 하위 클래스에서 메서드를 오버라이드함
  
      Lecturer lect03 = new LecturerWithWork(); // 직업이 있는 강사
      lect03.displayInfo(); // LSP 준수: 강사료 계산을 올바르게 오버라이드함
    }
  
    // 추상 클래스 Lecturer
    public static abstract class Lecturer {
      protected String lecturer; // 강사 유형
      protected int charge = 90000; // 기본 강사료
      //private와 public의 중간정도인 protected. private으로 바꾸니까 오류남.
      //접근 제한자. protected 상속받은 클래스 까지 사용가능. 패키지까지 할 수 있음.
      // 추상 메서드: 서브클래스가 반드시 오버라이드 해야 함
      public abstract void displayInfo();
    }
  
    // 1일반 강사 클래스
    public static class GeneralLecturer extends Lecturer { //extends 사용!!
      public GeneralLecturer() {
        this.lecturer = "ilban 일반 강사";
        //this는 생성자. 자바에서는 클래스 이름이랑 같은게 생성자.
      }
  
      @Override
      public void displayInfo() {
        System.out.println(lecturer);
        System.out.println("gangsaryo강사료: " + charge + "won원\n");
      }
    }
  
    // 2야간 강사 클래스
    public static class LecturerNight extends Lecturer {
      public LecturerNight() {
        this.lecturer = "yagan 야간 강사";
      }
  
      @Override
      public void displayInfo() {
        System.out.println(lecturer);
        System.out.println("gangsaryo 강사료: " + charge * 1.5 + "won원\n");
      }
    }
  
    // 3대학원 강사 클래스
    public static class LecturerAtGS extends Lecturer {
      public LecturerAtGS() {
        this.lecturer = "daehakwon대학원 강사";
      }
  
      @Override
      public void displayInfo() {
        System.out.println(lecturer);
        System.out.println("gangsaryo강사료: " + charge * 2 + "won원\n");
      }
    }
  
    // 4직업이 있는 강사 클래스
    public static class LecturerWithWork extends Lecturer {
      public LecturerWithWork() {
        this.lecturer = "jikeop직업이 있는 강사";
      }
  
      @Override
      public void displayInfo() {
        System.out.println(lecturer);
        System.out.println("gangsaryo강사료: " + charge * 0.5 + "won원\n");
      }
    }
  }
  
  //LSP 준수 케이스