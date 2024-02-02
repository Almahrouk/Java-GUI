import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
public class _10_List {
    public static void main(String[] args) {
        String s1;
        // int n;
        // List x=new ArrayList();
        //List<String> x = new ArrayList<>();
        List<Object> x = new ArrayList<>();

        s1= JOptionPane.showInputDialog("Enter students names and marks");
        x.add(s1);
        x.add(90);
        x.add("name");
        x.remove(2);
        System.out.println(x.get(0));
        System.out.println((int)(x.get(1))+5);
        //x.clear();
        System.out.println(x.size());
        System.out.println(x);
    }
}