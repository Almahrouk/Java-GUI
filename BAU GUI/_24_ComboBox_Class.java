
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
//import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class _24_ComboBox_Class extends JFrame {

    private JComboBox<String> c;
    private JLabel l;
    private static final String[] n = {"c1.png", "c2.png"};
    private Icon[] icons = {
        new ImageIcon(getClass().getResource(n[0])),
        new ImageIcon(getClass().getResource(n[1]))
    };

    public _24_ComboBox_Class() {
        super("Testing ComboBox");
        setLayout(new FlowLayout()); // set frame layout
        c = new JComboBox<>(n);
        c.setMaximumRowCount(2);
        add(c);
        l = new JLabel(icons[0]);
        add(l);

        c.addItemListener(
            new ItemListener() {
                public void itemStateChanged(ItemEvent event) {
                    //if (event.getStateChange() == ItemEvent.SELECTED)
                    l.setIcon(icons[c.getSelectedIndex()]);
                }
            }
        );
    }
}