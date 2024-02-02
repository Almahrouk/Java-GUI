// Demonstrating the JTextField class.
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class _14_JFrame_Text extends JFrame {
    private JTextField textField1; // text field with set size
    private JTextField textField2; // text field constructed with text
    private JTextField textField3; // text field with text and size
    private JPasswordField passwordField; // password field with text
    
    // Text constructor adds JTextFields to JFrame
    public _14_JFrame_Text() {
        super( "Testing JTextField and JPasswordField" );
        setLayout( new FlowLayout() ); // set frame layout

        //construct textfield with 10 columns
        textField1 = new JTextField( 10 );
        add( textField1 ); // add textField1 to JFrame
        
        //construct textfield with default text
        textField2 = new JTextField( "Enter text here" );
        add( textField2 ); // add textField2 to JFrame
        
        //construct textfield with default text and 21 columns
        textField3 = new JTextField( "Uneditable text field", 21 );
        textField3.setEditable( false ); // disable editing
        add( textField3 ); // add textField3 to JFrame

        // construct passwordfield
        passwordField = new JPasswordField(10 );
        add( passwordField ); // add passwordField to JFrame

        // register event handlers
        TextHandler h = new TextHandler();

        textField1.addActionListener( h );
        textField2.addActionListener( h );
        textField3.addActionListener( h );
        
        passwordField.addActionListener( h );
    } // end Text constructor

    // private inner class for event handling
    private class TextHandler implements ActionListener {
        // process text field events
        public void actionPerformed( ActionEvent event ) {
            String string = ""; // declare string to display

            // user pressed Enter in JTextField textField1
            if(event.getSource() == textField1)
                string = String.format( "textField1: %s",	event.getActionCommand());
                //  String ss=textField2.getText();
            
            //user pressed Enter in JTextField textField2
            else if(event.getSource() == textField2)
                string = String.format( "textField2: %s",	event.getActionCommand());

            //user pressed Enter in JTextField textField3
            else if(event.getSource() == textField3)
                string = String.format( "textField3: %s",	event.getActionCommand());

            //user pressed Enter in JTextField passwordField
            else if(event.getSource() == passwordField)
                string = String.format( "PasswordField: %s",event.getActionCommand());

            //display JTextField content
            JOptionPane.showMessageDialog( null, string );
        
        } // end method actionPerformed
    } // end private inner class TextHandler
} // end class Text