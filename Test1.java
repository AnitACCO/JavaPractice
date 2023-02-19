import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Test1 {
    public static void main(String args[]){
        try{
            FileInputStream fin1 = new FileInputStream("C:/Users/anit.agrawal/Desktop/training/training/src/abc.txt");
            FileInputStream fin2 = new FileInputStream("C:/Users/anit.agrawal/Desktop/training/training/src/def.txt");
            FileOutputStream fout=new FileOutputStream("fileoutput.txt");
            int i;
            while((i=fin1.read())!= -1){
                fout.write(i);
            }
            while((i=fin2.read())!= -1){
                fout.write(i);
            }
            fout.close();
        }catch(Exception e){System.out.println(e);}
    }
}
