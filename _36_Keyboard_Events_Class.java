import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class _36_Keyboard_Events_Class extends JFrame implements KeyListener {
    private String line1 = ""; // first line of textarea
    private String line2 = ""; // second line of textarea
    private String line3 = ""; // third line of textarea
    private JTextArea textArea; // textarea to display output

    public _36_Keyboard_Events_Class() {
        super("Demonstrating Keystroke Events");

        textArea = new JTextArea(10, 15); // set up JTextArea
        textArea.setText("Press any key on the keyboard...");
        textArea.setEnabled(false); // disable textarea
        textArea.setDisabledTextColor(Color.BLACK); // set text color
        add(textArea); // add textarea to JFrame
        addKeyListener(this); // allow frame to process key events
    }
    public void keyPressed(KeyEvent event) {
        line1 = String.format("Key pressed: %s", KeyEvent.getKeyText(event.getKeyCode())); // show pressed key
        setLines2and3(event);}
    public void keyReleased(KeyEvent event) {
        line1 = String.format("Key Released"); // show released key
        setLines2and3(event);}
    public void keyTyped(KeyEvent event) {
        line1 = String.format("Key Typed: %s", event.getKeyChar()); // show typed key
        setLines2and3(event);}
    private void setLines2and3(KeyEvent event) {
        line2 = String.format("This key is %san action key", (event.isActionKey() ? "" : "not "));
        int modifiers = event.getModifiersEx();
        String temp = KeyEvent.getModifiersExText(modifiers);
        line3 = String.format("Modifier keys pressed: %s", (temp.isEmpty() ? "none" : temp)); // output modifiers
        textArea.setText(String.format("%s\n%s\n%s\n", line1, line2, line3)); // output three lines of text
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            _36_Keyboard_Events_Class frame = new _36_Keyboard_Events_Class();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            frame.setVisible(true);
        });
    }
}
