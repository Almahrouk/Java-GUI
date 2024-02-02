import java.util.Scanner;
public class _1_One {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int sum=0,grade,i=1;
        float avg=0;
        System.out.print("Enter your grade in Class number 1  ");
        grade=input.nextInt();
        while(grade>=0)
        {   sum+=grade;     //see page 131
            i++;
            System.out.printf("Enter your grade in Class number %d  ",i);
            grade=input.nextInt();

        }
        avg=sum/(i-1);
        System.out.printf("Your average is %.2f \n",avg);
        if(avg>=50)
            System.out.print("Pass");
        else
            System.out.print("Fail");

        input.close();

    }
}