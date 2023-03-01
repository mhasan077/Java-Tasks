public class Employee extends Person {
    private String department;
    private int id;
    private int salary;

    public Employee(String name, int age, String department, int salary, int id) {
        name = this.getFullName();
        age = this.getAge();
        department = this.department;
        salary = this.salary;
        id = this.id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + getFullName()  +
                ", age=" + getAge() +
                ", department='" + department  +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
