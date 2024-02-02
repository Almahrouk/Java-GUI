import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class _32_JList_Multiple_selection_Class extends JFrame {
    private JList<String> colorJList; // list to hold color names
    private JList<String> copyJList; // list to copy color names into
    private JButton copyJButton; // button to copy selected names
    private static final String[] colorNames = {
        "Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray",
        "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};

    // MultipleSelectionFrame constructor
    public _32_JList_Multiple_selection_Class() {
        super("Multiple Selection Lists");
        setLayout(new FlowLayout()); // set frame layout

        colorJList = new JList<>(colorNames); // holds names of all colors
        colorJList.setVisibleRowCount(5); // show five rows

        add(new JScrollPane(colorJList)); // add list with scrollpane

        copyJButton = new JButton("Copy >>>"); // create copy button
        copyJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                // place selected values in copyJList
                DefaultListModel<String> model = new DefaultListModel<>();
                for (String selectedValue : colorJList.getSelectedValuesList()) {
                    model.addElement(selectedValue);
                }
                copyJList.setModel(model);
            } // end method actionPerformed
        });

        add(copyJButton); // add copy button to JFrame

        copyJList = new JList<>(new DefaultListModel<>());
        copyJList.setVisibleRowCount(5); // show 5 rows
        copyJList.setFixedCellWidth(100); // set width
        copyJList.setFixedCellHeight(15); // set height
        copyJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        // copyJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyJList)); // add list with scrollpane
    } // end MultipleSelectionFrame constructor
} // end class MultipleSelectionFrame
