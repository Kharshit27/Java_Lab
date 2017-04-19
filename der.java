import java.io.*;
class der extends acc_cont
{//der
    void add()
    {//add
        System.out.println("b(private) cant be accessed in derived class. Sum of a and c : "+(a+c));
    }//add
    void input()throws IOException
    {//input
        super.input();
    }//input
    public static void main()throws IOException
    {//main
        der obj=new der();
        obj.input();
        obj.add();
    }//main
}//der
class acc_cont
{//class
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public int a;
    private int b;
    protected int c;
    acc_cont()
    {//const
        a=b=c=0;
    }//const
    void input()throws IOException
    {//input
        System.out.println("Enter three values");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
    }//input
}//class
