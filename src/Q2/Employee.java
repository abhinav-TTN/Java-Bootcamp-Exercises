package Q2;

public class Employee implements Comparable<Employee> {
    String Name;
    Integer Age;
    Double Salary;

    public Employee(Integer age, Double salary, String name) {
        this.Age = age;
        this.Salary = salary;
        this.Name = name;
    }

    @Override
    public int compareTo(Employee e) {
        //Splitting Name to first name and last name of the two objects
        String[] names1 = this.Name.split(" ");
        String[] names2 = e.Name.split(" ");

        //comparing first name
        int firstNameComparing = names1[0].compareToIgnoreCase(names2[0]);

        //if first name is same return last name comparision
        if(firstNameComparing != 0) {
            return firstNameComparing;
        }

        //else return first name comparison
        return names1[1].compareToIgnoreCase(names2[1]);
    }

    @Override
    public String toString() {
        return "Name: " + Name + "\n" +
                "Age: " + Age + "\n" +
                "Salary: " + Salary + "\n";
    }
}
