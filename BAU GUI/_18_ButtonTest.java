
// Creating JButtons.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class _18_ButtonTest extends JFrame {
    private JButton exitB; // button with just text
    private JButton imageB; // button with icons
    // Button adds JButtons to JFrame
    public _18_ButtonTest() {
        super( "Testing Buttons" );
        setLayout( new FlowLayout() ); // set frame layout

        Icon c1 = new ImageIcon( getClass().getResource( "P.png" ) );
        Icon c2 = new ImageIcon( getClass().getResource( "P1.png" ) );
        imageB = new JButton( "Image Button", c1 ); // set image
        imageB.setRolloverIcon( c2 ); // set rollover image
        add( imageB ); // add fancyJButton to JFrame

        exitB = new JButton( "Exit" ); // button with text
        add( exitB ); // add plainJButton to JFrame

//create new ButtonHandler for button event handling
        ButtonHandler handler = new ButtonHandler();
        imageB.addActionListener( handler );
        exitB.addActionListener( handler );

    } // end ButtonFrame constructor
    // inner class for button event handling
    private class ButtonHandler implements ActionListener {
        // handle button event
        public void actionPerformed( ActionEvent event ) {
            JOptionPane.showMessageDialog( _18_ButtonTest.this, String.format( "You pressed: %s",event.getActionCommand() ));
            if(event.getSource()==exitB)
                System.exit(0);
        } // end method actionPerformed
    } // end private inner class ButtonHandler
} // end class Button