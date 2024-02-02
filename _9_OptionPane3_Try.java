import javax.swing.JOptionPane; // program uses JOptionPane

public class _9_OptionPane3_Try {
    public static void main(String[] args) {
        int i=0, sum=0;
        String s1 ;
        String [] name=new String[50];
        String [] mark=new String[50];

        s1=JOptionPane.showInputDialog("Enter 1 to add students names and marks\nEnter 2 to calculate the average\nEnter 3 to exit");
        while(!s1.equals("3"))
        {
            switch (s1) {
                case "1":
                    s1=JOptionPane.showInputDialog("Enter student name or * to exit");
                    while (!s1.equals("*")){

                        try
                        {   name[i]=s1;
                            s1=JOptionPane.showInputDialog("Enter student mark");
                            mark[i]=s1;
                            sum+=Integer.parseInt(s1);

                            }
                        catch (NumberFormatException e) {
                                s1=JOptionPane.showInputDialog(null,"Make sure to Enter numbers. Enter student mark","Mark",0);
                                mark[i]=s1;
                                sum+=Integer.parseInt(s1);
                            }
                        i++;
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