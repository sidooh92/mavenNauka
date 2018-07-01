package intro.varargs;

public class Main {

    public static void main(String... args) {

        System.out.println(args[0]);

        System.out.println("taki main tez jest poprawny");
        test("pierwszy", "drugi", "trzeci");

        test("pierwszy", "drugi", "trzeci", "cztery", "piec");
    }

    public static void test(String testStringOne, String testStringTwo, String... testString) {
        for (String a : testString) {
            System.out.println(a);
        }

    }

}
