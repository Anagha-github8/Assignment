package a2;

public class salaryCalculation
{
    static void printSalary(Employee e)
    {
        System.out.println(e.salary());
    }

    public static void main(String[] args)
    {
        Employee obj1 = new Manager();
        System.out.print("Manager's salary : ");
        printSalary(obj1);

        Employee obj2 = new labour();
        System.out.print("Clerk's salary : ");
        printSalary(obj2);
    }
}

class Employee
{
    public static int base = 20000;
    int salary()
    {
        return base;
    }
}

class Manager extends Employee
{
    int incentive = 35000;
    @Override
    int salary()
    {
        return base + incentive;
    }
}
class labour extends Employee
{
    int overtime = 15000;
    @Override
    int salary()
    {
        return base + overtime;
    }
}
