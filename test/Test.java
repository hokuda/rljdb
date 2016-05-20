public class Test {

    private String prefix = "Testing ";

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
