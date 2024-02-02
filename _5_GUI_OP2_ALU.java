import javax.swing.JOptionPane; // program uses JOptionPane
public class _5_GUI_OP2_ALU {
    public static void main(String[] args) {
        int a,b,res;
        String op,s1 ;

        s1=JOptionPane.showInputDialog(null, "Enter first number", "Calculator",1);
        a=Integer.parseInt(s1);

        op=JOptionPane.showInputDialog(null, "Enter operation * / + -", "Calculator",1);

        s1=JOptionPane.showInputDialog(null, "Enter second number", "Calculator",1);
        b=Integer.parseInt(s1);

        switch (op) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
            default:
                res = 0;
        }

        JOptionPane.showMessageDialog( null, "The result is "+res,"Result",1);

    }
}