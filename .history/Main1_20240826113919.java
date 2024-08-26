//<추상클래스 예시> 
//추상클래스에는 클래스의 명칭과 메서드는 있으나 메서드의 처리 내용은 없음
//따라서 상속을 통해서 메서드 구현
//추상 클래스는 추상 메서드 외에 일반적인 속성과 메서드를 가질 수 있음
//메서드의 다형성을 지원

abstract class Animal{  //Animal도 생성자 Dog도 생성자 //자바는 대소문자구별함.
    // println엘엔임.ln은 \n의 기능임. line이라고 생각하면 됨.
    String name;
    Animal(String name) {
        this.name = name;
    }
    //추상 메서드    
    abstract void sound();

    abstract void dance();
    //일반 메서드
    void sleep(){
        System.out.println(name + "is sleeping.");
    }}
    class Dog extends Animal {
        Dog(String name){
            super(name);
        }
        //추상 메서드 구현
        @Override
        void sound() {
            System.out.println("Bark");
        }}

        @Override
        void dance() {
            System.out.println("Bark_dance");
        }

        public class Main1 {
            public static void main(String[] args){
                Dog dog = new Dog("Buddy");
                dog.sound();
                dog.sleep();
                dog.dance();
            }}
        