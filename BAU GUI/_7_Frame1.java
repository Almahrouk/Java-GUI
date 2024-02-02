// package GUI1;
import java.awt.FlowLayout; // specifies how components are arranged
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images
public class _7_Frame1 extends JFrame{

    private JLabel label1, label2, label3; // JLabel with just text
    // private JLabel label2; // JLabel constructed with text and icon
    // private JLabel label3; // JLabel with added text and icon
    // Frame1 constructor adds JLabels to JFrame
    public _7_Frame1()
    {
        super( "Testing JLabel" );

        setLayout( new FlowLayout() ); // set frame layout

        // JLabel constructor with a string argument
        label1 = new JLabel( "Label with text" );
        label1.setToolTipText( "This is label1" );
        add( label1 ); // add label1 to JFrame

        // JLabel constructor with string, Icon and alignment arguments
        Icon computer = new ImageIcon( getClass().getResource(
                "Computer1.png" ) );
        label2 = new JLabel( "Label with text and icon",
                computer, SwingConstants.LEFT );
        label2.setToolTipText( "This is label2" );
        add( label2 ); // add label2 to JFrame

        label3 = new JLabel(); // JLabel constructor no arguments
        label3.setText( "Label with icon and text at bottom" );
        label3.setIcon( computer ); // add icon to JLabel
        label3.setHorizontalTextPosition( SwingConstants.CENTER );
        label3.setVerticalTextPosition( SwingConstants.BOTTOM );
        label3.setToolTipText( "This is label3" );
        add( label3 ); // add label3 to JFrame
    } // end Frame1 constructor
} // end class Frame1