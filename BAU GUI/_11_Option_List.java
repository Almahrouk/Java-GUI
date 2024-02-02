import javax.swing.JOptionPane; // program uses JOptionPane
import java.util.ArrayList;
import java.util.List;

public class _11_Option_List {
    public static void main(String[] args) {
        int i=0, sum=0;
        String s1 ;
        // List name=new ArrayList();
        // List mark=new ArrayList();
        // List<Object> name = new ArrayList<>();
        List<Object> mark = new ArrayList<>();
        List<String> name = new ArrayList<>();
        // List<Integer> mark = new ArrayList<>(); // Cannt Use add()

        s1=JOptionPane.showInputDialog("Enter 1 to add students names and marks\nEnter 2 to calculate the average\nEnter 3 to exit");
        while(!s1.equals("3"))
        {
            switch (s1) {
                case "1":
                    s1=JOptionPane.showInputDialog("Enter student name or * to exit");
                    while (!s1.equals("*")){

                        try
                        {   name.add(s1);
                            s1=JOptionPane.showInputDialog("Enter student mark");
                            mark.add(s1);
                            i++;
                            sum+=Integer.parseInt(s1);}
                        catch (NumberFormatException e) {
                            s1=JOptionPane.showInputDialog(null,"Make sure to Enter numbers. Enter student mark","Mark",0);
                            mark.add(s1);
                            sum+=Integer.parseInt(s1);
                        }

                        s1=JOptionPane.showInputDialog("Enter student name or * to exit");
                    }
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null,"The Average = "+ (float)sum/i);
                    break;
                default:
                    System.exit(0);            }

            s1=JOptionPane.showInputDialog("Enter 1 to add students names and marks\nEnter 2 to calculate the average\nEnter 3 to exit");
        }

    }
}