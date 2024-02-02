
// Testing Button.
import javax.swing.JFrame;
public class _17_buttonFrame_Main
{
    public static void main( String[] args )
    {
        _18_ButtonTest buttonFrame = new _18_ButtonTest(); // create ButtonFrame
        buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        buttonFrame.setSize( 200, 210 ); // set frame size
        buttonFrame.setVisible( true ); // display frame
    } // end main
} // end class _18_ButtonTest