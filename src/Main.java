
public class Main {

    public static void main(String[] args) {
        Mi8 mi8 = new Mi8();
        Boeing737 boeing737 = new Boeing737();

        Test test = new Test();
        test.foo(mi8);
        test.foo(boeing737);
        test.foo1(mi8);
        test.foo1(boeing737);
       
    }
}





