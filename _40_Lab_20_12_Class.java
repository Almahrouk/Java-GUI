import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class _40_Lab_20_12_Class extends JFrame {
    private GridLayout gridLayout;
    private JButton exitB; // button with just text
    private JButton addB; // button with icons
    private JButton addS; // button with icons
    private JButton addSs; // button with icons
    private JLabel label;
    private JTextField t1;
    private JTextField t2;
    private JButton lb1;
    private JButton lb2;
    private JButton lb3;
    private JList<String> ll;
    private JTextArea tArea1;
    private List<String> n = new ArrayList<>();
    private List<String> n1 = new ArrayList<>();
    private List<String> n2 = new ArrayList<>();
    private static final String[] cn = {"البرمجة المتقدمة", "الانظمة المضمنة", "الذكاء الاصطناعي"};

    // Button adds JButtons to JFrame
    public _40_Lab_20_12_Class() {
        super("Testing Buttons");
        gridLayout = new GridLayout(4, 3, 5, 5);
        getContentPane();
        setLayout(gridLayout);

        Icon c1 = new ImageIcon(getClass().getResource("b.jpg"));
        label = new JLabel("نظام العلامات",
                c1, SwingConstants.CENTER);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(label);

        lb1 = new JButton("  ");
        lb1.setVisible(false);
        add(lb1);

        lb2 = new JButton("  ");
        lb2.setVisible(false);
        add(lb2);

        t2 = new JTextField("علامة الطالب من 100", 20);
        t2.setHorizontalAlignment(JTextField.RIGHT);
        add(t2);

        t1 = new JTextField("إسم الطالب", 20);
        t1.setHorizontalAlignment(JTextField.RIGHT);
        add(t1);

        addB = new JButton("أضف الطالب"); // set image
        add(addB); // add fancyJButton to JFrame

        lb3 = new JButton("  ");
        lb3.setVisible(false);
        add(lb3);

        addS = new JButton("بحث"); // button with text
        add(addS); // add plainJButton to JFrame

        addSs = new JButton("عرض"); // button with text
        add(addSs); // add plainJButton to JFrame

        exitB = new JButton("خروج"); // button with text
        add(exitB); // add plainJButton to JFrame

        tArea1 = new JTextArea(10, 15); // create second textarea
        tArea1.setEditable(false); // disable editing
        add(new JScrollPane(tArea1)); // add scrollpane

        ll = new JList<>(cn);
        ll.setVisibleRowCount(2);
        ll.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(ll));

        // create new ButtonHandler for button event handling
        ButtonHandler handler = new ButtonHandler();
        addB.addActionListener(handler);
        addS.addActionListener(handler);
        addSs.addActionListener(handler);
        exitB.addActionListener(handler);
    } // end ButtonFrame constructor

    // inner class for button event handling
    private class ButtonHandler implements ActionListener {
        // handle button event
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == addB) { // Add Student
                if (ll.getSelectedIndex() == 0) {
                    n.add(t1.getText());
                    n.add(t2.getText());
                } else if (ll.getSelectedIndex() == 1) {
                    n1.add(t1.getText());
                    n1.add(t2.getText());
                } else if (ll.getSelectedIndex() == 2) {
                    n2.add(t1.getText());
                    n2.add(t2.getText());
                }
                t1.setText("");
                t2.setText("");
            }

            if (event.getSource() == addS) { // Search Student
                int i;
                if (ll.getSelectedIndex() == 0) {
                    i = n.indexOf(t1.getText());
                    if (i == -1)
                        JOptionPane.showMessageDialog(null, "Student not found", "Error", 0);
                    else {
                        n.get(i + 1);
                        t2.setText((String) n.get(i + 1));
                    }
                } else if (ll.getSelectedIndex() == 1) {
                    i = n1.indexOf(t1.getText());
                    if (i == -1)
                        JOptionPane.showMessageDialog(null, "Student not found", "Error", 0);
                    else {
                        n1.get(i + 1);
                        t2.setText((String) n1.get(i + 1));
                    }
                } else if (ll.getSelectedIndex() == 2) {
                    i = n2.indexOf(t1.getText());
                    if (i == -1)
                        JOptionPane.showMessageDialog(null, "Student not found", "Error", 0);
                    else {
                        n2.get(i + 1);
                        t2.setText((String) n2.get(i + 1));
                    }
                }
            }

            if (event.getSource() == exitB)
                System.exit(0);
        } // end method actionPerformed
    } // end private inner class ButtonHandler
} // end class Button
