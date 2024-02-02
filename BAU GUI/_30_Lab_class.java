// Creating JButtons.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class _30_Lab_class extends JFrame {
    private JButton exitB; // button with just text
    private JButton addB; // button with icons
    private JButton addS; // button with icons
    private JLabel label;
    private JTextField t1;
    private JTextField t2;
    List<String> n = new ArrayList<>();

    // Button adds JButtons to JFrame
    public _30_Lab_class() {
        super( "Testing Buttons" );
        setLayout( new FlowLayout() ); // set frame layout

        Icon c1 = new ImageIcon( getClass().getResource( "b.jpg" ) );
        label = new JLabel( "نظام العلامات", c1, SwingConstants.CENTER);
        label.setHorizontalTextPosition( SwingConstants.CENTER );
        label.setVerticalTextPosition( SwingConstants.BOTTOM );
        add(label);

        t1=new JTextField("إسم الطالب",30);
        add(t1);
        t2=new JTextField("علامة الطالب من 100",20);
        add(t2);

        addB = new JButton( "أضف الطالب"); // set image
        add( addB ); // add fancyJButton to JFrame
        addS = new JButton( "بحث" ); // button with text
        add( addS ); // add plainJButton to JFrame
        exitB = new JButton( "خروج" ); // button with text
        add( exitB ); // add plainJButton to JFrame

//create new ButtonHandler for button event handling
        ButtonHandler handler = new ButtonHandler();
        addB.addActionListener( handler );
        addS.addActionListener( handler );
        exitB.addActionListener( handler );

    } // end ButtonFrame constructor
    // inner class for button event handling
    private class ButtonHandler implements ActionListener {
        // handle button event
        public void actionPerformed( ActionEvent event ) {
            if(event.getSource()==addB) {
                n.add(t1.getText());
                n.add(t2.getText());
                t1.setText("");
                t2.setText("");
            }
            if(event.getSource()==addS) {
                int i;
                i=n.indexOf(t1.getText());
                if(i==-1)
                    JOptionPane.showMessageDialog(null,"Student not found","Error",0);
                else {
                    n.get(i+1);
                    t2.setText((String)n.get(i+1));
                }
            }
            if(event.getSource()==exitB)
                System.exit(0);
        } // end method actionPerformed
    } // end private inner class ButtonHandler
} // end class Button