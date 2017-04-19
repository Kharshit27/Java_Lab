import java.io.*;
class sBuff
{//class
    public static void main()throws IOException
    {//main
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb=new StringBuffer("This is an example line");
        System.out.println("Append : "+sb.append("Hello"));
        System.out.println("Insert : "+sb.insert(4," @#$ "));
        System.out.println("Replace : "+sb.replace(0,4,"WOW"));
        System.out.println("Delete : "+sb.delete(0,3));
        System.out.println("Capacity : "+sb.capacity());
        sb.ensureCapacity(41);
        System.out.println("Ensure Capacity : "+sb.capacity());
        System.out.println("Reverse : "+sb.reverse());
        sb.setLength(10);
        System.out.println("setLength : "+sb);
        System.out.println("charAt : "+sb.charAt(0));
        sb.setCharAt(0,'Z');
        System.out.println("setCharAt : "+sb);
    }//main
}//class