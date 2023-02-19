class PrintNumber extends Thread{

    int remainder;
    final int PRINT_UPTO_NUMBER = 10;
    static int number = 1;
    static Object lock = new Object();
    PrintNumber(int remainder){
        this.remainder = remainder;
    }
    @Override
    public void run() {
        while(number < PRINT_UPTO_NUMBER){
            synchronized (lock){
                if(number%3 != remainder){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else {
                    System.out.println("Running from " + Thread.currentThread().getName() + " number " + number);
                    number++;
                    lock.notifyAll();
                }
            }
        }
    }
}
public class ThreadTest extends Thread{

    public static void main(String[] args) throws InterruptedException {
        PrintNumber printer = new PrintNumber(2);
        printer.setName("3n+ 2 Printer");
        printer.start();
        PrintNumber printer2 = new PrintNumber(1);
        printer2.setName("3n+1 Printer");
        printer2.start();
        PrintNumber printer3 = new PrintNumber(0);
        printer3.setName("3n Printer");
        printer3.start();

    }
}
