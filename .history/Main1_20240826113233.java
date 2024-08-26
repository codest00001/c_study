abstract class Animal{  //Animal도 생성자 Dog도 생성자 //자바는 대소문자구별함.
    // println엘엔임.ln은 \n의 기능임. line이라고 생각하면 됨.
    String name;
    Animal(String name) {
        this.name = name;
    }
    //추상 메서드    
    abstract void sound();
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

        public class Main1 {
            public static void main(String[] args){
                Dog dog = new Dog("Buddy");
                dog.sound();
                dog.sleep();
            }}