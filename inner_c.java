import java.io.*;
class inner_c
{//class
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static String name;
    static class inner
    {//inner
        int marks;
        inner()
        {//inner
            marks=0;
        }//inner
        void input()throws IOException
        {//input
            System.out.println("Enter marks");
            marks=Integer.parseInt(br.readLine());
        }//input
    }//inner
    inner_c()
    {//const
        name="";
    }//const
    void input()throws IOException
    {//input
        System.out.println("Enter the name");
        name=br.readLine();
    }//input
    public static void main()throws IOException
    {//main
        inner_c obj=new inner_c();
        inner ob=new inner();
        obj.input();
        ob.input();
        System.out.println("Name : "+name+"\nMarks : "+ob.marks);
    }//main
}//class