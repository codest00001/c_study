class ClassA {
    int a = 1;
    int b = 1;
}
class ClassB extends ClassA {
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
public class java0828_2
{
    public static void main(String[] args){
        int a = 10;
        float b = 3.3f;
        
        ClassB c = new ClassB();
        c.testcase(a/b);
    }
}
