import java.io.*;
class FileDir
{
    public static void main()throws IOException
    {
        File folder = new File("C:\\Users\\Harshit Goel\\Downloads\\DOWNLOADS");
        File listOfFiles[] = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
    }
}