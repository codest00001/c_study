//첫번째 인터페이스
interface Flyable {
    void fly();
    }

//두번째 인터페이스
interface Swimmable{
    void swim();
}

//세번째 인터페이스
interface dancing{
    void dance();
}



//Flyable과 Swimmable 인터페이스를 모두 구현하는 클래스
class Duck implements Flyable, Swimmable, dance {
    @Override //적는 것을 권장. 커뮤니케이션 위해서.
    public void fly(){
        System.out.println("Duck is flying.");
    }
    @Override
    public void swim(){
        System.out.println("Duck is swimming.");
}
@Override
public void dance(){
    System.out.println("Duck is dancing.");
}

}

    public class Main { 
    //java는 퍼블릭클래스 이름으로 파일이름이 저장되니까 앞으로 main나오면 중복되므로
    //main1, main2이런식으로 해나가면 됨
        public static void main(String[] args){
            Duck duck = new Duck();
            duck.fly();
            duck.swim();
        }
    }