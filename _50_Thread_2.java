import java.util.Date;

class _50_Thread_2 implements Runnable {
    private int a;

    public _50_Thread_2(int a) {
        this.a = a;
    }

    public void run() {
        for (int i = 1; i <= a; ++i) {
            System.out.println(Thread.currentThread().getName() + " is " + i + " at " + new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Exception handling
            }
        }
    }

    public static void main(String args[]) {
        _50_Thread_2 thr1, thr2;
        thr1 = new _50_Thread_2(2);
        thr2 = new _50_Thread_2(3);
        Thread t1 = new Thread(thr1);
        Thread t2 = new Thread(thr2);
        t1.start();
        t2.start();
    }
}
/*
Thread-0 is 1 at Thu Jan 25 20:25:56 EET 2024
Thread-1 is 1 at Thu Jan 25 20:25:56 EET 2024
Thread-0 is 2 at Thu Jan 25 20:25:57 EET 2024
Thread-1 is 2 at Thu Jan 25 20:25:57 EET 2024
Thread-1 is 3 at Thu Jan 25 20:25:58 EET 2024
*/