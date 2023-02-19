class Printer extends Thread{
    @Override
    public void run(){
        for(int i = 1 ; i <=5; i++){
            System.out.println("Running from " + Thread.currentThread().getName() + " number " + i);;
        }
    }
}

public class Thread2 extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Printer p1 = new Printer();
        Printer p2 = new Printer();
        Printer p3 = new Printer();
        p1.setName("1 Printer");
        p1.start();
        p1.join();
        p2.setName("2 Printer");
        p2.start();
        p2.join();
        p3.setName("3 Printer");
        p3.start();

    }
}
