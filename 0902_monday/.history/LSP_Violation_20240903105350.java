public class LSP_Violation {

    public static void main(String[] args) {
  
      Lecturer lect = new Lecturer(); // 상위클래스
      lect.displayInfo();
  
      Lecturer lect01 = new LecturerAtGS();
      lect01.displayInfo(); // LSP원칙 준수 : 상위클래스 객체 위치에 하위 클래스 객체로 교체해도 동작함
  
      Lecturer lect02 = new LecturerNight();
      lect02.displayInfo();// LSP원칙 위배 : 상위클래스 객체 위치에 하위 클래스 객체로 교체해도 동작하나,
      // 하위 클래스에서 메서드를 재정의 하지 않아 상위클래스 메서드가 호출되어 예상치 않은 결과 발생함.
  
      Lecturer lect03 = new LecturerWithWork();
      lect03.displayInfo(); // LSP원칙 위배 : 상위클래스 객체 위치에 하위 클래스 객체로 교체해도 동작나, 재정의한 메서드의 목적이 상위클래스의 메서드와 다름.
    }
  
    public static class Lecturer {
  
      public String lecturer = "ilban 일반 강사";
      public int charge = 90000;
  
      // 일반 강사료 displayInfo 메서드
      public void displayInfo() {
        System.out.println(lecturer);
        System.out.println("gangsaryo 강사료: " + charge + "won 원\n");
      }
    }
  
    public static class LecturerNight extends Lecturer {
      public LecturerNight() {
        lecturer = "yagan 야간 강사";
      }
  
      // displayInfo 메서드를 오버라이딩 하지 않음.
      public void displayInfoNight() {
        System.out.println(lecturer);
        System.out.println("gangsaryo 강사료: " + charge * 1.5 + "won 원\n");
      }
    }
  
    public static class LecturerAtGS extends Lecturer {
      public LecturerAtGS() {
        lecturer = "daehakwon 대학원 강사";
      }
  
      // displayInfo 메서드를 오버라이딩
      public void displayInfo() {
        System.out.println(lecturer);
        System.out.println("gangsaryo 강사료: " + charge * 2 + "won 원\n");
      }
    }
  
    public static class LecturerWithWork extends Lecturer {
      public LecturerWithWork() {
        lecturer = "jikeop 직업이 있는 강사";
      }
  
      // displayInfo메서드를 오버라이딩 했으나, 강사료가 아닌 주차료를 계산함
      public void displayInfo() {
        System.out.println(lecturer);
        System.out.println("juchabi 일일 주차비: " + charge * 0.5 + "won 원\n");
      }
    }
  }
  
  //LSP원칙 위배 케이스