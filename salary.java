import java.io.*;
class salary
{//class
    public static void main()throws IOException
    {//main
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name and reg ID");
        String name=br.readLine();
        String id=br.readLine();
        System.out.println("Enter basic pay");
        double bp=Double.parseDouble(br.readLine());
        double da=0.5*bp;
        double hra=0.25*bp;
        double pf=0.1*bp;
        double cca=240;
        double salary=bp-da+hra+pf+cca;
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Basic Pay : "+bp);
        System.out.println("Net salary : "+salary);
    }//main
}//class