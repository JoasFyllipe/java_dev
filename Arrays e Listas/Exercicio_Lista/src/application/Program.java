package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i=0; i< n; i++){
            System.out.println();
            System.out.println("Employee #"+ (i+1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)){ // caso o id informado já exista na lista, repete para informar outro id.
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            list.add(employee);
        }
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int empId = sc.nextInt();

        Employee employee = list.stream().filter(x -> x.getId() == empId).findFirst().orElse(null); // busca o 1° id na lista que seja igual o id informado

        //Integer pos = positionId(list, empId); - Utiliza a function positionId que faz quase igual a linha 44

        if(employee == null){
            System.out.println("This id does not exist!");
        }
        else{
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            employee.increaseSalary(percent); // adiciona o aumento no salário
        }

        System.out.println();
        System.out.println("List of employees: ");
        for ( Employee emp: list){
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer positionId (List<Employee> list, int id) { // retorna a posição do id na lista
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, int id){ // retorna true caso o id exista e seja diferente de NULL
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employee != null;
    }
}
