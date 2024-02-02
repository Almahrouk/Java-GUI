import java.util.Date;

public class _49_Thread extends Thread {
    private int a;

    public _49_Thread(int a) {
        this.a = a;
    }

    public void run() {
        for (int i = 1; i <= a; ++i) {
            System.out.println(getName() + " is " + i + " at " + new Date());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // Exception handling
            }
        }
    }

    public static void main(String args[]) {
        _49_Thread thr1, thr2;
        thr1 = new _49_Thread(2);
        thr2 = new _49_Thread(3);
        thr1.start();
        thr2.start();
    }
}

/*
Thread-1 is 1 at Thu Jan 25 20:22:17 EET 2024
Thread-0 is 1 at Thu Jan 25 20:22:17 EET 2024
Thread-0 is 2 at Thu Jan 25 20:22:19 EET 2024
Thread-1 is 2 at Thu Jan 25 20:22:19 EET 2024
Thread-1 is 3 at Thu Jan 25 20:22:20 EET 2024
*/