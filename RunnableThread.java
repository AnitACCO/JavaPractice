import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.Date;

class FileWriter implements Runnable{

    String fname;
    String input;
    FileWriter(String f,String i){
        this.fname = f;
        this.input = i;
     }
    public void writetoFile(String input, String fname){
        try(BufferedWriter wr = new BufferedWriter(new java.io.FileWriter(new File(fname)))) {
            System.out.println("Start : " + System.currentTimeMillis());
            Thread.sleep(1000);
            input = getContent(input);
            wr.write(input);
            System.out.println("File Created" + fname);
            System.out.println("End : " + System.currentTimeMillis());

        } catch (FileNotFoundException e){
            throw  new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    private String getContent(String input){
        StringBuffer sb = new StringBuffer(input);
        for(int i = 0; i < 10000 ; i++){
            sb.append(input);
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public void run(){
        System.out.println("Executed by " + Thread.currentThread().getState() );
        writetoFile(input,fname);
    }
}

public class RunnableThread {
    public static void main(String[] args) {

        //int start =
        for(int i = 0; i<10;i++){
            String temp = "name " + String.valueOf(i) + ".txt";
            FileWriter filewritel = new FileWriter( temp,"Anit");
            Thread t1l = new Thread(filewritel);
            t1l.start();
        }

    }
}
