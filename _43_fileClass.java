import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import java.io.FileWriter;

import java.util.Formatter;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class _43_fileClass extends JFrame {
    JLabel l;
    JTextField t;
    JButton b1, b2, b3, b4;
    JTextArea ta;
    File x;
    Formatter f;
    Scanner f1;
    JFileChooser ch;
    String a1 = "", a2 = "";

    public _43_fileClass() {
        super("Files");
        setLayout(new FlowLayout());

        l = new JLabel("Enter file name ");
        t = new JTextField(20);
        b1 = new JButton("Create");
        b2 = new JButton("Read");
        b3 = new JButton("Write");
        b4 = new JButton("Open Dialog");
        ta = new JTextArea(5, 20);

        add(l);
        add(t);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(new JScrollPane(ta), BorderLayout.SOUTH);

        F h = new F();
        b1.addActionListener(h);
        b2.addActionListener(h);
        b3.addActionListener(h);
        b4.addActionListener(h);
    }

    public class F implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b1) {
                try {
                    f = new Formatter(t.getText()); // Create File
                }
                catch (Exception ex) {}
            }
            else if (e.getSource() == b2) {
                ta.setText("");
                a1 = "";
                a2 = "";
                x = new File(t.getText()); // open to read

                if (x.exists()) {
                    System.out.println("the file here");
                    try {
                        f1 = new Scanner(x);
                        while (f1.hasNext()) {
                            a1 = f1.next(); // use next() or nextLine()
                            // a2 = a2 + "\n" + a1;
                            a2 = a2 + a1 + "\n";
                        }
                        ta.setText(a2); // ta.append("xxx");
                        f1.close();
                    }
                    catch (Exception ex) {
                        ta.setText("No such file");
                    }
                }
            }
            else if (e.getSource() == b3) {
                try { // write
                    FileWriter fileWriter = new FileWriter(t.getText(), true);
                    f = new Formatter(fileWriter);
                }
                catch (Exception ex) {}

                String[] d = ta.getText().split("\\n");
                for (String i : d)
                    f.format("%s%n", i); // write operation
                f.close();
                ta.setText("");
            }
            else if (e.getSource() == b4) {
                ch = new JFileChooser(new File("d:\\"));

                FileNameExtensionFilter f = new FileNameExtensionFilter("Text/Java files", "txt", "java");

                ch.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                ch.setFileFilter(f);

                int r = ch.showOpenDialog(null);
                if (r == JFileChooser.CANCEL_OPTION)
                    System.exit(1);

                File name = ch.getSelectedFile();
                t.setText(name.toString());
            }
        }
    }
}
