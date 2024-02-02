// Demonstrating the JTextField class.
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
// import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.awt.Font;
public class _16_TextField_Class extends JFrame {
    private JTextField textField1; // text field with set size
    private JTextField textField2; // text field constructed with text
    public _16_TextField_Class() {
        super( "Testing JTextField and JPasswordField" );
        setLayout( new FlowLayout() ); // set frame layout
        Font font1 = new Font("SansSerif", Font.BOLD, 20);

        //construct textfield with 10 columns
        textField1 = new JTextField( 10 );
        textField1.setFont(font1);
        add( textField1 ); // add textField1 to JFrame

        //construct textfield with default text
        textField2 = new JTextField(4);
        textField2.setFont(font1);
        add( textField2 ); // add textField2 to JFrame

        // register event handlers
        TextHandler h = new TextHandler();
        textField2.addActionListener( h );
        textField1.addActionListener( h );

    } // end Text constructor

    // private inner class for event handling
    private class TextHandler implements ActionListener { // process text field events
        public void actionPerformed( ActionEvent event ) {
            String t1 = "",  t2 = ""; // declare string to display

    // user pressed Enter in JTextField textField2
            if(event.getSource() == textField2)
                t1=textField1.getText();
            t2 = String.format( "%s your mark is %s/100",	t1,event.getActionCommand());
            JOptionPane.showMessageDialog(null,t2);

                //  String ss=textField1.getText();
/*user pressed Enter in JTextField textField1
            else if(event.getSource() == textField1)
                string = String.format( "textField1: %s",	event.getActionCommand());
*/
            if(event.getSource() == textField2)
                t1=textField2.getText();
            t2 = String.format( "%s your mark is %s/100",	t2,event.getActionCommand());
            JOptionPane.showMessageDialog(null,t2);

        } // end method actionPerformed
    } // end private inner class TextHandler


} // end class Text