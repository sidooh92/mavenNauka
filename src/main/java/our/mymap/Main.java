package our.mymap;


import static java.lang.Thread.sleep;

//@Slf4j
public class Main {
    public static void main(String[] args) throws InterruptedException {
        final int SIZE = 2004;
        long[][] l = new long[SIZE][];
        for (int i = 0; i < 100000; i++) {
                sleep(100);
                l[i] = new long[SIZE];

        }
    }
}
