import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class _26_List_Class extends JFrame {

    private JList<String> l;
    private static final String[] c = {"Black", "Blue", "Red", "Cyan", "Pink"};
    private static final Color[] co = {Color.BLACK, Color.BLUE, Color.RED, Color.CYAN, Color.PINK};

    public _26_List_Class() {
        super("Testing List");
        setLayout(new FlowLayout()); // set frame layout
        l = new JList<>(c);
        l.setVisibleRowCount(2);
        l.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(l);
        add(new JScrollPane(l));

        l.addListSelectionListener( new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                getContentPane().setBackground(co[l.getSelectedIndex()]);
            }
        });
    }
}