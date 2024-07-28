import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;
    private char gender;
    private int doj;
    private int exp;

    public Employee(String name, int age, String department, double salary, char gender, int doj, int exp) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.gender = gender;
        this.doj = doj;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public char getgender() {
        return gender;
    }

    public int getdoj() {
        return doj;
    }

    public int getexp() {
        return exp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}

public class Employee_Data {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30, "IT", 50000, 'M', 2015, 10));
        employees.add(new Employee("Alice", 28, "HR", 55000, 'F', 2010, 5));
        employees.add(new Employee("Bob", 35, "Finance", 60000, 'M', 2011, 1));
        employees.add(new Employee("Carol", 32, "IT", 52000, 'F', 2013, 3));
        employees.add(new Employee("David", 40, "Finance", 70000, 'M', 2015, 2));

        // How many male and female employees are there in the organization?
        int no_of_males = (int) employees.stream().filter(employee -> employee.getgender() == 'M').count();
        int no_of_females = (int) employees.stream().filter(employee -> employee.getgender() == 'F').count();
        System.out.println("No of males:- " + no_of_males + "\n" + "No of females:- " + no_of_females);

        // Print the name of all departments in the organization.
        List<String> list = employees.stream().map(Employee::getDepartment).collect(Collectors.toList());
        System.out.println("List of departments:-");
        list.forEach(element -> System.out.print(element + ","));
        System.out.println();

        // What is the average age of male and female employees?

        int avg_male = (int) employees.stream().filter(element -> element.getgender() == 'M')
                .mapToInt(element -> element.getAge()).average()
                .orElse(0);
        int avg_female = (int) employees.stream().filter(element -> element.getgender() == 'F')
                .mapToInt(element -> element.getAge()).average()
                .orElse(0);
        System.out.println(
                "Average of male employees:- " + avg_male + "\n" + "Average of female employees:- " + avg_female);

        // Get the details of highest paid employee in the organization
        List<Double> salary = employees.stream().map(Employee::getSalary).collect(Collectors.toList());
        Double maxSalary = salary.stream().max(Double::compareTo).orElse(0.0);
        System.out.println(maxSalary);

        // Get the names of all employees who have joined after 2015
        employees.stream().filter(element -> element.getdoj() == 2015)
                .forEach(element -> System.out.println(element.getName()));

        // Count the number of employees in each department
        Map<String, Long> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        map.forEach((department, count) -> System.out.println(department + ": " + count));

        // What is the average salary of each department?
        Map<String, Double> salaryMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        salaryMap.forEach((department, count) -> System.out.println(department + ": " + count));

        // Who has the most working experience in the organization?
        Optional<Integer> high_exp = employees.stream().map(Employee::getexp).max(Integer::compareTo);
        System.out.println(high_exp.get());

        // Get the details of youngest male employee in the each department.
        Optional<Integer> young_emp = employees.stream().map(Employee::getAge).min(Integer::compareTo);
        System.out.println(young_emp.get());

        // What is the average salary and total salary of the whole organization?
        double total_salary = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
        double average_salary = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Total Salary of the Organization:- " + total_salary + "\n"
                + "Average Salary of the Organization:- " + average_salary);
    }
}
