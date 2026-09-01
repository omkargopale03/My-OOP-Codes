import java.util.*;

class armstrong_number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner( System.in );

        int num;
        System.out.print("Enter Your Number: ");
        num = sc.nextInt();

        int temp = num ;
        int digits = 0;
        int sum = 0;

        while( temp != 0 )
        {
            temp = temp/10;
            digits++;
        }

        temp = num;

        while( temp != 0)
        {
            int remainder = temp%10;

            int powerresult = 1;

            for( int i = 0; i < digits; i++ )
            {
                powerresult = powerresult*remainder;
            }

            sum = sum + powerresult;

            temp = temp/10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number!");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
    }
}