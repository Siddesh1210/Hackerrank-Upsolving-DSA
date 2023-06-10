import java.util.Arrays;

public class MatrixGenerator {
    public static void main(String[] args) {
        int arr[][]=new int[4][4];
        int n=4;
        int number=1;
        int rs=0;
        int cs=0;
        int re=n-1;
        int ce=n-1;


        while(rs<=re && cs<=ce)
        {
            for(int j=rs;j<=ce;j++)
            {
                arr[rs][j]=number;
                number++;
            }

            for(int i=rs+1;i<=ce;i++)
            {
                arr[i][ce]=number;
                number++;
            }

            for(int j=ce-1;j>=cs;j--)
            {
                if(rs==re) break;
                arr[re][j]=number;
                number++;
            }

            for(int i=re-1;i>=rs+1;i--)
            {
                if(cs==ce) break;
                arr[i][cs]=number;
                number++;
            }
            rs++;
            cs++;
            re--;
            ce--;
        }


        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr.length;j++)
        //     {
        //         arr[i][j]=number;
        //         number++;
        //     }
        // }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
