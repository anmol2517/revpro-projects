import java.util.*;
import java.util.stream.*;

class emp{
    int id;
    String name;
    double salary;

    emp(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    double getSalary(){
        return salary;
    }
}

public class ClassSecondHighestSalary{
    public static void main(String[] args){
        ArrayList<emp> list = new ArrayList<>();


        list.add(new emp (1, "Aman", 1500));
        list.add(new emp (2, "Anjali", 2500));
        list.add(new emp (3, "Amrit", 2000));

        double secondHighest = list.stream().map(emp::getSalary).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(secondHighest);
    }
}
