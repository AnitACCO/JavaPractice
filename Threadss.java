class ThreadClass extends Thread{
    @Override
    public void run(){
        System.out.println("Print from Thread");
    }
}

public class Threadss extends Thread{
    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass();
        t1.start();
        //t1.start();
    }
}
