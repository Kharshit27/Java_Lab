import java.io.*;
class mat_mul
{//class
    public static void main()throws IOException
    {//main
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr1[][]=new int[3][3];
        int arr2[][]=new int[3][3];
        System.out.println("Enter elements of array 1");
        for(int i=0;i<arr1.length;i++)
        {//i
            for(int j=0;j<arr1[i].length;j++)
            {//j
                arr1[i][j]=Integer.parseInt(br.readLine());
            }//j
        }//i
        System.out.println("Enter elements of array 2");
        for(int i=0;i<arr2.length;i++)
        {//i
            for(int j=0;j<arr2[i].length;j++)
            {//j
                arr2[i][j]=Integer.parseInt(br.readLine());
            }//j
        }//i
        int mul[][]=new int[3][3];
        int sum=0;
        for(int i=0;i<arr2.length;i++)
        {//i
            for(int j=0;j<arr2[i].length;j++)
            {//j
                for(int k=0;k<arr2.length;k++)
                {//k
                    sum=sum+(arr1[i][k]*arr2[k][j]);
                }//k
                mul[i][j]=sum;
                sum=0;
            }//j
        }//i                
        System.out.println("Multiplication : ");
        for(int i=0;i<arr2.length;i++)
        {//i
            for(int j=0;j<arr2[i].length;j++)
            {//j
                System.out.print(mul[i][j]+"\t");
            }//j
            System.out.println();
        }//i                
        System.out.println();
        for(int i=0;i<arr1.length;i++)
        {//i
            for(int j=0;j<arr1[i].length;j++)
            {//j
                System.out.print(arr1[i][j]+"\t");
            }//j
            System.out.println();
        }//i                
        System.out.println();
        for(int i=0;i<arr2.length;i++)
        {//i
            for(int j=0;j<arr2[i].length;j++)
            {//j
                System.out.print(arr2[i][j]+"\t");
            }//j
            System.out.println();
        }//i                
    }//main
}//class