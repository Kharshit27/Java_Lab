/*
 * 8 1 6
 * 3 5 7 
 * 4 9 2
 */
import java.io.*;
class magic_sq
{//class
    public static void main()throws IOException
    {//main
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[][]=new int[3][3];
        int sum_of_rows[]=new int[arr.length];
        int sum_of_cols[]=new int[arr[0].length];
        int sum_diag[]=new int[2];
        for(int i=0;i<arr.length;i++)
        {//i
            System.out.println("Enter elements of row "+(i+1));
            for(int j=0;j<arr[i].length;j++)
            {//j
                arr[i][j]=Integer.parseInt(br.readLine());
            }//j
        }//i
        for(int i=0;i<arr.length;i++)
        {//i
            for(int j=0;j<arr[i].length;j++)
            {//j
                sum_of_rows[i]=sum_of_rows[i]+arr[i][j];
                sum_of_cols[i]=sum_of_cols[i]+arr[j][i];
            }//j
        }//i
        //for(int i=0;i<sum_of_rows.length;i++)
        //    System.out.println("Sum of rows : "+sum_of_rows[i]);
        //for(int i=0;i<sum_of_cols.length;i++)
        //    System.out.println("Sum of cols : "+sum_of_cols[i]);
        for(int i=0;i<arr.length;i++)
        {//i
            for(int j=0;j<arr[0].length;j++)
            {//j
                if(i==j)
                    sum_diag[0]=sum_diag[0]+arr[i][j];
                if((i+j)==(arr.length-1))
                    sum_diag[1]=sum_diag[1]+arr[i][j];
            }//j
        }//i
        //System.out.println("Diagonals : "+sum_diag[0]+" "+sum_diag[1]);
        //for(int i=0;i<sum_diag.length;i++)
        //    System.out.println("Sum of cols : "+sum_of_cols[i]);
        int flag=1;
        for(int i=0;i<sum_of_rows.length;i++)
        {//i
            if(sum_of_rows[i]==sum_of_cols[i] && sum_of_cols[i]==sum_diag[0] && sum_diag[0]==sum_diag[1])
                continue;
            else
                flag=0;
        }//i
        if(flag==1)
            System.out.println("Magic Square");
        else
            System.out.println("Not Magic Square");
    }//main
}//class