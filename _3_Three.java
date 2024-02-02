// import java.util.Arrays;
import java.util.Scanner;
public class _3_Three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c;
        int[] x;
        int n=0,i=0,max=-1;
        x = new int[26];
        
        // remember that ASCII of 'a' is 97
        do { 
            System.out.print("Enter any small letter or * to end ");
            c=input.next().charAt(0);
            if (c=='*')
                break;
            x[(c-'a')]++;
        }while(c!='*');
        input.close();

        for(i=0;i<26;i++) {   
            if ( max < x[i] ) {
                max=x[i];
                n=i;
            }
        }

        System.out.printf("The most repeated Letter is %s ",(char)('a' + n));
        
    }
}