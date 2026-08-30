import java.util.*;

class add_2_matrices
{
    public static void main( String args[])
    {
        Scanner sc = new Scanner( System.in );

        int r;
        System.out.print("Enter Number Of Rows: ");
        r = sc.nextInt();

        int c;
        System.out.print("Enter Number Of Columns: ");
        c = sc.nextInt();

        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int result[][] = new int[r][c];

        System.out.println("Enter Your First Matrix: ");

        System.out.println("Enter " + (r*c) + " Element for " + r + "x " + c + "Matrix");

        for( int i = 0; i < r; i++ )
        {
            for( int j = 0; j < c; j++ )
            {
                System.out.print("Enter" + "[" + i + "][" + j + "] Element: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Your Second Matrix: ");

        System.out.println("Enter " + (r*c) + " Element for " + r + "x " + c + "Matrix");

        for( int i = 0; i < r; i++ )
        {
            for( int j = 0; j < c; j++ )
            {
                System.out.print("Enter" + "[" + i + "][" + j + "] Element : ");
                b[i][j] = sc.nextInt();
            }
        }

        for( int i = 0; i < r; i++ )
        {
            for( int j = 0; j < c; j++ )
            {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("The Addition of two matrices is: ");

        for( int i = 0; i < r; i++ )
        {
            for( int j = 0; j < c; j++ )
            {
                System.out.print(result[i][j] + "\t");
            }

            System.out.println();
        }
    }
}