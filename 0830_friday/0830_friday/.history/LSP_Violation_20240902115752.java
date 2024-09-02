public class LSP_Violation{
    public static void main(String[] args){
        
Lecturer lect = new Lecturer();//상위클래스
lect.displayInfo();

Lecturer lect01 = new LecturerAtGS();
lect01.displayInfo(); //LSP원칙 준수 : 상위클래스 객체 위치에 하위 클래스 객체로 교체해도 동작함

Lecturer lect02 = new LecturerNight();
lect02.displayInfo(); //LSP원칙 위배 : 상위클래스 객체 위치에 하위 클래스 객체로 교체해도 동작하나,
//하위 클래스에서 메서드를 재정의 하지 않아 상위클래스 메서드가 호출되어 예상치 않은 결과 발생함.

Lecturer lect03 = new LecturerWithWork();
lect03.displayInfo();//LSP원칙 위배 : 상위클래스 객체 위치에 하위 클래스 객체로 교체해도 동작하나,
//재정의한 메서드의 목적이 상위클래스의 메서드와 다름.
    }