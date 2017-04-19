class ex_handl
{//class
    public static void main()
    {//main
        int a=10;
        int b=0;
        int c;
        int arr[]={1,2,3};
        try
        {
            c=a/b;
            c=arr[4];
            String s="abc";  
            int i=Integer.parseInt(s);
        }
        catch(ArithmeticException e)
        {
            System.err.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println(e);
        }
        catch(NumberFormatException e)
        {
            System.err.println(e);
        }
        System.out.println("Done");
    }//main
}//class