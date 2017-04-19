import java.io.*;
class FileStream {
    public static void main()throws IOException {
        try {
            File inputFile = new File("first.txt");
            File outputFile = new File("third.txt");
            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile);
            int c;
            while ((c = fis.read()) != -1) {
                fos.write((char)c);
            }
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.err.println("FileStreamsTest: " + e);
        } catch (IOException e) {
            System.err.println("FileStreamsTest: " + e);
        }
        File oF=new File("third.txt");
        FileInputStream fis = new FileInputStream(oF);
        int c;
        while ((c = fis.read()) != -1) {
            System.out.print((char)c);
        }
        System.out.println();
    }
}