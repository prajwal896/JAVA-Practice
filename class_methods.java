public class class_methods{
    static class employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    }
public static void main(String[] args){
employee prajwal = new employee();
prajwal.salary = 100;
prajwal.name = "abbaa";
System.out.println(prajwal.getSalary());
System.out.println(prajwal.getName());
}
}
