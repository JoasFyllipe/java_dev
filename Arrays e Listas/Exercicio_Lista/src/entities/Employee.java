package entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(){

    }
    public Employee (int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void increaseSalary(double percentage){
        salary += salary * percentage /100;
    }

    public String toString(){
        return id + ", "+ name + ", "+ String.format("%.2f", salary);
    }
}
