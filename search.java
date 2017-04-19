import java.io.*;
class search
{//class
    public static void main()throws IOException
    {//main
        int arr[]=new int[10];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter elements of the array");
        for(int i=0;i<10;i++)
            arr[i]=Integer.parseInt(br.readLine());
        System.out.println("Enter search value");
        int x=Integer.parseInt(br.readLine());
        int flag=0;
        for(int i=0;i<10;i++)
        {//i
            if(arr[i]==x)
            {//if
                System.out.println("Found at : "+i);
                flag=1;
            }///if
        }//i
        if(flag==0)
            System.out.println("Not Found");
    }//main
}//class