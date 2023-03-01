import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    Scanner sc = new Scanner(System.in);
    @Override
    public void register(){
        System.out.println("Please enter the number of Employees: ");
        int n = sc.nextInt();
        GlobalData.empArr = new Employee[n];
        for (int i = 0; i < n; i++) {
            GlobalData.empArr[i] = fillEmployee();
        }
    }

    public Employee fillEmployee(){
        int id = 1;
        System.out.println("Please enter the name of the employee: ");
        String name = sc.next();
        System.out.println("Please enter the age of the employee: ");
        int age = sc.nextInt();
        System.out.println("Please enter the name of the department: ");
        String department = sc.next();
        System.out.println("Please enter the salary: ");
        int salary = sc.nextInt();
        return new Employee(name, age, department, salary, id++);
    }

    @Override
    public void show() {
        for (int i = 0; i < GlobalData.empArr.length; i++) {
            System.out.println(GlobalData.empArr[i].toString());
        }
    }
}
