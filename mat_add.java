import java.io.*;
class mat_add
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
        int add[][]=new int[3][3];
        for(int i=0;i<add.length;i++)
        {//i
            for(int j=0;j<add[i].length;j++)
            {//j
                add[i][j]=arr1[i][j]+arr2[i][j];
            }//j
        }//i
        System.out.println("Sum is :");
        for(int i=0;i<add.length;i++)
        {//i
            for(int j=0;j<add[i].length;j++)
            {//j
                System.out.print(add[i][j]+"\t");
            }//j
            System.out.println();
        }//i        
    }//main
}//class