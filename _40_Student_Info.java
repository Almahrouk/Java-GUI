import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class _40_Student_Info extends JFrame {
    private GridLayout gridLayout;
    private JButton exitButton;
    private JButton addButton;
    private JButton searchButton;
    private JButton displayButton;
    private JLabel label;
    private JTextField studentNameTextField;
    private JTextField studentGradeTextField;
    private JButton hiddenButton1;
    private JButton hiddenButton2;
    private JButton hiddenButton3;
    private JList<String> categoryList;
    private JTextArea textArea;
    private List<String> category1List = new ArrayList<>();
    private List<String> category2List = new ArrayList<>();
    private List<String> category3List = new ArrayList<>();
    private static final String[] categories = {"Advanced Programming", "Embedded Systems", "Artificial Intelligence"};

    public _40_Student_Info() {
        super("Student Information Manager");

        gridLayout = new GridLayout(4, 3, 5, 5);
        getContentPane();
        setLayout(gridLayout);

        // Set up JLabel with an image
        Icon icon = new ImageIcon(getClass().getResource("b.jpg"));
        label = new JLabel("Student Grades", icon, SwingConstants.CENTER);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(label);

        hiddenButton1 = new JButton("  ");
        hiddenButton1.setVisible(false);
        add(hiddenButton1);

        hiddenButton2 = new JButton("  ");
        hiddenButton2.setVisible(false);
        add(hiddenButton2);

        studentGradeTextField = new JTextField("Student Grade (out of 100)", 20);
        studentGradeTextField.setHorizontalAlignment(JTextField.RIGHT);
        add(studentGradeTextField);

        studentNameTextField = new JTextField("Student Name", 20);
        studentNameTextField.setHorizontalAlignment(JTextField.RIGHT);
        add(studentNameTextField);

        addButton = new JButton("Add Student");
        add(addButton);

        hiddenButton3 = new JButton("  ");
        hiddenButton3.setVisible(false);
        add(hiddenButton3);

        searchButton = new JButton("Search");
        add(searchButton);

        displayButton = new JButton("Display");
        add(displayButton);

        exitButton = new JButton("Exit");
        add(exitButton);

        textArea = new JTextArea(10, 15);
        textArea.setEditable(false);
        add(new JScrollPane(textArea));

        categoryList = new JList<>(categories);
        categoryList.setVisibleRowCount(2);
        categoryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(categoryList));

        // Create new ButtonHandler for button event handling
        ButtonHandler handler = new ButtonHandler();
        addButton.addActionListener(handler);
        searchButton.addActionListener(handler);
        displayButton.addActionListener(handler);
        exitButton.addActionListener(handler);
    }

    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == addButton) {
                handleAddButton();
            } else if (event.getSource() == searchButton) {
                handleSearchButton();
            } else if (event.getSource() == exitButton) {
                System.exit(0);
            }
            // Add additional handling for other buttons if needed
        }

        private void handleAddButton() {
            int selectedIndex = categoryList.getSelectedIndex();
            String studentName = studentNameTextField.getText();
            String studentGrade = studentGradeTextField.getText();

            switch (selectedIndex) {
                case 0:
                    category1List.add(studentName);
                    category1List.add(studentGrade);
                    break;
                case 1:
                    category2List.add(studentName);
                    category2List.add(studentGrade);
                    break;
                case 2:
                    category3List.add(studentName);
                    category3List.add(studentGrade);
                    break;
            }

            studentNameTextField.setText("");
            studentGradeTextField.setText("");
        }

        private void handleSearchButton() {
            int selectedIndex = categoryList.getSelectedIndex();
            String studentName = studentNameTextField.getText();

            List<String> selectedCategoryList = getCategoryList(selectedIndex);

            int index = selectedCategoryList.indexOf(studentName);
            if (index == -1) {
                JOptionPane.showMessageDialog(null, "Student not found", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String studentGrade = selectedCategoryList.get(index + 1);
                studentGradeTextField.setText(studentGrade);
            }
        }

        private List<String> getCategoryList(int index) {
            switch (index) {
                case 0:
                    return category1List;
                case 1:
                    return category2List;
                case 2:
                    return category3List;
                default:
                    throw new IllegalArgumentException("Invalid index: " + index);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            _40_Lab_20_12_Class frame = new _40_Lab_20_12_Class();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 400);
            frame.setVisible(true);
        });
    }
}

