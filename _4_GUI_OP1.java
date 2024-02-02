import javax.swing.JOptionPane; // program uses JOptionPane
public class _4_GUI_OP1 {
    public static void main(String[] args) {
        int sum=0;

        String s1 ;
        s1= JOptionPane.showInputDialog("Enter first number");

        s1 = JOptionPane.showInputDialog("Enter first number",5);

        s1 = JOptionPane.showInputDialog(null,"Enter first number",5);

        s1 = JOptionPane.showInputDialog(null,"Enter first number","Title",JOptionPane.INFORMATION_MESSAGE);

        s1 = JOptionPane.showInputDialog(null,"Enter first number","Title",3);

        // see page 555
        //-1 no icon
        //0  ERROR_MESSAGE
        //1 INFORMATION_MESSAGE
        //2 WARNING_MESSAGE
        //3 QUESTION_MESSAGE

        //Must use int number1 = Integer.parseInt( s1 );
        System.out.println(s1);

        JOptionPane.showMessageDialog( null, "The sum is ");

        JOptionPane.showMessageDialog( null, "The sum is ","Title",-1);

        JOptionPane.showMessageDialog( null, "The sum is "+sum,"Title <sum>",JOptionPane.INFORMATION_MESSAGE);
//  See page 555 second table
    }
}