
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class _28_TextArea_Class extends JFrame {
    private JTextArea tArea1;
    private JTextArea tArea2;
    private JButton copy;

    public _28_TextArea_Class() {
        super("TextArea Demo");
        Box box = Box.createHorizontalBox(); // create box
        tArea1 = new JTextArea("Hello\nthis is new TextBox\nselect your text", 10, 15); // create textArea1
        box.add(new JScrollPane(tArea1)); // add scrollpane
        copy = new JButton("Copy >>>");
        box.add(copy); // add copy button to box
        copy.addActionListener (
            new ActionListener() { /* anonymous inner class */
                // set text in textArea2 to selected text from textArea1
                public void actionPerformed(ActionEvent event) {
                    tArea2.setText(tArea1.getSelectedText());
                }
            }
        );
        tArea2 = new JTextArea(10, 15); // create second textarea
        tArea2.setEditable(false); // disable editing
        box.add(new JScrollPane(tArea2)); // add scrollpane
        add(box); // add box to frame
    } // end TextAreaFrame constructor
}