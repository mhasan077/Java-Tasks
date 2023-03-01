import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    Scanner sc = new Scanner(System.in);
    int l = GlobalData.empArr.length;
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
        for (int i = 0; i < l; i++) {
            System.out.println(GlobalData.empArr[i].toString());
        }
    }

    @Override
    public void update() {
        System.out.println("Enter the id of the user you want to update");
        int idIn = sc.nextInt();
        for (int i = 0; i < l; i++) {
            if (GlobalData.empArr[i].getId() == idIn){
                System.out.println("Which fields of the user you want to update");
                String input = sc.next();
                String in[] = input.split(", ");
                for (int j = 0; j < in.length; j++) {
                    if (in[i].equalsIgnoreCase("fullname")){
                        System.out.println("Enter the new name");
                        String n = sc.next();
                        GlobalData.empArr[i].fullName = n;
                    }
                    if (in[i].equalsIgnoreCase("age")){
                        System.out.println("Enter the new age");
                        int a = sc.nextInt();
                        GlobalData.empArr[i].age = a;
                    }
                    if (in[i].equalsIgnoreCase("department")){
                        System.out.println("Enter the new department");
                        String d = sc.next();
                        GlobalData.empArr[i].department = d;
                    }
                    if (in[i].equalsIgnoreCase("salary")){
                        System.out.println("Enter the new salary");
                        int s = sc.nextInt();
                        GlobalData.empArr[i].salary = s;
                    }
                    if (in[i].equalsIgnoreCase("id")){
                        System.out.println("Enter the new id");
                        int id = sc.nextInt();
                        GlobalData.empArr[i].id = id;
                    }
                }
            }
            else
                System.out.println("There is no such user");
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter the id of the user you want to delete");
        int idIn = sc.nextInt();
        for (int i = 0; i < l; i++) {
            if (GlobalData.empArr[i].id == idIn){
                GlobalData.empArr[i] = GlobalData.empArr[l];
                Employee empAr[];
                empAr = new Employee [l - 1];
            }
            else {
                System.out.println("There is no such user");
            }
        }
    }

    @Override
    public void findByName(){
        System.out.println("Search for the name");
        String searchName = sc.next();
        for (int i = 0; i < l; i++) {
            if (GlobalData.empArr[i].fullName.contains(searchName)){
                System.out.println(GlobalData.empArr[i].fullName);
            }
        }
    }

    @Override
    public void getTotalEmployee() {
        System.out.println("The total number of registered employees is " + l + ".");
    }


}
