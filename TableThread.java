class Table extends Thread{
    int n;

    @Override
    public void run(){
        for(int i =1; i<=10;i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }

}

public class TableThread extends Thread{
    public static void main(String[] args) {
        Table t1 = new Table();
        for(int i = 2; i<= 10; i++){
            //t1.setn();
        }
    }
}
