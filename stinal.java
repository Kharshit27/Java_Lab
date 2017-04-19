import java.io.*;
class stinal
{//class
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static String name;
    final int marks=90;
    void input()throws IOException
    {//input
        System.out.println("Enter name : ");
        name=br.readLine();
    }//input
    void display()
    {//disp
        System.out.println("Name : "+name+"\nMarks : "+marks);
    }//disp
    public static void main()throws IOException
    {//main
        stinal obj=new stinal();
        obj.input();
        obj.display();
        eg ob=new eg();
        ob.newM();
    }//main
}//class
class eg
{//class
    final void newM()
    {//newM
        int m=95;
        System.out.println("New marks are : "+m);
    }//newM
}//class