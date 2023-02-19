import java.util.*;
import java.io.*;

class Employee implements Comparable<Employee>{
    int e_id;
    int age;
    int temp;
    Employee(int e,int a,int t) {
        this.e_id = e;
        this.age = a;
        this.temp = t;
    }
    public int compareTo(Employee emp){
        if(temp==emp.temp)
            return 0;
        else if(temp>emp.temp)
            return 1;
        else
            return -1;
    }
}

public class ComparableTet {
    public static void main(String[] args) {
        ArrayList<Employee> al=new ArrayList<Employee>();
        al.add(new Employee(12,32,23));
        al.add(new Employee(23,24,12));
        al.add(new Employee(32,45,43));
        al.add(new Employee(63,34,46));
        al.add(new Employee(54,42,43));
        al.add(new Employee(32,32,32));
        al.add(new Employee(32,21,76));
        Collections.sort(al);
        for(Employee emp:al){
            System.out.println(emp.e_id+" "+emp.age+" "+emp.temp);
        }
    }
}
