import java.io.*;
public class FileTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("file1.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s ="elnfluowdo lbliw iwrivwi ilnelnl lewilnl ibewilb";
        byte b[]= s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Suucess");
    }
}
