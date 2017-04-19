import java.io.*;
class CopyFile
{
    public static void main()throws IOException
    {
        PrintWriter writer = new PrintWriter("first.txt");
        writer.println("The first line");
        writer.println("The second line");
        writer.close();
        PrintWriter writer2 = new PrintWriter("second.txt");
        try(BufferedReader br = new BufferedReader(new FileReader("first.txt"))) {
            String line=br.readLine();
            System.out.println("Contents of file 1 : ");
            while (line != null) {
                writer2.println(line);
                System.out.println(line);
                line=br.readLine();
            }
        }catch (FileNotFoundException e) {
            // do something
            System.out.println("Not Found File");
        }
        writer2.close();
        try(BufferedReader br = new BufferedReader(new FileReader("second.txt"))) {
            String line = br.readLine();
            System.out.println("Contents of file 2 : ");
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }catch (FileNotFoundException e) {
            // do something
            System.out.println("Not Found File");
        }
    }
}