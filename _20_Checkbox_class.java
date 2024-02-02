import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class _20_Checkbox_class extends JFrame {
    private JCheckBox c1;
    private JCheckBox c2;
    private JTextField t;
    public _20_Checkbox_class() {
        super( "Testing CheckBox" );
        setLayout( new FlowLayout() ); // set frame layout
        t=new JTextField("Font style change");
        t.setFont(new Font("Serif",Font.PLAIN,14));
        add(t);

        c1=new JCheckBox("Bold");
        c2=new JCheckBox("Italic");
        add(c1);
        add(c2);

        F h=new F();
        c1.addItemListener(h);
        c2.addItemListener(h);
    }

    private class F implements ItemListener {
        public void itemStateChanged(ItemEvent event) {
            Font s=null;
            if(c1.isSelected() && c2.isSelected())
                s= new Font("Serif",Font.BOLD+Font.ITALIC,14);

            else if(c1.isSelected())
                s= new Font("Serif",Font.BOLD,14);

            else if(c2.isSelected())
                s= new Font("Serif",Font.ITALIC,14);

            t.setFont(s);
        }
    }
}