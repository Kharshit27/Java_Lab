import java.io.*;
class str_func
{//class
    public static void main()throws IOException
    {//main
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two strings");
        String s=br.readLine();
        String s1=br.readLine();
        char arr[]=new char[10];
        System.out.println("Length of 1st : "+s.length());
        System.out.println("Length of 2st : "+s1.length());
        System.out.println("Compare : "+s.compareTo(s1));
        System.out.println("charAt s[0] : "+s.charAt(0));
        System.out.println("substring : "+s.substring(0,4));
        System.out.println("Concat : "+s.concat(s1));
        System.out.println("StartsWith : "+s.startsWith("T"));
        System.out.println("EndsWith : "+s.endsWith("."));
        System.out.println("indexOf : "+s.indexOf("."));
        System.out.println("lastIndexOf : "+s.lastIndexOf("e"));        
        System.out.println("Replace : "+s.replace("T","t"));
        System.out.println("Trim : "+s.trim());
        System.out.println("Equals : "+s.equals(s1));
        System.out.println("Equals Ignore Case: "+s.equalsIgnoreCase(s1));
        System.out.println("Lower Case : "+s.toLowerCase());
        System.out.println("Upper Case : "+s.toUpperCase());
        s.getChars(0,10,arr,0);
        System.out.print("getChars : ");
        for(int i=0;i<10;i++)
            System.out.print(arr[i]);
        System.out.println();
    }//main
}//class