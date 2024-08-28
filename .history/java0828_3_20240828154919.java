class ClassA {
    int a = 1;
    int b = 1;
}
class ClassB extends ClassA { 
    //밑에서는 어디를 탈지가 결정되고 계산은 classA의 것으로 계산
    void testcase(){
        System.out.println(this.a + this.b);
    }
    void testcase(int i){
        System.out.println(this.a - this.b);
    }
    void testcase(char i){
        System.out.println(this.a * this.b);
    }
    void testcase(float i){
        System.out.println(this.a / this.b);
    }
}
public class java0828_3 //4개 다 돌아가게 하는 방법
{
    public static void main(String[] args){
        int a = 10;
        int b = 3;

        
        // ClassB c = new ClassB();
        // c.testcase();

        // ClassB d = new ClassB();
        // d.testcase(a/b);

        ClassB e = new ClassB();
        e.testcase('x');
     
        // ClassB f = new ClassB();
        // f.testcase(a/b);
    }
}
