import java.util.*;

class prime_num
{
    public static void main( String args[] )
    {
        Scanner sc = new Scanner( System.in );

        int n;
        System.out.print("Enter The Number Till Which You Want Prime Numbers: ");
        n = sc.nextInt();

        for( int i = 1; i <= n; i++ )
        {
            int count = 0;

            for( int j = 1; j <= n; j++ )
            {
                if( i % j == 0 )
                {
                    count++;
                }
            }

            if( count == 2 )
            {
                System.out.print( i + " ");
            }
        }

    }
}