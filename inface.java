interface A
{
    int sq(int n);
}
interface B
{
    int cube(int n);
}
public class inface implements A,B
{ 
    public int sq(int n)
    {
        return n*n;
    }
    public int cube(int n)
    {
        return n*n*n;
    }
    public static void main()
    {
        inface obj=new inface();
        System.out.println(obj.sq(5));
        System.out.println(obj.cube(5));
    }
}