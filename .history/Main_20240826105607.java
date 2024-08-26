interface Flyable {
    void fly();
    }

interface Swimmable{
    void swim();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly(){
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim(){
        System.out.println("Duck is swimming.");;
    }}

    public class Main { //java는 퍼블릭클래스 이름으로 파일이름이 저장되니까 main1, main2이런식으로 해나가면 됨
        public static void main(String[] args){
            Duck duck = new Duck();
            duck.fly();
            duck.swim();
        }
    }