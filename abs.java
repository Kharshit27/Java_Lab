class abs extends eg
{
    public void show()
    {//show
        System.out.println("Abstract Class");
    }//show
    public static void main()
    {
        eg obj=new abs();
        obj.show();
    }
}
abstract class eg
{//class
    abstract void show();
}//class
