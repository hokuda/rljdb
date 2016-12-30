import org.test.abc.TestEscapeDotA;
import org.test.abcdef.TestEscapeDotB;

public class Test {

    private String prefix = "Testing ";
    private TestEscapeDotA testEscapeDotA = new TestEscapeDotA();
    private TestEscapeDotB testEscapeDotB = new TestEscapeDotB();

    public static void main (String[] args) {
        Test test = new Test();
        String result = test.test("test0");
        //System.out.println(result);
        result = test.test("test1");
        //System.out.println(result);
        result = test.test("test2");
        //System.out.println(result);

    }

    public String test(String arg) {
        String result = this.prefix + arg;
        return result;
    }
}
