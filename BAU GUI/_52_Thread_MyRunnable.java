import java.awt.BorderLayout;
import java.util.Date;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

class _52_Thread_MyRunnable extends JFrame implements Runnable {
    private int a;
    JTextArea tArea1;
    JLabel l;
    Date d;

    public _52_Thread_MyRunnable(int a) {
        super("Frame1");
        setLayout(new FlowLayout());
        tArea1 = new JTextArea("Starts", 10, 15);
        add(new JScrollPane(tArea1));
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.a = a;
    }

    public _52_Thread_MyRunnable(float b) {
        super("Frame2");
        setLayout(new FlowLayout());
        d = new Date();
        l = new JLabel(d.getHours() + " : " + d.getMinutes() + " : " + d.getSeconds());
        add(l);
        setSize(300, 200);
        setVisible(true);
        setLocation(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.a = (int) b;
    }

    public void run() {
        String tt = "", t = "";
        for (int i = 1; i <= a; ++i) {
            if (Thread.currentThread().getName().equals("T1")) {
                t = tArea1.getText();
                tt = "*";
                if (i % 10 == 0)
                    tArea1.setText(t + "\n" + tt);
                else
                    tArea1.setText(t + " " + tt);
            } else {
                d = new Date();
                l.setText(d.getHours() + " : " + d.getMinutes() + " : " + d.getSeconds());
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Exception handling
            }
        }
    }

    public static void main(String args[]) {
        _52_Thread_MyRunnable thr1, thr2;
        thr1 = new _52_Thread_MyRunnable(500);
        thr2 = new _52_Thread_MyRunnable(500.0f);
        Thread t1 = new Thread(thr1, "T1");
        Thread t2 = new Thread(thr2, "T2");
        t1.start();
        t2.start();
    }
}
