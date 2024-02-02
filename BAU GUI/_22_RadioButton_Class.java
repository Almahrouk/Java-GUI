
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;

public class _22_RadioButton_Class extends JFrame {

    private JRadioButton b1;
    private JRadioButton b2;
    private JTextField t;
    private ButtonGroup g;
    private Font f1;
    private Font f2;

    public _22_RadioButton_Class() {
        super( "Testing RadioButton" );
        setLayout( new FlowLayout() ); // set frame layout
        t=new JTextField("Font style change",10);
        t.setFont(new Font("Serif",Font.PLAIN,14));
        add(t);

        b1=new JRadioButton("Bold",false);
        b2=new JRadioButton("Italic",false);
        add(b1);
        add(b2);

        g=new ButtonGroup();
        g.add(b1);
        g.add(b2);

        f1=new Font("Serif",Font.BOLD,14);
        f2=new Font("Serif",Font.ITALIC,14);

        b1.addItemListener(new F(f1));
        b2.addItemListener(new F(f2));	}

    private class F implements ItemListener {	
        private Font f3;
        public F(Font ff) {
            f3=ff;	
        }
        public void itemStateChanged(ItemEvent event) {
            t.setFont(f3);
        }
    }
}