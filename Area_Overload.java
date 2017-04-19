import java.io.*;
class Area_Overload
{//class
    void area(int side)
    {//sq
        System.out.println("Area of square : "+(side*side));
    }//sq
    void area(int l,int b)
    {//rec
        System.out.println("Area of rectangle : "+(l*b));
    }//rec
    void area(int b,double h)
    {//tri
        System.out.println("Area of triangle : "+(0.5*b*h));
    }//tri
    public static void main()throws IOException
    {//main
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 for area of square, 2 for rectangle, 3 for triangle");
        int ch=Integer.parseInt(br.readLine());
        Area_Overload obj=new Area_Overload();
        switch(ch)
        {//switch
            case 1 : System.out.println("Enter side of the square");
            int s=Integer.parseInt(br.readLine());
            obj.area(s);
            break;
            case 2 : System.out.println("Enter the sides of rectangle");
            int l=Integer.parseInt(br.readLine());
            int h=Integer.parseInt(br.readLine());
            obj.area(l,h);
            break;
            case 3 : System.out.println("Enter base of triangle");
            int b=Integer.parseInt(br.readLine());
            System.out.println("Enter height");
            double ht=Double.parseDouble(br.readLine());
            obj.area(b,ht);
            break;
            default : System.out.println("Invalid Input");
        }//switch
    }//main
}//class