import java.io.*;
class modStr
{//class
    public static void main()throws IOException
    {//main
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String s=br.readLine();
        System.out.println("Enter the substring to be modified and replace string");
        String sb=br.readLine();
        String rep=br.readLine();
        s=s.replace(sb,rep);
        System.out.println(s);
    }//main
}//class