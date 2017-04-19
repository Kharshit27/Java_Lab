import java.io.*;
class sortStr
{//class
    public static void main()throws IOException
    {//main
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a strings");
        String arr[]=new String[10];
        for(int i=0;i<arr.length;i++)
        {//i
            arr[i]=br.readLine();
        }//i
        for(int i=0;i<arr.length-1;i++)
        {//i
            for(int j=0;j<arr.length-1-i;j++)
            {//j
                if(arr[j].compareTo(arr[j+1])>0)
                {//if
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }//if
            }//j
        }//i
        for(int i=0;i<arr.length-1;i++)
        {//i
            System.out.print(arr[i]+" ");
        }//i
        System.out.println();
    }//main
}//class