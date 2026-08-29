import java.util.*;

class arithmetic_operations
{
    public static void main( String args[] )
    {
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.println("Enter The First Number: ");
        a = sc.nextInt();

        int b;
        System.out.println("Enter The Second Number: ");
        b = sc.nextInt();

        int c;
        System.out.println("Enter Which Operation You Want To Perform\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        c = sc.nextInt();

        switch(c){
            case 1: 
            System.out.println("Addition Of These Two Numbers Is: " + ( a + b ));
            break;

            case 2:
            System.out.println("Subtraction Of These Two Numbers Is: " + ( a - b ) );
            break;

            case 3:
            System.out.println("Multiplication Of These Two Numbers Is: " + ( a * b ));
            break;

            case 4:
            System.out.println("Division Of These Two Numbers Is: " + ( a/b ));
            break;
        }
    }
}