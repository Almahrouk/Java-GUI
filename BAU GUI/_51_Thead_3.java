import java.util.Date;

class _51_Thead_3 implements Runnable {
    private int a;
    static int c = 0; // static variable shared among all instances of _51_Thead_3

    public _51_Thead_3(int a) {
        this.a = a;
    }

    public void run() {
        for (int i = 1; i <= a; ++i) {
            if (Thread.currentThread().getName().equals("T1"))
                System.out.println(Thread.currentThread().getName() + " " + this.c++);
            else
                System.out.println(Thread.currentThread().getName() + " " + this.c);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Exception handling
            }
        }
    }

    public static void main(String args[]) {
        _51_Thead_3 thr1, thr2;
        thr1 = new _51_Thead_3(2);
        thr2 = new _51_Thead_3(3);
        Thread t1 = new Thread(thr1, "T1");
        Thread t2 = new Thread(thr2, "T2");
        t1.start();
        t2.start();
        t2.setPriority(1);
    }
}
