import java.io.*;
class max_min
{//class
    public static void main()throws IOException
    {//main
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[10];
        System.out.println("Enter elements of the array");
        for(int i=0;i<10;i++)
            arr[i]=Integer.parseInt(br.readLine());
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<10;i++)
        {//i
            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<min)
                min=arr[i];
        }//i
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
    }//main
}//class