class ClassA{
    int a = 1;
    int b = 1;
}

class Class extends ClassA {
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

public class Main0828_2 
{
    public static void main(String[] args){
        int a = 10;
        int b = 3;
        
        Class c = new Class();
        c.testcase(a/b);
    }
}
