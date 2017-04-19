import java.io.*;
public class multiIn extends Student
{//class
    public static void main(String args[])throws IOException
    {//main
        multiIn obj=new multiIn();
        obj.inputs();
        obj.inputp();
        obj.inputi();
        obj.displays();
        obj.displayp();
        obj.displayi();
    }//main
}//class
class Develop
{//class
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String details[]=new String[4];
    void input()throws IOException
    {//input
        System.out.println("Enter Project_Name/Tool_Used/Purpose/Usability");
        for(int i=0;i<details.length;i++)
        {//i
            details[i]=br.readLine();
        }//i
    }//input
    void display()
    {//disp
        for(int i=0;i<details.length;i++)
        {//i
            System.out.print(details[i]+" ");
        }//i
        System.out.println();
    }//disp
}//class 
class Intern extends Develop
{//class
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String details[]=new String[3];
    void inputi()throws IOException
    {//input
        System.out.println("Enter Company/Duration/Stipend");
        for(int i=0;i<details.length;i++)
        {//i
            details[i]=br.readLine();
        }//i
        super.input();
    }//input
    void displayi()
    {//disp
        for(int i=0;i<details.length;i++)
        {//i
            System.out.print(details[i]+" ");
        }//i
        System.out.println();
        super.display();
    }//disp
}//class
class Placed extends Intern
{//class
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String details[]=new String[3];
    void inputp()throws IOException
    {//input
        System.out.println("Enter Company/Joining Date/Salary");
        for(int i=0;i<details.length;i++)
        {//i
            details[i]=br.readLine();
        }//i
    }//input
    void displayp()
    {//disp
        for(int i=0;i<details.length;i++)
        {//i
            System.out.print(details[i]+" ");
        }//i
        System.out.println();
    }//disp
}//class
class Student extends Placed
{//class
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String details[]=new String[3];
    void inputs()throws IOException
    {//input
        System.out.println("Enter Name/Reg. ID/DOB");
        for(int i=0;i<details.length;i++)
        {//i
            details[i]=br.readLine();
        }//i
    }//input
    void displays()
    {//disp
        for(int i=0;i<details.length;i++)
        {//i
            System.out.print(details[i]+" ");
        }//i
        System.out.println();
    }//disp
}//class
