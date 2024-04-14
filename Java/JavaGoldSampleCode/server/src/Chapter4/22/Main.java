// Comparatorインターフェースの利用
import java.util.*;
class Employee {
    private String name;
    private Integer id;
    public Employee(String name, Integer id){
        this.name = name; this.id = id;
    }
    public Integer getId() { return id; }
    public String getName() { return name; }
}

class MyRule implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        return e1.getId().compareTo((e2.getId()));
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("taro", 20);
        Employee e2 = new Employee("takayuki", 10);
        Employee e3 = new Employee("hiromi", 50);
        ArrayList<Employee> ary = new ArrayList<>();
        ary.add(e1); ary.add(e2); ary.add(e3);

        System.out.println("ArrayListのインデックス順での表示");
        print(ary);
        System.out.println("MyRuleで定義したid(昇順)での表示");
        Collections.sort(ary, new MyRule());
        print(ary);
        System.out.println("名前の文字数(昇順)での表示");
        Collections.sort(ary,
            new Comparator<Employee>() {
                public int compare(Employee e1, Employee e2){
                    return e1.getName().length() - e2.getName().length();
                }
            });
        print(ary);
    }
    private static void print(ArrayList<Employee> ary){
        for (Employee obj: ary){
            System.out.println(obj.getId() + " " + obj.getName());
        }
    }
}