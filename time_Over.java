import java.io.*;
class time_Over
{//class
    int h,m,s;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    time_Over()
    {//const
        h=m=0;
    }//const
    time_Over(int a,int b,int c)
    {//const
        h=a;
        m=b;
        s=c;
    }//const
    void display()throws IOException
    {//disp
        System.out.println("Enter 1 for 12 hour format, 2 for 24-hour format");
        int ch=Integer.parseInt(br.readLine());
        switch(ch)
        {//switch
            case 1 : if(h<12)
            {//if
                System.out.println(h+":"+m+":"+s);
            }//if
            else
            {//else
                System.out.println((h-12)+":"+m+":"+s);
            }//else
            break;
            case 2 : if(h>12)   System.out.println(h+":"+m+":"+s);
            else    System.out.println((h+12)+":"+m+":"+s);
            break;
            default : System.out.println("Wrong choice");
        }//switch
    }//disp
    public static void main()throws IOException
    {//main
        System.out.println("Enter the hour in hh format");
        int h=Integer.parseInt(br.readLine());
        System.out.println("Enter the min in mm format");
        int m=Integer.parseInt(br.readLine());
        System.out.println("Enter the sec in ss format");
        int s=Integer.parseInt(br.readLine());
        time_Over obj=new time_Over(h,m,s);
        obj.display();
    }//main
}//class